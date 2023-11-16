import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Autor: Andres Felipe Martinez Orozco

public class SimuladorBicicleta extends JFrame {

    private JButton pedalIzquierdo, pedalDerecho, automaticoButton, manualButton;
    private JLabel indicador1, indicador2, temporizadorLabel, contadorPedalesIzquierdo, contadorPedalesDerecho;
    private Timer tiempo;
    private int contadorPedalIzquierdo, contadorPedalDerecho, segundosTranscurridos;
    private double velocidad;
    private int calorias;
    private boolean automaticoActivado;

    public SimuladorBicicleta() {
        setTitle("Simulador de Bicicleta");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pedalIzquierdo = new JButton("Izquierda");
        pedalDerecho = new JButton("Derecha");
        automaticoButton = new JButton("Automático");
        manualButton = new JButton("Manual");

        indicador1 = new JLabel("Velocidad: 0.0 km/h");
        indicador2 = new JLabel("Calorías quemadas: 0");
        temporizadorLabel = new JLabel("Tiempo: 0 segundos");
        contadorPedalesIzquierdo = new JLabel("Pedaleadas Izquierda: 0");
        contadorPedalesDerecho = new JLabel("Pedaleadas Derecha: 0");

        setLayout(new GridLayout(6, 2));
        add(indicador1);
        add(indicador2);
        add(pedalIzquierdo);
        add(pedalDerecho);
        add(contadorPedalesIzquierdo);
        add(contadorPedalesDerecho);
        add(automaticoButton);
        add(manualButton);
        add(temporizadorLabel);

        tiempo = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                segundosTranscurridos++;
                temporizadorLabel.setText("Tiempo: " + segundosTranscurridos + " segundos");
                indicador1.setText("Velocidad: " + velocidad + " km/h");
                indicador2.setText("Calorías quemadas: " + calorias);
            }
        });
        tiempo.start();

        pedalIzquierdo.addActionListener(new ActionListener() {
            int clicksIzquierdo = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!automaticoActivado) {
                    clicksIzquierdo++;
                    if (clicksIzquierdo >= (int) (Math.random() * 3) + 2) {
                        contadorPedalIzquierdo++;
                        contadorPedalesIzquierdo.setText("Pedaleadas Izquierda: " + contadorPedalIzquierdo);
                        simularBicicleta();
                        clicksIzquierdo = 0;
                    }
                }
            }
        });

        pedalDerecho.addActionListener(new ActionListener() {
            int clicksDerecho = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!automaticoActivado) {
                    clicksDerecho++;
                    if (clicksDerecho >= (int) (Math.random() * 3) + 2) {
                        contadorPedalDerecho++;
                        contadorPedalesDerecho.setText("Pedaleadas Derecha: " + contadorPedalDerecho);
                        simularBicicleta();
                        clicksDerecho = 0;
                    }
                }
            }
        });

        automaticoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                automaticoActivado = true;
                pedalIzquierdo.setVisible(false);
                pedalDerecho.setVisible(false);
                iniciarAvanceAutomatico();
            }
        });

        manualButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                automaticoActivado = false;
                pedalIzquierdo.setVisible(true);
                pedalDerecho.setVisible(true);
            }
        });
    }

    private void simularBicicleta() {
        velocidad = Math.random() * 20 + 10;
        calorias = (contadorPedalIzquierdo + contadorPedalDerecho) * 5;
    }

    private void iniciarAvanceAutomatico() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (automaticoActivado) {
                    try {
                        Thread.sleep(1500); // Avance cada 1.5 segundos
                        contadorPedalIzquierdo++;
                        contadorPedalesIzquierdo.setText("Pedaleadas Izquierda: " + contadorPedalIzquierdo);
                        contadorPedalDerecho++;
                        contadorPedalesDerecho.setText("Pedaleadas Derecha: " + contadorPedalDerecho);
                        simularBicicleta();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
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
