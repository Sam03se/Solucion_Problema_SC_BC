import javax.swing.*;

public class FormularioAgente extends JFrame {
    private JPanel SCJBpanelFormulario;
    public JTextField SCJBtxtId;
    public JTextField SCJBtxtNombre;
    public JTextField SCJBtxtMision;
    public JComboBox<Integer> SCJBcomboPeligro;
    public JTextField SCJBtxtPago;
    public JButton SCJBbtnGuardar;

    public FormularioAgente(GestorAgentes gestor) {
        setTitle("CUENCABRAZALES SECURE - Registro de Agente");
        setContentPane(SCJBpanelFormulario);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        for (int i = 1; i <= 5; i++) SCJBcomboPeligro.addItem(i);

        SCJBbtnGuardar.addActionListener(e -> {
            try {
                String id = SCJBtxtId.getText().trim();
                String nombre = SCJBtxtNombre.getText().trim();
                String mision = SCJBtxtMision.getText().trim();
                int peligro = (int) SCJBcomboPeligro.getSelectedItem();
                double pago = Double.parseDouble(SCJBtxtPago.getText().trim());

                Agente nuevo = new Agente(id, nombre, mision, peligro, pago);
                gestor.agregarAgente(nuevo);

                JOptionPane.showMessageDialog(this, "Agente registrado correctamente.");
                dispose();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al registrar: " + ex.getMessage());
            }
        });

        setVisible(true);
    }
}