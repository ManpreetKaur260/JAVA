/*
 *  Leer 5 números y mostrarlos en orden inverso al introducido.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author luban
 */
public class ejercicio2 {

    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        int numero[];
        numero = new int[5];
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Introduce  numero");
            numero[i] = numeros.nextInt();
        }

        for (int i = numero.length - 1; i >= 0; i--) {
            System.out.println("El inverso del numero introduce es " + numero[i]);
        }

    }
}
