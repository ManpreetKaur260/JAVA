/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luban
 */
public class cuenta {

    private String nombre;
    private String numeroDeCuenta;
    private double tipoDeInteres;
    private double saldo;
    private String pin;

    static Scanner reader = new Scanner(System.in);

    public cuenta() {
    }

    public cuenta(String nombre, String numeroDeCuenta, double tipoDeInteres, double saldo, String pin) {
        this.nombre = nombre;
        this.numeroDeCuenta = numeroDeCuenta;
        this.tipoDeInteres = tipoDeInteres;
        this.saldo = saldo;
        this.pin = pin;
    }

    public cuenta(cuenta c1) {
        this.nombre = c1.nombre;
        this.numeroDeCuenta = c1.numeroDeCuenta;
        this.tipoDeInteres = c1.tipoDeInteres;
        this.saldo = c1.saldo;
        this.pin = c1.pin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public double getTipoDeInteres() {
        return tipoDeInteres;
    }

    public void setTipoDeInteres(double tipoDeInteres) {
        this.tipoDeInteres = tipoDeInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public static cuenta crearCuenta(ArrayList<cuenta> cuentas) {
        cuenta nuevaCuenta = new cuenta();

        System.out.println("Introduce su nombre");
        nuevaCuenta.setNombre(reader.next());
        System.out.println("Introduce pin");
        nuevaCuenta.setPin(reader.next());
        System.out.println("Introduce numero de cuenta");
        if (nuevaCuenta.getPin().length() != 4) {
            while (nuevaCuenta.getPin().length() != 4) {
                System.out.println("Introduce otra vez pin de 4 numeros");
                nuevaCuenta.setPin(reader.next());
            }
        }
        nuevaCuenta.setNumeroDeCuenta(String.valueOf(cuentas.size()+1));
        nuevaCuenta.setNumeroDeCuenta(reader.next());
        nuevaCuenta.setSaldo(0); 
        nuevaCuenta.setTipoDeInteres(0.25);

        return nuevaCuenta;

    }

    public void mostrarDatos() {
        System.out.println("El nombre es:" + this.getNombre());
        System.out.println("El numero de cuenta es:" + this.getNumeroDeCuenta());
        System.out.println("El tipo de interes es:" + this.getTipoDeInteres());
        System.out.println("El saldo es:" + this.getSaldo());
    }

    public boolean ingreso() {

        boolean ingresoCorecto = true;
        double cantidadIngresar = reader.nextDouble();
        this.getSaldo();

        /*while(cantidadIngresar <= 0){
            cantidadIngresar = reader.nextDouble();
        }*/
        if (cantidadIngresar < 0) {
            ingresoCorecto = false;
        } else {
            saldo += cantidadIngresar;
        }
        return ingresoCorecto;
    }

    public boolean reintegro() {
        System.out.println("introduce la cantidad de dinero que quiere introducir");
        double cantidadReintegrar = reader.nextDouble();
        boolean reintegroCorecto = true;

        if (cantidadReintegrar < 0) {
            reintegroCorecto = false;
        } else if (cantidadReintegrar < saldo) {
            reintegroCorecto = false;
        } else {
            saldo -= cantidadReintegrar;
        }
        return reintegroCorecto;
    }

    public boolean transferencia(cuenta c) {
        double importe = reader.nextDouble();
        boolean transferenciaCorecto = true;

        if (importe < 0) {
            transferenciaCorecto = false;
        } else if (saldo >= importe) {
            saldo -= importe;
            c.saldo += importe;
        } else {
            transferenciaCorecto = false;
        }
        return transferenciaCorecto;
    }

    public static int iniciarSesion(ArrayList<cuenta> cuentas, String numeroCuenta, String pin) {
        int i = 0;

        while (numeroCuenta.equals(cuentas.get(i).getNumeroDeCuenta()) && pin.equals(cuentas.get(i).getPin())
                && i != cuentas.size()-1) {
            i++;
        }

        if (numeroCuenta.equals(cuentas.get(i).getNumeroDeCuenta()) && pin.equals(cuentas.get(i).getPin())) {
            System.out.println("Cuenta valida");
        } else {
            i = -1;
            System.out.println("cuenta no vailda");
        }
        return i;
    }

    public static int verficaCuenta(ArrayList<cuenta> cuentas, String numCuenta) {
        int i = 0;
        while (numCuenta.equals(cuentas.get(i).getNumeroDeCuenta())) {
            i++;
        }

        if (numCuenta.equals(cuentas.get(i).getNumeroDeCuenta())) {
            System.out.println("Cuenta existe");
        } else {
            i = -1;
            System.out.println("cuenta no existe");
        }
        return i;
    }

}
