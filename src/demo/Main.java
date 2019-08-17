/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Arrays;

/**
 *
 * @author Julio-Cesar
 */
public class Main {

    public static void main(String[] args) {
        /**
         * Ctrl + e => Elimina una linea actual
         * Ctrl + Shift + c => Agrega o remueve comentarios
         * Ctrl + Shift + flecha arriba o abajo => Copia lineas
         * Alt + Shift + flecha arriba, abajo, izquierda o derecha => mueve el contenido
         * Ctrl + f encuentra un texto a Ctrl + h reemplaza el texto
         * Ctrl + r reemplaza todas las ocurrencias
         * Ctrl + u luego u convierte lo seleccionado a mayúscula
         * Ctrl + l luego l convierte lo seleccionado a minúscula
         * Ctrl + Shift + v => pega con formato
         */

        int[] arr = {4, 15, 16, 33, 50, 8, 23, 42, 108, 3};

        // Longitud del arr
        int n = arr.length;

        // El ultimo elemento del arr
        // System.out.println(arr[n - 1]);
        // Ordenamos el arr con ordenamiento por inserción
        sortI(arr, n);
        //Arrays.sort(arr);

        // Imprimimos los valores del arr ordenado de menor a mayor
        for (int val : arr) {
            if (val != arr[n - 1]) {
                System.out.print(val + ", ");
            } else {
                System.out.print(val);
            }
        }
        System.out.println("");
        // Valor entero a buscar
        int needle = 33;

        // Sí la busqueda devuelve true, quiere decir que si se encuentra en el arr
        if (search(needle, arr, n)) {
            System.out.println("EL número " + needle + " si se encuentra en el array.");

        } // Caso contrario no se encuentra en el arr
        else {
            System.out.println("EL número " + needle + " no se encuentra en el array.");
        }
    }

    // Ordenamiento burbuja
    public static void ordenar(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    // Ordenamiento burbuja 
    public static void sort(int[] array, int size) {
        int swaps;

        // do while swaps > 0
        do {
            // reset swaps to 0
            swaps = 0;

            // iterate through entire arr
            for (int i = 0; i < (size - 1); i++) {
                // if arr[i] > arr[i+1]
                if (array[i] > array[i + 1]) {
                    // swap them
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    // increment swaps
                    swaps++;
                }
            }
        } while (swaps != 0);
    }

    // Ordenamiento por selección
    public static void sortS(int array[], int size) {
        // for i = 1 to size - 1
        for (int i = 0; i < (size - 1); i++) {
            // for now, set min = i
            int min = i;

            // compare min to all other elements in unsorted subarray
            for (int j = (i + 1); j < size; j++) {
                // if you find an even smaller element, that is now min
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            // swap to put min in correct position
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

    }

    // Ordenamiento por inserción
    public static void sortI(int array[], int size) {
        // iterate through unsorted part of arr from l->r
        for (int i = 1; i < size; i++) {
            // define the start of the sorted arr
            int j = i - 1;

            // specify the next element to sort
            int to_sort = array[i];

            // iterate through sorted part of arr from r->l
            // figure out where in sorted portion to_sort should go
            while (j >= 0 && to_sort < array[j]) {
                // shift sorted elements rightward
                array[j + 1] = array[j];
                j--;
            }

            // insert element into sorted portion of arr
            array[j + 1] = to_sort;
        }
    }

    // Busqueda binaria
    public static boolean search(int needle, int haystack[], int size) {
        // define upper and lower bounds
        int upper = size - 1;
        int lower = 0;

        // halve arr until bounds overlap
        while (lower <= upper) {
            // define middle
            int middle = (upper + lower) / 2;

            // if needle is at middle
            if (needle == haystack[middle]) {
                // return true
                return true;
            } // if needle is left of middle
            else if (needle < haystack[middle]) {
                // reset upper bound
                upper = middle - 1;
            } // if needle is right of middle
            else if (needle > haystack[middle]) {
                // reset lower bound
                lower = middle + 1;
            }
        }
        // needle is not in haystack
        return false;
    }
}
