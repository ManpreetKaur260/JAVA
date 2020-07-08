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
public class Triangulo implements FigurasGeometricas{
    static Scanner lector =  new Scanner (System.in);
    private double altura;
    private double base;
    

    public Triangulo() {
    }

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double calculaArea(){
        System.out.println("Introduce los datos de triangulo para calcular area del triangulo");
        System.out.println("Dime la altura del triangulo");
        this.setAltura(lector.nextDouble());
        System.out.println("Dime la base del triangulo");
        this.setBase(lector.nextDouble());
        return (this.getAltura()*this.getBase())/2;
        
    }

    @Override
    public double calculaVolumen() {
        System.out.println("Introduce los datos de triangulo para calcular volumen del triangulo");
        System.out.println("Dime la altura del triangulo");
        this.setAltura(lector.nextDouble());
        System.out.println("Dime la base del triangulo");
        this.setBase(lector.nextDouble());
        return (this.getAltura()*this.getBase())/3;
        
    }

    @Override
    public void imprimirCaracteristicas() throws Exception {
        double area;
        double volumen;
        
        area = calculaArea();
        System.out.println("La altua del triangulo es : " + this.getAltura());
        System.out.println("El base del triangulo es : " + this.getBase());
        System.out.println("El area del triangulo es : " + area);
        
        volumen = calculaVolumen();
        System.out.println("La altua del triangulo es : " + this.getAltura());
        System.out.println("El base del triangulo es : " + this.getBase());
        System.out.println("El volumen del triangulo es : " + volumen);
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
                    
                    System.out.println("El area del triangulo es : " + calculaArea());
                    break;
                case 2 : 
                    System.out.println("El volumen del triangulo es :" + calculaVolumen());
                break;
                case 3 : 
                    imprimirCaracteristicas();
                break;
                case 4 :
                    salir = true;
                break;
                
                default : 
                    System.out.println("La opcion indicada no es valida.Por favor introduce otra");
            }
        }
    }
}
