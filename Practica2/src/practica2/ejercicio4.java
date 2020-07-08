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
public class ejercicio4 {
    
    public static void ej4() {
        Scanner lector = new Scanner(System.in);
        int[][] tabla1 = new int[3][3];
        int[][] tabla2 = new int[3][3];
        int[][] tabla3 = new int[3][3];

        System.out.println("Introduzca los datos para tabla1:");
        for (int i = 0; i < tabla1.length; i++) {
            for (int j = 0; j < tabla1.length; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]" + "=");
                tabla1[i][j] = lector.nextInt();
            }
        }
        System.out.println("Introducza los datos para tabla2:");
        for (int i = 0; i < tabla2.length; i++) {
            for (int j = 0; j < tabla2.length; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]" + "=");
                tabla2[i][j] = lector.nextInt();
            }
        }
        //sumarlas y mostrar su suma
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabla3[i][j] = tabla1[i][j] + tabla2[i][j];
            }
        }
        System.out.println("EL matrix de suma de los dos matrices:");
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(tabla3[i][j] + " ");
            }
        }
        System.out.println();
    }
}
