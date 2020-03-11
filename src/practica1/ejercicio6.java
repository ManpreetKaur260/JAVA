/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author luban
 */
public class ejercicio6 {
    static Scanner lector = new Scanner(System.in);
    
    
    public static void main(String[] args){
        int i,j;
        int a[]= new int[12];
        int b[] = new int [12];
        int c[] = new int[24];
        
        
        System.out.println("Leer la tabla a.....");
        for (i=0; i<12;i++){
            System.out.println("Introduce un número:");
            a[i]=lector.nextInt();
        }
        System.out.println("La tabla 'a' completada..");
        
        
        System.out.println("Leer la tabla b .....");
        for (i=0;i<12;i++){
            System.out.println("Introduce un número:");
            b[i]=lector.nextInt();
        }
        System.out.println("La tabla 'b' completada..");
        j=0;
        i=0;
        while(i<12){
            for (int k=0; k<3;k++){
                c[j]=a[i+k];
                j++;
            }
            for (int k=0; k<3;k++){
                c[j]=b[i+k];
                j++;
            }
            i+=3;
        }
        System.out.println("Mostrar la tabla 'c':");
        for(j=0; j<24;j++){
            System.out.print(c[j] + " ");
        }
        System.out.println("");
}
}
