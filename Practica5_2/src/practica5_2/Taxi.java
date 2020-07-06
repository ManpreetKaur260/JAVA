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
public class Taxi extends Vehiculo {

    static Scanner lector = new Scanner(System.in);
    private int numeroLicencia;
    private boolean estado;
    private int taxista;

    //constructor con parametros
    public Taxi(int numeroLicencia, boolean estado, int taxista, int id, String matricula, String modelo, double potencia) {
        super(id, matricula, modelo, potencia);
        this.numeroLicencia = numeroLicencia;
        this.estado = estado;
        this.taxista = taxista;
    }

    //constructor sin parametros
    public Taxi() {
    }

    //constructor copia 
    public Taxi(Taxi t1) {
        super(t1);
        this.numeroLicencia = t1.numeroLicencia;
        this.estado = t1.estado;
        this.taxista = t1.taxista;
    }

    //getters & setters
    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getTaxista() {
        return taxista;
    }

    public void setTaxista(int taxista) {
        this.taxista = taxista;
    }

    //metodo mostrar atributos
    @Override
    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("El numero de licencia de taxi es : " + this.getNumeroLicencia());
        System.out.print("El estado del taxi es : ");
        if (this.isEstado() == false) {
            System.out.println("- ocupado");
        } else {
            System.out.println("- libre");
        }
        System.out.println("El numero de taxista asociados con este licencia : " + this.getTaxista());
    }

    //metodo pedir alta
    @Override
    public Taxi pedirAlta() {
        int aux = 0;
        super.pedirAlta();
        while (aux == 0 && (aux != 1 || aux != 2)) {
            System.out.println("Introduce el  estado (libre = 1 y ocupado = 2)");
            aux = lector.nextInt();
        }

        if (aux == 1) {
            this.setEstado(true);
        } else if (aux == 2) {
            this.setEstado(false);
        }
        System.out.println("Indica el numero de taxistas que asociadan con este licencia :");
        this.setTaxista(lector.nextInt());
        return this;
    }

    public static void buscarTaxiLibre(ArrayList<Vehiculo> vehiculo) {
        boolean libre = false;
        int i = 0;

        if (vehiculo.isEmpty()) {
            System.out.println("Ningun vehiculo registrado");
        } else {
            while (libre == false && i < vehiculo.size()) {
                if (vehiculo.get(i) instanceof Taxi && ((Taxi) vehiculo.get(i)).isEstado() == true) {
                    System.out.println("El taxi libre es : ");
                    vehiculo.get(i).mostrarAtributos();
                    ((Taxi) vehiculo.get(i)).setEstado(false);
                    libre = true;
                } else if (i + 1 == vehiculo.size()) {
                    System.out.println("NO hay taxis disponibles");
                    libre = true;
                } else {
                    i++;
                }
            }
        }
    }

    public static void cambiarEstadoLibre(ArrayList<Vehiculo> vehiculo) {
        int aux = 0;
        int id;
        boolean buscar = false;

        if (vehiculo.isEmpty()) {
            System.out.println("NIngun vehiculo registrado");
        } else {
            System.out.println("Introduce el id : ");
            id = lector.nextInt();

            if (id > vehiculo.size()) {
                System.out.println("El id introducido no existe");
            } else {
                while (buscar == false && aux < vehiculo.size()) {
                    if (vehiculo.get(aux).getId() != id) {
                        aux += 1;
                    } else if (vehiculo.get(aux).getId() == id && vehiculo.get(aux) instanceof Taxi) {
                        if (((Taxi) vehiculo.get(aux)).isEstado() == true) {
                            System.out.println("El taxi ya existe pero no toma accion");
                            buscar = true;
                        } else {
                            System.out.println("El taxi cn id :" + vehiculo.get(aux).getId() + "se ha marcado libre");
                            ((Taxi) vehiculo.get(aux)).setEstado(true);
                            buscar = true;
                        }
                    } else if (vehiculo.get(aux).getId() == id && vehiculo.get(aux) instanceof Taxi) {
                        System.out.println("EL id no es de un Taxi.");
                        buscar = true;
                    }
                }
            }
        }
    }
}
