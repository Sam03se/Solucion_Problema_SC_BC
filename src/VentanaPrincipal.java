import javax.swing.*;

public class VentanaPrincipal extends JFrame {
    public VentanaPrincipal(GestorAgentes gestor) {
        PanelPrincipal panel = new PanelPrincipal();

        setTitle("CUENCABRAZALES SECURE - Sistema de Agentes");
        setContentPane(panel.SCJBpanelPrincipal);
        setSize(500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Botón: Registrar agente
        panel.SCJBRegistrar.addActionListener(e -> {
            System.out.println("Click en REGISTRAR");
            new FormularioAgente(gestor);
        });

        // Botón: Modificar agente
        panel.SCJBModificar.addActionListener(e -> {
            System.out.println("Click en MODIFICAR");
            new FormularioModificarAgente(gestor);
        });

        // Botón: Listar agentes
        panel.SCJBListar.addActionListener(e -> {
            System.out.println("Click en LISTAR");
            new PanelListaAgentes(gestor);
        });

        // Botón: Informe financiero
        panel.SCJBInforme.addActionListener(e -> {
            System.out.println("Click en INFORME");
            new PanelInformeFinanciero(gestor);
        });

        setVisible(true);
    }
}
