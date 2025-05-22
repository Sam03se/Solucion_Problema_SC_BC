import javax.swing.*;

public class FormularioAgente extends JFrame {
    private JPanel panelFormulario;
    public JTextField txtId;
    public JTextField txtNombre;
    public JTextField txtMision;
    public JComboBox<Integer> comboPeligro;
    public JTextField txtPago;
    public JButton btnGuardar;

    public FormularioAgente(GestorAgentes gestor) {
        setTitle("CUENCABRAZALES SECURE - Registro de Agente");
        setContentPane(panelFormulario);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // Cargar niveles de peligrosidad del 1 al 5
        for (int i = 1; i <= 5; i++) {
            comboPeligro.addItem(i);
        }

        // Acción del botón Guardar
        btnGuardar.addActionListener(e -> {
            try {
                String id = txtId.getText().trim();
                String nombre = txtNombre.getText().trim();
                String mision = txtMision.getText().trim();
                int peligro = (int) comboPeligro.getSelectedItem();
                double pago = Double.parseDouble(txtPago.getText().trim());

                Agente nuevo = new Agente(id, nombre, mision, peligro, pago);
                gestor.agregarAgente(nuevo);

                JOptionPane.showMessageDialog(this, "Agente registrado correctamente.");
                dispose(); // cerrar formulario

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al registrar: " + ex.getMessage());
            }
        });

        setVisible(true);
    }

    // Solo necesario si planeas usar componentes personalizados
    private void createUIComponents() {
        // TODO: Agrega componentes personalizados si es necesario
    }
}
