/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

import java.util.ArrayList;
import java.util.Scanner;
import static practica3.cuenta.iniciarSesion;

/**
 *
 * @author luban
 */
public class Practica3 {

    /**
     * @param args the command line arguments
     */
    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<cuenta> cuentas = new ArrayList<>();
        menuPrincipal(cuentas);

    }

    public static void menuPrincipal(ArrayList<cuenta> cuentas) {
        boolean salida = false;
        int opciones;
        while (!salida) {
            System.out.println("----------MÉNU-------------");
            System.out.println("-----1.Iniciar Sesion-----");
            System.out.println("-----2.Alta de cuentas------------");
            System.out.println("-----3.Salir-----------");

            opciones = lector.nextInt();
            int posicion;
            switch (opciones) {

                case 1:
                    
                        System.out.println("Has selecionado la opción 1");
                        System.out.println("Introduce nuemro de cuenta : ");
                        String numeroCuenta = lector.next();
                        System.out.println("Introduce pin : ");
                        String pin = lector.next();
                        posicion = iniciarSesion(cuentas, numeroCuenta, pin);
                        if (posicion < cuentas.size() && posicion != -1) {
                            mostrarSubMenu(cuentas, cuentas.get(posicion));
                        }
                    break;

                case 2:
                    System.out.println("Has selecionado la opción 2");
                    cuenta.crearCuenta(cuentas);
                    break;
                case 3:
                    salida = true;
                    break;
            }
        }
    }

    public static void mostrarSubMenu(ArrayList<cuenta> cuentas, cuenta cuentaOrigen) {
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("----------MÉNU-------------");
            System.out.println("-----1.Ingresar------------");
            System.out.println("-----2.Reintrego-----------");
            System.out.println("-----3.Transferencia-------");
            System.out.println("-----4.Salir---------------");

            opcion = lector.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("Has selecionado la opción 1");
                    cuentaOrigen.ingreso();
                    break;
                case 2:
                    System.out.println("Has selecionado la opción 2");
                    cuentaOrigen.reintegro();
                    break;
                case 3:
                    System.out.println("Has selecionado la opción 3");
                    cuentaOrigen.transferencia(cuentaOrigen);
                    break;
                case 4:
                    salir = true;
                    break;
            }

        }
    }
}
