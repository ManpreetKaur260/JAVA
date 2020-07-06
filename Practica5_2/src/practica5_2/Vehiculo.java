/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luban
 */
public class Vehiculo {
    static Scanner lector = new Scanner(System.in);
    private  int id;
    private String matricula;
    private String modelo;
    private double potencia;
    
    //constructor con parametros

    public Vehiculo(int id, String matricula, String modelo, double potencia) {
        this.id = id;
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
    }
    
    //constructor sin parametros

    public Vehiculo() {
        
    }
    
    //constructor copia
    public Vehiculo (Vehiculo v1){
        this.id = v1.id;
        this.matricula = v1.matricula;
        this.modelo = v1.modelo;
        this.potencia = v1.potencia;
    }
    
    //getters & setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula.toUpperCase();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo.toUpperCase().charAt(0) + modelo.substring(1, modelo.length()).toLowerCase();
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        while(potencia <= 0){
            System.out.println("Introduce la potencia valida que es mayor de 0");
            potencia = lector.nextDouble();
        }
        this.potencia = potencia;
    }
    
    //metodo mostrar atributos
    public void mostrarAtributos(){
        System.out.println("El id del vehiculo es : " + this.getId());
        System.out.println("La matricula del vehiculo es : " + this.getMatricula());
        System.out.println("El modelo de vehiculo es : " + this.getModelo());
        System.out.println("La potencia del vehiculo es : " + this.getPotencia());
    }
    
    public static void mostrarVehiculo(ArrayList <Vehiculo> vehiculo){
        if(vehiculo.isEmpty()){
            System.out.println("Hasta ahora ningun vehiculo registrado");
        }else{
            for(int i=0;i<vehiculo.size();i++){
                vehiculo.get(i).mostrarAtributos();
            }
        }
    }
    //pedir alta de los vehiculos
    public Vehiculo pedirAlta(){
        
        System.out.println("El id del vehiculo es :");
        this.setId(lector.nextInt());
        System.out.println("La matricula del vehiculo es :");
        this.setMatricula(lector.next());
        System.out.println("El modelo del vehiculo es : ");
        this.setModelo(lector.next());
        System.out.println("La potencia del vehicuulo es :");
        this.setPotencia(lector.nextDouble());
        return this;
    }
    
    
    public static void buscarVehiculo(ArrayList <Vehiculo> vehiculo){
        int opcion;
        int id = 0;
        String matricula = null;
        int aux = 0;
        boolean buscar = false;
        
        if(vehiculo.isEmpty()){
            System.out.println("Hasta ahora ningun vehiculo registrado");
        }else{
            System.out.println("¿Por que opción quieres buscar el vehículo?");
            System.out.println("1. id");
            System.out.println("2. matricula");
            System.out.println("Elige una  opcion");
            opcion = lector.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Introduce el id : ");
                    id = lector.nextInt();
                    while(buscar = false && aux<vehiculo.size()){
                        if(vehiculo.get(aux).getId() != id){
                            aux += 1;
                        }else if (vehiculo.get(aux).getId() == id){
                            vehiculo.get(aux).mostrarAtributos();
                            buscar = true;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Introduce la matricula");
                    matricula = lector.next();
                    while(buscar = false && aux<vehiculo.size()){
                        if(!vehiculo.get(aux).getMatricula().equals(matricula)){
                            aux += 1;
                        }else if(vehiculo.get(aux).getMatricula().equals(matricula)){
                            vehiculo.get(aux).mostrarAtributos();
                            buscar = true;
                        }
                    }
                    break;
            }
        }
    }
    
}
