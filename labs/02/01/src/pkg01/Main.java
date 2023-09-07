/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01;

/**
 *
 * @author Estudiante
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el numero de filas de la primera matriz: ");
        int filasA = scanner.nextInt();
        System.out.print("Ingresa el numero de columnas de la primera matriz: ");
        int columnasA = scanner.nextInt();
        double[][] matrizA = leerMatriz(filasA, columnasA, scanner);

        System.out.print("Ingresa el número de filas de la segunda matriz: ");
        int filasB = scanner.nextInt();
        System.out.print("Ingresa el número de columnas de la segunda matriz: ");
        int columnasB = scanner.nextInt();
        double[][] matrizB = leerMatriz(filasB, columnasB, scanner);

        System.out.println("Elige una opcion:");
        System.out.println("· Suma de matrices");
        System.out.println("· Producto de matrices");
        System.out.println("· Producto de un escalar con una matriz");
        System.out.println("· Traspuesta de una matriz");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                if (filasA == filasB && columnasA == columnasB) {
                    double[][] suma = sumarMatrices(matrizA, matrizB);
                    imprimirMatriz(suma);
                } else {
                    System.out.println("Las matrices no pueden sumarse; por poseer dimensiones diferentes.");
                }
                break;
            case 2:
                if (columnasA == filasB) {
                    double[][] producto = multiplicarMatrices(matrizA, matrizB);
                    imprimirMatriz(producto);
                } else {
                    System.out.println("Las matrices no pueden multiplicarse por tener dimensiones erroneas.");
                }
                break;
            case 3:
                System.out.print("Ingresa el escalar: ");
                double escalar = scanner.nextDouble();
                double[][] productoEscalar = multiplicarEscalarConMatriz(escalar, matrizA);
                imprimirMatriz(productoEscalar);
                break;
            case 4:
                double[][] traspuesta = calcularTraspuesta(matrizA);
                imprimirMatriz(traspuesta);
                break;
            default:
                System.out.println("Opción invalida.");
        }

        scanner.close();
    }

    public static double[][] leerMatriz(int filas, int columnas, Scanner scanner) {
        double[][] matriz = new double[filas][columnas];
        System.out.println("Ingresa los elementos de la matriz:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento[" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        return matriz;
    }

    public static double[][] sumarMatrices(double[][] matrizA, double[][] matrizB) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        double[][] resultado = new double[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        return resultado;
    }

    public static double[][] multiplicarMatrices(double[][] matrizA, double[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int columnasB = matrizB[0].length;
        double[][] resultado = new double[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return resultado;
    }

    public static double[][] multiplicarEscalarConMatriz(double escalar, double[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        double[][] resultado = new double[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = escalar * matriz[i][j];
            }
        }

        return resultado;
    }

    public static double[][] calcularTraspuesta(double[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        double[][] traspuesta = new double[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }

        return traspuesta;
    }

    public static void imprimirMatriz(double[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        System.out.println("Resultado:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}