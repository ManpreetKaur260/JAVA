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
public class ejercicio3 {
        public static void ej3() {
        Scanner lector = new Scanner(System.in);
        int[][] tabla = new int[4][4];
        int contador = 0;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]" + "=");
                tabla[i][j] = lector.nextInt();
            }
        }
        System.out.println("Imprimiendo Tabla.");
        for (int i = 0; i < tabla.length; i++) {
            System.out.println();
            for (int j = 0; j < tabla.length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
        }
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                if (tabla[i][j] == tabla[j][i]) {

                } else {
                    contador += 1;
                }

            }
        }
        if (contador == 0) {
            System.out.println("Es simetrica");
        } else {
            System.out.println("No es simetrica");
        }
    }
}
