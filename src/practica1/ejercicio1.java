/*
 * Leer 5 números (con bucle por favor, no pongáis 5 scanner consecutivos) y 
 * mostrarlos en el mismo orden introducido.

 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author luban
 */
public class ejercicio1 {

    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        int numero[];
        numero = new int[5];
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Introduce  numero");
            numero[i] = numeros.nextInt();
        }

        for (int i = 0; i < numero.length; i++) {
            System.out.println("El numero introduce es " + numero[i]);
        }
    }
}
