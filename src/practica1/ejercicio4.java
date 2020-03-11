/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author luban
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero[];
        int num;
        

        Scanner reader = new Scanner(System.in);
        numero = new int[10];
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Introduce numero:");
            num = reader.nextInt();
            numero[i]=num;

        }
        for ( int i=0; i <= 4; i++){
            System.out.println(numero[i]);
            System.out.println(numero[9 - i]);
        }

    }
}
