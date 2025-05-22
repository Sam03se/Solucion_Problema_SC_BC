import javax.swing.*;

public class PanelListaAgentes extends JFrame {
    private JPanel SCJBpanelLista;
    private JTextArea SCJBtxtLista;
    private JScrollPane SCJBscrollPane;

    public PanelListaAgentes(GestorAgentes gestor) {
        setTitle("CUENCABRAZALES SECURE - Lista de Agentes");
        setContentPane(SCJBpanelLista);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        StringBuilder lista = new StringBuilder();
        for (Agente a : gestor.getLista()) {
            lista.append("ID: ").append(a.getId()).append("\n");
            lista.append("Nombre: ").append(a.getNombre()).append("\n");
            lista.append("Misión: ").append(a.getMision()).append("\n");
            lista.append("Peligrosidad: ").append(a.getPeligrosidad()).append("\n");
            lista.append("Pago mensual: $").append(a.getPagoMensual()).append("\n\n");
        }

        SCJBtxtLista.setText(lista.toString());
        SCJBtxtLista.setEditable(false);

        setVisible(true);
    }
}