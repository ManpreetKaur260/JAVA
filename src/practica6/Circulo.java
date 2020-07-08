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
public class Circulo implements FigurasGeometricas {

    static Scanner lector = new Scanner(System.in);
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculaArea() throws Exception {

        System.out.println("Inroduce los datos para calcular area de la esfera");
        System.out.println("El radio del circulo es : ");
        this.setRadio(lector.nextDouble());
        return Math.PI * Math.pow(this.getRadio(), 2);
    }

    @Override
    public double calculaVolumen() {
        System.out.println("Inroduce los datos para calcular volumen de la esfera");
        System.out.println("El radio del circulo es : ");
        this.setRadio(lector.nextDouble());
        return (4 * Math.PI * Math.pow(this.getRadio(), 3)) / 3;
    }

    @Override
    public void imprimirCaracteristicas() throws Exception {
        double area;
        double volumen;
        boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println("Calculadora de Manpreet Kaur");
            System.out.println("¿ De que figura quieres saber las caracteristicas ?");
            System.out.println("1.Circulo");
            System.out.println("2.Esfera");
            System.out.println("3.Salir");
            System.out.println("Elige una figura : ");
            opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    area = calculaArea();
                    System.out.println("El area del circulo ");
                    System.out.println("El radio del circulo  es : " + this.getRadio());
                    System.out.println("El area del circulo  es : " + area);
                    break;
                case 2:
                    volumen = calculaVolumen();
                    System.out.println("El volumen de la esfera ");
                    System.out.println("El radio de la esfera es : " + this.getRadio());
                    System.out.println("El volumen de la esfera es : " + volumen);
                    break;
                case 3 :
                    salir = true;
                    break;
                default:
                System.out.println("La opción indicada no es valida.");
            }
        }
    }
    
    public void mostrarMenu() throws Exception{
        int opcion;
        boolean salir = false;
        
        while(!salir){
            System.out.println("-----MENU-----");
            System.out.println("1.Calcula Area");
            System.out.println("2.Calcula Volumen");
            System.out.println("3.Imprimir Caracteristicas");
            System.out.println("4.Salir");
            System.out.println("Introduce una opcion");
            opcion = lector.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("El area del circulo es : " + calculaArea());
                break;
                
                case 2 :
                    System.out.println("El volumen del esfera es : " + calculaVolumen());
                break;
                
                case 3 :
                    imprimirCaracteristicas();
                break;
                
                case 4 :
                    salir = true;
                break;
                    
            }
        }
    }
    
}
