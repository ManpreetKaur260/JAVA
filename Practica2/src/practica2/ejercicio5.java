/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author luban
 */
public class ejercicio5 {
       public static void ej5() {
        int[][] tabla = new int[7][7];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (tabla[i] == tabla[j]) {
                    tabla[i][j] = 1;
                } else {
                    tabla[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(" ");
            for (int j = 0; j < tabla.length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
        }
    }
}
