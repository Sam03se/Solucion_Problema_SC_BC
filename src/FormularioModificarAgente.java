import javax.swing.*;

public class FormularioModificarAgente extends JFrame {
    private JPanel SCJBpanelModificar;
    public JTextField SCJBtxtIdBuscar;
    public JTextField SCJBtxtNombre;
    public JTextField SCJBtxtMision;
    public JComboBox<Integer> SCJBcomboPeligro;
    public JTextField SCJBtxtPago;
    public JButton SCJBbtnBuscar;
    public JButton SCJBbtnModificar;

    public FormularioModificarAgente(GestorAgentes gestor) {
        setTitle("CUENCABRAZALES SECURE - Modificar Agente");
        setContentPane(SCJBpanelModificar);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        for (int i = 1; i <= 5; i++) SCJBcomboPeligro.addItem(i);

        SCJBbtnBuscar.addActionListener(e -> {
            String id = SCJBtxtIdBuscar.getText();
            Agente a = gestor.buscarAgente(id);
            if (a != null) {
                SCJBtxtNombre.setText(a.getNombre());
                SCJBtxtMision.setText(a.getMision());
                SCJBcomboPeligro.setSelectedItem(a.getPeligrosidad());
                SCJBtxtPago.setText(String.valueOf(a.getPagoMensual()));
            } else {
                JOptionPane.showMessageDialog(this, "Agente no encontrado.");
            }
        });

        SCJBbtnModificar.addActionListener(e -> {
            try {
                String id = SCJBtxtIdBuscar.getText();
                String nombre = SCJBtxtNombre.getText();
                String mision = SCJBtxtMision.getText();
                int peligro = (int) SCJBcomboPeligro.getSelectedItem();
                double pago = Double.parseDouble(SCJBtxtPago.getText());

                boolean actualizado = gestor.modificarAgente(id, nombre, mision, peligro, pago);
                if (actualizado) {
                    JOptionPane.showMessageDialog(this, "Agente modificado correctamente.");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Error al modificar.");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        });

        setVisible(true);
    }
}