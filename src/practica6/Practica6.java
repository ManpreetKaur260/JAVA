/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;

import java.util.Scanner;

/**
 *
 * @author luban
 */
public class Practica6 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            mostrarMenu();
        } catch (Exception e) {
            e.getMessage();
        }

    }

    public static void mostrarMenu() throws Exception {
        int opcion;
        boolean salir = false;

        while (!salir) {
            System.out.println("---MENU PRINCIPAL---");
            System.out.println("Calculadora de Manpreet Kaur");
            System.out.println("¿en que figura tiene interesa?");
            System.out.println("1.Triangulo");
            System.out.println("2.Circulo o Esfera");
            System.out.println("3.Rectangulo");
            System.out.println("4.Cilindro");
            System.out.println("5.Salir");
            System.out.println("Introduce una opcion");
            opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    new Triangulo().mostrarMenu();
                    break;
                case 2:
                    new Circulo().mostrarMenu();
                break;
                
                case 3:
                    new Rectangulo().mostrarMenu();
                    break;
                case 4:
                    new Cilindro().mostrarMenu();
                    break;
                case 5 :
                    salir = true;
                    break;
                default:
                        System.out.println("La opción indicada no es correcta,"
                                + "por favor, indica otra.");    
            }

        }
    }

}
