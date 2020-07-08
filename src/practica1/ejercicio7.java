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
public class ejercicio7 {

    static public Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        boolean salir = false;

        while (!salir) {
            System.out.println("----------MÉNU-----------");
            System.out.println("-----1.Ejercicio1:Numero en orden el mismo ha introducido.-----");
            System.out.println("-----2.Ejercicio2:Numero en orden inverso.--------");
            System.out.println("-----3.Ejercicio3:La media de los numeros positivos y de los negativos y contar los ceros.-------");
            System.out.println("-----4.Ejercicio4:Mostra números. porejemplo:El primero,el último etc.-----");
            System.out.println("-----5.Ejercicio5:Mezclar en una tercera forma de 10 números enteros.-----------");
            System.out.println("-----6.Ejercicio6:Mezclar en una tercera forma a dos series de 12 números enteros--------");
            System.out.println("-----7.Salir-------------");
                  
            System.out.println("Elige una opción::");
            opcion = reader.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("Has selecionado la opción 1");
                    ejercicio1();
                    break;
                case 2:
                    System.out.println("Has selecionado la opción 2");
                    ejercicio2();
                    break;
                case 3:
                    System.out.println("Has selecionado la opción 3");
                    ejercicio3();
                    break;
                case 4:
                    System.out.println("Has selecionado la opción 4");
                    ejercicio4();
                    break;
                case 5:
                    System.out.println("Has selecionado la opción 4");
                    ejercicio5();
                    break;
                case 6:
                    System.out.println("Has selecionado la opción 4");
                    ejercicio6();
                    break;
                case 7:
                    salir = true;
                    break;
            }

        }
    }

    public static void ejercicio1() {
        int numero[];
        numero = new int[5];
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Introduce  numero");
            numero[i] = reader.nextInt();
        }

        for (int i = 0; i < numero.length; i++) {
            System.out.println("El numero introduce es " + numero[i]);
        }
    }

    public static void ejercicio2() {
        int numero[];
        numero = new int[5];
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Introduce  numero");
            numero[i] = reader.nextInt();
        }

        for (int i = numero.length - 1; i >= 0; i--) {
            System.out.println("El inverso del numero introduce es " + numero[i]);
        }
    }

    public static void ejercicio3() {
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
        media_positivo = suma_positivo / contarpositivo;
        media_negativo = suma_negativo / contarnegativo;

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

    public static void ejercicio4() {
        int numero[];
        int num;
        numero = new int[10];
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Introduce numero:");
            num = reader.nextInt();
            numero[i] = num;

        }
        for (int i = 0; i <= 4; i++) {
            System.out.println(numero[i]);
            System.out.println(numero[9 - i]);
        }
    }

    public static void ejercicio5() {
        int i, j;
        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[20];

        System.out.println("Leer la tabla a.....");
        for (i = 0; i < 10; i++) {
            System.out.println("Introduce un número:");
            a[i] = reader.nextInt();
        }
        System.out.println("La tabla 'a' completada..");

        System.out.println("Leer la tabla b .....");
        for (i = 0; i < 10; i++) {
            System.out.println("Introduce un número:");
            b[i] = reader.nextInt();
        }
        System.out.println("La taba 'b' completada..");
        j = 0;
        for (i = 0; i < 10; i++) {
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }
        System.out.println("Mostrar tabla 'c':");
        for (j = 0; j < 20; j++) {
            System.out.println(c[j] + " ");
        }
    }

    public static void ejercicio6() {
        int i, j;
        int a[] = new int[12];
        int b[] = new int[12];
        int c[] = new int[24];

        System.out.println("Leer la tabla a.....");
        for (i = 0; i < 12; i++) {
            System.out.println("Introduce un número:");
            a[i] = reader.nextInt();
        }
        System.out.println("La tabla 'a' completada..");

        System.out.println("Leer la tabla b .....");
        for (i = 0; i < 12; i++) {
            System.out.println("Introduce un número:");
            b[i] = reader.nextInt();
        }
        System.out.println("La taba 'b' completada..");
        j = 0;
        i = 0;
        while (i < 12) {
            for (int k = 0; k < 3; k++) {
                c[j] = a[i + k];
                j++;
            }
            for (int k = 0; k < 3; k++) {
                c[j] = b[i + k];
                j++;
            }
            i += 3;
        }
        System.out.println("Mostrar la tabla 'c':");
        for (j = 0; j < 24; j++) {
            System.out.println(c[j] + " ");
        }
        System.out.println("");
    }
}
