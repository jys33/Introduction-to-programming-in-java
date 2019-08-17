/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Julio-Cesar
 */
public class Example {

    //https://www.rae.es/consultas/exclusion-de-ch-y-ll-del-abecedario
    public static void main(String[] args) {
        // Seguimiento de cambios en valores variables (Trace)
        // Descripción paso a paso de la operación de un programa
        //               a         b        t                
        //              ----------------------
        int a, b;// undefined   undefined
        a = 33;//       33      undefined
        b = 3;//        33         3
        int t = a;//    33         3        33
        a = b;//        3          3        33
        b = t;//        3          33       33

        // Ascii letras mayúsculas del rango de 65 - 90  | la letra Ñ Y ñ => 209,241 respectivamente
        // Ascii letras minúsculas del rango de 97 - 122
        int[] may = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};
        char[] ma = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int[] min = {97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
        char[] mi = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        int n = ma.length;

        // Shuffling an array (Barajando una matriz)
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            int temp = ma[i];
            ma[i] = ma[r];
            ma[r] = (char) temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ma[i] + ", ");
        }
    }
}
