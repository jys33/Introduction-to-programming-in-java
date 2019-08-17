/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javax.swing.JOptionPane;

/**
 *
 * @author Julio-Cesar
 */
public class Practica {

    public static void main(String[] args) {
        int[] arr = null;
        int n;

        String str = JOptionPane.showInputDialog("Ingresa la cantidad de notas para calcular el promedio.");
        if (isPositiveInt(str)) {
            n = Integer.parseInt(str);
            arr = new int[n];

            for (int i = 0; i < n; i++) {
                String val = JOptionPane.showInputDialog("Ingrese la nota: " + (i + 1));
                if (isPositiveInt(val)) {
                    arr[i] = Integer.parseInt(val);
                } else {
                    JOptionPane.showMessageDialog(null, "No ingresate un entero positivo válido");
                }
            }

            int sum = 0;

            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }

            float avg = (float) sum / n;
            JOptionPane.showMessageDialog(null, "El promedio de los valores ingresados es: " + avg);

        } else {
            JOptionPane.showMessageDialog(null, "No ingresate un entero positivo válido");
        }

    }

    public static boolean isPositiveInt(String str) {
        if (str == null) {
            return false;
        }
        if (str.trim().length() == 0) {
            return false;
        }
        // 001 or -001 | 45 = '-' | 48 = 0
        if (str.charAt(0) == 48 || str.charAt(0) == 45) {
            return false;
        }
        // valid range[48-57] | 12jjh
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (!(c > 47 && c < 58)) {
                return false;
            }
        }
        return true;
    }

    public static String clean(String str) {
        str = str.trim();
        str = str.replaceAll("\\s\\s+", " ");
        return str;
    }
}
