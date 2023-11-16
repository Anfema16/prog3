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
    private double velocidad;
    private int calorias;

    public SimuladorBicicleta() {
        //Titulo del programa, tamaño de la ventana, si se cierra, detiene el programa
        setTitle("Bicicleta");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Botones de los Pedales
        pedalIzquierdo = new JButton("Izquierda");
        pedalDerecho = new JButton("Derecha");
        
        //Indicadores de Velocidad, Calorias y Tiempo
        indicador1 = new JLabel("Velocidad: 0.0 km/h");
        indicador2 = new JLabel("Calorías quemadas: 0");
        temporizadorLabel = new JLabel("Tiempo: 0 segundos");
        
        // Se asigna las filas y Columnas
        setLayout(new GridLayout(4, 2));
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
                temporizadorLabel.setText("Tiempo " + segundosTranscurridos + " segundos");
                indicador1.setText("Velocidad: " + velocidad + " km/h");
                indicador2.setText("Calorías quemadas: " + calorias);
            }
        });
        tiempo.start();
        
        //Clase del Pedal Izquierdo
        pedalIzquierdo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contadorPedalIzquierdo++;
                pedalIzquierdo.setVisible(true);
                pedalDerecho.setVisible(true);
                simularBicicleta();
            }
        });
        
        //Clase del Pedal Derecho
        pedalDerecho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contadorPedalDerecho++;
                pedalDerecho.setVisible(true);
                pedalIzquierdo.setVisible(true);
                simularBicicleta();
            }
        });
    }
    
    private void simularBicicleta() {
        // Simular el cálculo de la velocidad (velocidad entre 10 y 30 km/h)
        velocidad = Math.random() * 20 + 10;

        // Simular el cálculo de las calorías quemadas (cada pedalada quema 5 calorías)
        calorias = (contadorPedalIzquierdo + contadorPedalDerecho) * 5;
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