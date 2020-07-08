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
public class Rectangulo implements FigurasGeometricas {

    static Scanner lector = new Scanner(System.in);
    private double anchura;
    private double longitud;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double anchura, double longitud,double altura) {
        this.anchura = anchura;
        this.longitud = longitud;
        this.altura = altura;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    @Override
    public double calculaArea() throws Exception {
        System.out.println("Introduce los datos para calcular el area del rectangulo");
        System.out.println("Dime la anchura del rectangulo");
        this.setAnchura(lector.nextDouble());
        System.out.println("Dime el longitud del rectangulo"); 
        this.setLongitud(lector.nextDouble());
        return (this.getAnchura()*this.getLongitud());
        
    }

    @Override
    public double calculaVolumen() {
        System.out.println("Introduce los datos para calcular el Volumen del rectangulo");
        System.out.println("Dime la anchura del rectangulo");
        this.setAnchura(lector.nextDouble());
        System.out.println("Dime el longitud del rectangulo"); 
        this.setLongitud(lector.nextDouble());
        System.out.println("Dime la altura del rectangulo"); 
        this.setAltura(lector.nextInt());
        return (this.getAnchura()*this.getLongitud()*this.getAltura());
        
    }

    @Override
    public void imprimirCaracteristicas() throws Exception {
        double area;
        double volumen;
        
        area = calculaArea();
        System.out.println("El area del rectangulo ");
        System.out.println("La anchura del rectangulo es : " + this.getAnchura());
        System.out.println("El longitud del rectangulo es : " + this.getLongitud());
        System.out.println("El area del rectangulo es : " + area);
        
        volumen = calculaVolumen();
        System.out.println("El volumen del rectangulo ");
        System.out.println("La anchura del rectangulo es : " + this.getAnchura());
        System.out.println("La altura del rectangulo es : " + this.getAltura());
        System.out.println("El longitud del rectangulo es : " + this.getLongitud());
        System.out.println("El volumen del rectangulo es : " + volumen);
        
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
                    System.out.println("El area del rectangulo es : " + calculaArea());
                break;
                
                case 2 :
                    System.out.println("El volumen del rectangulo es : " + calculaVolumen());
                break;
                
                case 3 :
                    System.out.println("Las caracteristicas del rectangulo son : ");
                     imprimirCaracteristicas();
                break;
                
                case 4 :
                    salir = true;
                break;
            }
        }
    }
}
