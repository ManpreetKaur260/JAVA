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
public class VTC extends Vehiculo{
    static Scanner lector = new Scanner(System.in);
    private int maxHoras;
    private int radioAccion;
    private String ciudad;
    
    //constructor con parametros

    public VTC(int maxHoras, int radioAccion, String ciudad, int id, String matricula, String modelo, double potencia) {
        super(id, matricula, modelo, potencia);
        this.maxHoras = maxHoras;
        this.radioAccion = radioAccion;
        this.ciudad = ciudad;
    }
    
    //constructor sin parametros

    public VTC() {
    }
    
    //constructor copia
    public VTC (VTC c1){
        super(c1);
        this.maxHoras = c1.maxHoras;
        this.radioAccion = c1.radioAccion;
        this.ciudad = c1.ciudad;
    }
    
    //getters & setters

    public int getMaxHoras() {
        return maxHoras;
    }

    public void setMaxHoras(int maxHoras) {
        while(maxHoras > 24){
            System.out.println("Las horas trabajadas no pueden superiores a 24");
            maxHoras = lector.nextInt();
        }
        this.maxHoras = maxHoras;
    }

    public int getRadioAccion() {
        return radioAccion;
    }

    public void setRadioAccion(int radioAccion) {
        while(radioAccion >50){
            System.out.println("El radio accion no puede superior a 50km pofavor introduce un valor valido");
            radioAccion = lector.nextInt();
        }
        this.radioAccion = radioAccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    //metodo mostrar atributos
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("Las maximas horas de trabajo son : " + this.getMaxHoras());
        System.out.println("La radio de acción en km es : " + this.getRadioAccion());
        System.out.println("La ciudad es : " + this.getCiudad());
    }
    
    //metodo pedir alta
    @Override
    public VTC pedirAlta(){
        super.pedirAlta();
        System.out.println("Las maximas horas de trabajo son :");
        this.setMaxHoras(lector.nextInt());
        System.out.println("La radio de accion en km es :");
        this.setRadioAccion(lector.nextInt());
        System.out.println("La ciudad para el que trabajan es :");
        this.setCiudad(lector.next());
        return this;
    }
}
