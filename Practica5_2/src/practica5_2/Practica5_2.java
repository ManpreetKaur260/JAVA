/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5_2;

import java.util.ArrayList;
import java.util.Scanner;
import static practica5_2.Taxi.buscarTaxiLibre;
import static practica5_2.Taxi.cambiarEstadoLibre;
import static practica5_2.Vehiculo.buscarVehiculo;
import static practica5_2.Vehiculo.mostrarVehiculo;

/**
 *
 * @author luban
 */
public class Practica5_2 {

    /**
     * @param args the command line arguments
     */
    static Scanner lector = new Scanner(System.in);
        
    public static void main(String[] args) {
        
        ArrayList <Vehiculo> vehiculo = new ArrayList ();
        int contador = 0;
        int contadorLicencias = 99;
        mostrarMenu(vehiculo,contador, contadorLicencias);
        
    }
     
    public static void mostrarMenu(ArrayList<Vehiculo> vehiculo,int contador, int contadorLicencias){
        int opcion;
        boolean salir = false;
        while(!salir){
            System.out.println("----------Menu----------");
            System.out.println("Opcion 1 : Alta taxis");
            System.out.println("Opcion 2 : Alta VTC");
            System.out.println("Opcion 3 : Alta Autobuses");
            System.out.println("Opcion 4 : Buscar vehiculo");
            System.out.println("Opcion 5 : Buscar primer taxi libre");
            System.out.println("Opcion 6 : Cambiar estado de un taxi a libre");
            System.out.println("Opcion 7 : Mostrar todos los vehiculos");
            System.out.println("Opcion 8 : Salir");
            System.out.println("Escribe una de las opciones");
            opcion = lector.nextInt();
            switch(opcion){
                case 1:
                    Taxi nuevoTaxi = new Taxi();
                    
                    if(vehiculo.add(nuevoTaxi.pedirAlta())){
                        contador +=1;
                        contadorLicencias += 1;
                        nuevoTaxi.setId(contador);
                        nuevoTaxi.setNumeroLicencia(contadorLicencias);
                        
                    }
                    break;
                case 2:
                    VTC nuevoVTC = new VTC();
                    if(vehiculo.add(nuevoVTC.pedirAlta())){
                        contador +=1;
                        nuevoVTC.setId(contador);
                    }   
                    break;
                case 3:
                     Autobus nuevoAutobus = new Autobus();
                     if(vehiculo.add(nuevoAutobus.pedirAlta())){
                         contador +=1;
                         nuevoAutobus.setId(contador);
                     }
                    break;
                case 4:
                    buscarVehiculo(vehiculo);
                    break;
                case 5:
                    buscarTaxiLibre(vehiculo);
                    break;
                case 6:
                    cambiarEstadoLibre(vehiculo);
                    break;
                case 7:
                    mostrarVehiculo(vehiculo);
                    break;
                case 8:
                    salir = true;
                    break;
                
            }
        }
    }
    
}
