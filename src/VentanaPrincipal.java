import javax.swing.*;

public class VentanaPrincipal extends JFrame {
    public VentanaPrincipal(GestorAgentes gestor) {
        PanelPrincipal panel = new PanelPrincipal();

        setTitle("CUENCABRAZALES SECURE - Sistema de Agentes");
        setContentPane(panel.SCJBpanelPrincipal);
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel.SCJBRegistrar.addActionListener(e -> new FormularioAgente(gestor));
        panel.SCJBModificar.addActionListener(e -> new FormularioModificarAgente(gestor));
        panel.SCJBListar.addActionListener(e -> new PanelListaAgentes(gestor));
        panel.SCJBInforme.addActionListener(e -> new PanelInformeFinanciero(gestor));

        setVisible(true);
    }
}