import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*Autor: Andres Felipe Martinez Orozco*/

public class SimuladorBicicleta extends JFrame {

    private JButton pedalIzquierdo, pedalDerecho;
    private JLabel indicador1, indicador2, temporizadorLabel;
    private Timer tiempo;
    private int contadorPedalIzquierdo, contadorPedalDerecho, segundosTranscurridos;

    public SimuladorBicicleta() {
        setTitle("Bicicleta");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pedalIzquierdo = new JButton("Izquierda");
        pedalDerecho = new JButton("Derecha");

        indicador1 = new JLabel("Contador Pedal Izquierdo: 0");
        indicador2 = new JLabel("Contador Pedal Derecho: 0");
        temporizadorLabel = new JLabel("Tiempo: 0 segundos");

        setLayout(new GridLayout(3, 2));
        add(indicador1);
        add(indicador2);
        add(pedalIzquierdo);
        add(pedalDerecho);
        add(temporizadorLabel);
        

        // Temporizador con intervalo de 1000 milisegundos (1 segundo)
        tiempo = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                segundosTranscurridos++;
                temporizadorLabel.setText("Tiempo: " + segundosTranscurridos + " segundos");
                indicador1.setText("Contador Pedal Izquierdo: " + contadorPedalIzquierdo);
                indicador2.setText("Contador Pedal Derecho: " + contadorPedalDerecho);
            }
        });
        tiempo.start();

        pedalIzquierdo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contadorPedalIzquierdo++;
                pedalIzquierdo.setVisible(true);
                pedalDerecho.setVisible(true);
            }
        });

        pedalDerecho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contadorPedalDerecho++;
                pedalDerecho.setVisible(true);
                pedalIzquierdo.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimuladorBicicleta().setVisible(true);
            }
        });
    }
}