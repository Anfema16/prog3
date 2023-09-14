/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03;

/**
 *
 * @author Estudiante
 */
import java.util.Scanner;

class Carro {
    private String marca;
    private String modelo;
    private String color;
    private int kilometraje;

    public Carro(String marca, String modelo, String color, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getKilometraje() {
        return kilometraje;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de carros: ");
        int cantidadCarros = scanner.nextInt();

        Carro[] carros = new Carro[cantidadCarros];

        for (int i = 0; i < cantidadCarros; i++) {
            System.out.println("Ingrese los datos del carro " + (i + 1) + ":");
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.print("Kilometraje: ");
            int kilometraje = scanner.nextInt();

            carros[i] = new Carro(marca, modelo, color, kilometraje);
        }

        // Ordenar por modelo utilizando bubble sort
        bubbleSortByModelo(carros);

        System.out.println("\nCarros ordenados por modelo (de menor a mayor):");
        for (Carro carro : carros) {
            System.out.println(carro.getModelo() + " - " + carro.getMarca());
        }

        // Ordenar por kilometraje utilizando bubble sort
        bubbleSortByKilometraje(carros);

        System.out.println("\nCarros ordenados por kilometraje (de menor a mayor):");
        for (Carro carro : carros) {
            System.out.println(carro.getKilometraje() + " km - " + carro.getMarca());
        }
    }

    public static void bubbleSortByModelo(Carro[] carros) {
        int n = carros.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (carros[i].getModelo().compareTo(carros[i + 1].getModelo()) > 0) {
                    // Swap carros[i] and carros[i+1]
                    Carro temp = carros[i];
                    carros[i] = carros[i + 1];
                    carros[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void bubbleSortByKilometraje(Carro[] carros) {
        int n = carros.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (carros[i].getKilometraje() > carros[i + 1].getKilometraje()) {
                    // Swap carros[i] and carros[i+1]
                    Carro temp = carros[i];
                    carros[i] = carros[i + 1];
                    carros[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}