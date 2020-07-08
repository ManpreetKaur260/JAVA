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
public class Cilindro implements FigurasGeometricas {

    static Scanner lector = new Scanner(System.in);
    private double radio;
    private double altura;

    public Cilindro() {
    }

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculaArea() throws Exception {
        System.out.println("Introduce los datos para calcular el area del cilindro");
        System.out.println("Dime la altura del cilindro");
        this.setAltura(lector.nextDouble());
        System.out.println("Dime la radio del cilindro");
        this.setRadio(lector.nextDouble());
        return (2 * this.getRadio() * Math.PI * (this.getAltura() + this.getRadio()));

    }

    @Override
    public double calculaVolumen() {
        System.out.println("Introduce los datos para calcular el volumen del cilindro");
        System.out.println("Dime la altura del cilindro");
        this.setAltura(lector.nextDouble());
        System.out.println("Dime la radio del cilindro");
        this.setRadio(lector.nextDouble());
        return Math.PI * Math.pow(this.getRadio(), 2) * this.getAltura();

    }

    @Override
    public void imprimirCaracteristicas() throws Exception {
        double area;
        double volumen;
        area = calculaArea();
        System.out.println("El area del cilindro ");
        System.out.println("El radio del cilindro es : " + this.getRadio());
        System.out.println("La altura del cilindro es : " + this.getAltura());
        System.out.println("El area del cilindro es : " + area);
        
        volumen = calculaVolumen();
        System.out.println("El volumen del cilindro ");
         System.out.println("El radio del cilindro es : " + this.getRadio());
        System.out.println("La altura del cilindro es : " + this.getAltura());
        System.out.println("El area del cilindro es : " + volumen);
    
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
                    System.out.println("El area del cilindro es : " + calculaArea());
                break;
                
                case 2 :
                    System.out.println("El volumen del cilindro es : " + calculaVolumen());
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
