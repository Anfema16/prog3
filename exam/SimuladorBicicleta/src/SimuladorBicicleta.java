import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/*Autor: Andres Felipe Martinez Orozco*/

public class SimuladorBicicleta extends JFrame {

    private JButton pedalIzquierdo, pedalDerecho;
    private final JLabel indicador1;
    private final JLabel indicador2;

    public SimuladorBicicleta() {
        setTitle("Bicicleta");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pedalIzquierdo = new JButton("Izquierda");
        pedalDerecho = new JButton("Derecha");

        indicador1 = new JLabel("Indicador 1: ");
        indicador2 = new JLabel("Indicador 2: ");

        setLayout(new GridLayout(2, 2));
        add(pedalIzquierdo);
        add(pedalDerecho);
        add(indicador1);
        add(indicador2);

        pedalIzquierdo.addActionListener((ActionEvent e) -> {
            pedalIzquierdo.setVisible(true);
            pedalDerecho.setVisible(true);
            // Actualizar propiedades de la bicicleta y los indicadores si es necesario
        });

        pedalDerecho.addActionListener((ActionEvent e) -> {
            pedalDerecho.setVisible(true);
            pedalIzquierdo.setVisible(true);
            // Actualizar propiedades de la bicicleta y los indicadores si es necesario
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SimuladorBicicleta().setVisible(true);
        });
    }
}
