/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author luban
 */
public class ejercicio7 {
       public static void ej7() {
        int m, c;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el numero de las filas para crear matrix:");
        m = lector.nextInt();
        System.out.println("Introduzca el numero de las columnas para crear matrix:");
        c = lector.nextInt();
        int[][] tabla = new int[m][c];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == c - 1) {
                    tabla[i][j] = 1;
                } else {
                    tabla[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < c; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
