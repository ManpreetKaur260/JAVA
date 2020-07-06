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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {

        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("      MENU        ");
            System.out.println("Opción 1:Tabla bidimensional de 5*5"); //opciones para menu
            System.out.println("Opción 2:Tabla de 4*4");               //que necessito 
            System.out.println("Opción 3:Tabla de 3*3");
            System.out.println("Opción 4:Tabla de 7*7");
            System.out.println("Opción 5:Un matriz marco de 8*6");
            System.out.println("Opción 6:Un matriz marco según tamaño de usuario");
            System.out.println("Opción 7: Salir");

            System.out.println("Escribe una de las opciones");  //para hacer un input a opcion de menu
            opcion = lector.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("Has selecionado la opción 1");
                    ejercicio2.ej2();
                    break;
                case 2:
                    System.out.println("Has selecionado la opción 2");
                    ejercicio3.ej3();
                    break;
                case 3:
                    System.out.println("Has selecionado la opción 3");
                    ejercicio4.ej4();
                    break;
                case 4:
                    System.out.println("Has selecionado la opción 4");
                    ejercicio5.ej5();
                    break;
                case 5:
                    System.out.println("Has selecionado la opción 5");
                    ejercicio6.ej6();
                    break;
                case 6:
                    System.out.println("Has selecionado la opción 6");
                    ejercicio7.ej7();
                    break;
                case 7:
                    salir = true;
                    break;

            }

        }
    }
}
