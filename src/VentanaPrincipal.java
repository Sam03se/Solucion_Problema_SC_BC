import javax.swing.*;

public class VentanaPrincipal extends JFrame {
    public VentanaPrincipal(GestorAgentes gestor) {
        PanelPrincipal panel = new PanelPrincipal();

        setTitle("CUENCABRAZALES SECURE - Sistema de Agentes");
        setContentPane(panel.SCJBpanelPrincipal);
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel.SCJBRegistrar.addActionListener(e -> {
            System.out.println("Click en REGISTRAR");
            new FormularioAgente(gestor);
        });

        panel.SCJBModificar.addActionListener(e -> JOptionPane.showMessageDialog(this, "Función modificar aún no implementada"));

        panel.SCJBListar.addActionListener(e -> JOptionPane.showMessageDialog(this, "Función listar aún no implementada"));

        panel.SCJBInforme.addActionListener(e -> JOptionPane.showMessageDialog(this, "Función informe aún no implementada"));

        setVisible(true);
    }
}