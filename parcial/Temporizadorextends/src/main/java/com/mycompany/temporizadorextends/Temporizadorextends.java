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
class Temporizadorextends {
    private String message;

    public Temporizadorextends(String message) {
        this.message = message;
    }

    public void run() {
        System.out.println(message);
    }
}

public class TimerExample {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Elija una opción:");
            System.out.println("1. Crear un temporizador");
            System.out.println("2. Detener un temporizador");
            System.out.println("3. Reiniciar un temporizador");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el mensaje para el temporizador: ");
                    scanner.nextLine(); // Consumir la nueva línea
                    String mensaje = scanner.nextLine();
                    System.out.print("Ingrese el tiempo de espera en milisegundos: ");
                    long tiempoEspera = scanner.nextLong();

                Temporizadorextends = new Temporizadorextends(mensaje);
                    timer.schedule(task, tiempoEspera);
                    break;


                case 2:
                    System.out.print("Ingrese el mensaje del temporizador que desea detener: ");
                    scanner.nextLine(); // Consumir la nueva línea
                    String mensajeDetener = scanner.nextLine();
                    timer.purge(); // Limpiar tareas canceladas
                    break;
                case 3:
                    System.out.print("Ingrese el mensaje del temporizador que desea reiniciar: ");
                    scanner.nextLine(); // Consumir la nueva línea
                    String mensajeReiniciar = scanner.nextLine();
                    timer.purge(); // Limpiar tareas canceladas
                    System.out.print("Ingrese el nuevo tiempo de espera en milisegundos: ");
                    long nuevoTiempoEspera = scanner.nextLong();
                    MyTimerTask taskReiniciar = new MyTimerTask(mensajeReiniciar);
                    timer.schedule(taskReiniciar, nuevoTiempoEspera);
                    break;
                case 4:
                    timer.cancel(); // Detener todos los temporizadores antes de salir
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
