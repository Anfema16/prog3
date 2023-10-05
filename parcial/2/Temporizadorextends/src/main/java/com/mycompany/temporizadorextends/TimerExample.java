/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.temporizadorextends;

import java.util.Scanner;
import java.util.Timer;

/**
 *
 * @author Lina Castiblanco
 * @author Andres Martinez
 */
import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class TimerExample extends TimerTask {
    private String mensaje;
    
    public TimerExample(String mensaje) {
        this.mensaje = mensaje;
    }
    
    @Override
    public void run() {
        System.out.println(mensaje);
    }
    
    public static void main(String[] args) {
        Timer timer = new Timer();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Ingrese el mensaje para el temporizador (o 'salir' para salir):");
            String mensaje = scanner.nextLine();
            
            if (mensaje.equalsIgnoreCase("salir")) {
                break;
            }
            
            System.out.println("Ingrese el tiempo de espera en segundos:");
            long tiempoEspera = scanner.nextLong() * 1000; // Convertir a milisegundos
            
            TimerExample tarea = new TimerExample(mensaje);
            timer.schedule(tarea, tiempoEspera);
            
            System.out.println("Temporizador programado. Presione Enter para continuar o 'salir' para salir.");
            scanner.nextLine(); // Consume la línea en blanco
            String opcion = scanner.nextLine();
            
            if (opcion.equalsIgnoreCase("salir")) {
                tarea.cancel();
                break;
            }
        }
        
        timer.cancel();
        scanner.close();
        System.out.println("Programa terminado.");
    }
}
