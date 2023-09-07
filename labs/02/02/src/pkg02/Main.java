package pkg02;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] sizes = {100, 500, 1000, 5000, 10000};

        System.out.println("Tamaño array\tBurbuja\tInsercion\tSeleccion\tMergesort");

        for (int size : sizes) {
            double[] randomArray = generateRandomArray(size);

            double[] bubbleSortArray = Arrays.copyOf(randomArray, randomArray.length);
            long bubbleSortStartTime = System.nanoTime();
            bubbleSort(bubbleSortArray);
            long bubbleSortEndTime = System.nanoTime();
            long bubbleSortTime = bubbleSortEndTime - bubbleSortStartTime;

            double[] insertionSortArray = Arrays.copyOf(randomArray, randomArray.length);
            long insertionSortStartTime = System.nanoTime();
            insertionSort(insertionSortArray);
            long insertionSortEndTime = System.nanoTime();
            long insertionSortTime = insertionSortEndTime - insertionSortStartTime;

            double[] selectionSortArray = Arrays.copyOf(randomArray, randomArray.length);
            long selectionSortStartTime = System.nanoTime();
            selectionSort(selectionSortArray);
            long selectionSortEndTime = System.nanoTime();
            long selectionSortTime = selectionSortEndTime - selectionSortStartTime;

            double[] mergeSortArray = Arrays.copyOf(randomArray, randomArray.length);
            long mergeSortStartTime = System.nanoTime();
            mergeSort(mergeSortArray);
            long mergeSortEndTime = System.nanoTime();
            long mergeSortTime = mergeSortEndTime - mergeSortStartTime;

            System.out.println(size + "\t\t" + bubbleSortTime + "\t\t" + insertionSortTime + "\t\t" + selectionSortTime + "\t\t" + mergeSortTime);
        }
    }

    public static double[] generateRandomArray(int size) {
        double[] arr = new double[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextDouble();
        }
        return arr;
    }

    public static void bubbleSort(double[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    double temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    public static void insertionSort(double[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            double key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void selectionSort(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void mergeSort(double[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            double[] left = Arrays.copyOfRange(arr, 0, mid);
            double[] right = Arrays.copyOfRange(arr, mid, arr.length);

            mergeSort(left);
            mergeSort(right);

            int i = 0, j = 0, k = 0;

            while (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    arr[k++] = left[i++];
                } else {
                    arr[k++] = right[j++];
                }
            }

            while (i < left.length) {
                arr[k++] = left[i++];
            }

            while (j < right.length) {
                arr[k++] = right[j++];
            }
        }
    }
}
