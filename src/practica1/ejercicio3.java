/*
 * Leer 5 números por teclado y a continuación realizar la media de los números
 * positivos, la media de los negativos y contar el número de ceros 
 * que se han introducido por teclado

 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author luban
 */
public class ejercicio3 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numero[];

        numero = new int[5];
        int suma_positivo, suma_negativo, contarpositivo, contarnegativo, contarcero, media_positivo, media_negativo, numeropositivo;
        suma_positivo = 0;
        suma_negativo = 0;
        contarcero = 0;
        contarnegativo = 0;
        contarpositivo = 0;
        media_positivo = 0;
        media_negativo = 0;
        numeropositivo = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce  numero");
            numero[i] = reader.nextInt();

        }
        for (int i = 0; i < 5; i++) {
            if (numero[i] > 0) {
                suma_positivo += numero[i];
                contarpositivo++;

            } else if (numero[i] < 0) {
                suma_negativo += numero[i];
                contarnegativo++;

            } else if (numero[i] == 0) {
                contarcero++;

            }

        }
        media_positivo = suma_positivo/contarpositivo;
        media_negativo = suma_negativo/contarnegativo;

        if (contarpositivo == 0) {
            System.out.println("No hay numeros positivos");
        } else {
            System.out.println("los numeros positivos son :" + contarpositivo);
            System.out.println("La media de los numeros positivos son " + media_positivo);
        }
        if (contarnegativo == 0) {
            System.out.println("no hay numeros negativos");
        } else {
            System.out.println("La media de los numeros negativos son " + media_negativo);
        }
        if (contarcero == 0) {
            System.out.println("No hay ceros ");
        } else {
            System.out.println("Los ceros son " + contarcero);
        }

    }

}
