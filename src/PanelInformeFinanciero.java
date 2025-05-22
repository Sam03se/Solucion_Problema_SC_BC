import javax.swing.*;

public class PanelInformeFinanciero extends JFrame {
    private JPanel SCJBpanelInforme;
    private JTextArea SCJBtxtInforme;
    private JScrollPane SCJBscrollPane;

    public PanelInformeFinanciero(GestorAgentes gestor) {
        setTitle("CUENCABRAZALES SECURE - Informe Financiero");
        setContentPane(SCJBpanelInforme);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        StringBuilder informe = new StringBuilder();
        for (Agente a : gestor.getLista()) {
            informe.append("Nombre: ").append(a.getNombre()).append("\n");
            informe.append("Pago mensual: $").append(a.getPagoMensual()).append("\n");
            informe.append("Aporte fondo: $").append(a.getAporteFondo()).append("\n");
            informe.append("Impuesto anual: $").append(a.getImpuestoAnual()).append("\n");
            informe.append("Pago neto mensual: $").append(a.getPagoNeto()).append("\n\n");
        }

        SCJBtxtInforme.setText(informe.toString());
        SCJBtxtInforme.setEditable(false);

        setVisible(true);
    }
}
