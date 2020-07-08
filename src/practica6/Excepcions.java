/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;

/**
 *
 * @author luban
 */
public class Excepcions extends Exception{

    @Override
    public String getMessage() {
        String mensaje = "Has entrado en el mensaje de error";
        return mensaje;
    }
    
    public void controlarValor(){
        System.out.println("Cuando el valor introducido es 0 o negativo,indica no puede introducir este valor");
    }
    
}
