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
public class ejercicio6 {
        public static void ej6() {
        int[][] tabla = new int[8][6];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || j == 0 || i == 7 || j == 5) {
                    tabla[i][j] = 1;
                } else {
                    tabla[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(" ");
            for (int j = 0; j < 6; j++) {
                System.out.print(tabla[i][j] + " ");
            }
        }
    }

}
