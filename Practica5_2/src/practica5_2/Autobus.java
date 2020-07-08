/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5_2;

import java.util.Scanner;

/**
 *
 * @author luban
 */
public class Autobus extends Vehiculo{
    static Scanner lector = new Scanner(System.in);
    private int numeroPalzas;
    private int numeroParadas;
    
    //constructor sin parametros

    public Autobus() {
    }
    
    //constructor con parametros
    public Autobus(int numeroPalzas, int numeroParadas, int id, String matricula, String modelo, double potencia) {
        super(id, matricula, modelo, potencia);
        this.numeroPalzas = numeroPalzas;
        this.numeroParadas = numeroParadas;
    }
    
    //constructor copia
    public Autobus(Autobus a1,Vehiculo v1){
        super(v1);
        this.numeroPalzas=a1.numeroPalzas;
        this.numeroParadas=a1.numeroParadas;
    }
    
    //getters & setters

    public int getNumeroPalzas() {
        return numeroPalzas;
    }

    public void setNumeroPalzas(int numeroPalzas) {
        this.numeroPalzas = numeroPalzas;
    }

    public int getNumeroParadas() {
        return numeroParadas;
    }

    public void setNumeroParadas(int numeroParadas) {
        while(numeroParadas < 3 || numeroParadas >20){
            System.out.println("Las paradas minimas seran 3 y maximas seran 20");
            numeroParadas = lector.nextInt();
        }
        this.numeroParadas = numeroParadas;
    }
    
    //metodo mostrar atributos
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("El numero de plazas del autobus es : " + this.getNumeroPalzas());
        System.out.println("El numero de pradas del autobus es : " + this.getNumeroParadas());
    }
    
    //metodo pedir Alta
    @Override
    public Autobus pedirAlta(){
        super.pedirAlta();
        System.out.println("El numero de plazas es :");
        this.setNumeroPalzas(lector.nextInt());
        System.out.println("El numero de paradas es :");
        this.setNumeroParadas(lector.nextInt());
        return this;
    }
}
