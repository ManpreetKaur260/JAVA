/*
 * Leer por teclado dos series de 10 números enteros y mezclarlas en una tercera de
 * la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author luban
 */
public class ejercicio5 {
    
    
    static Scanner lector = new Scanner(System.in);
    
    
    public static void main(String[] args){
        int i,j;
        int a[]= new int[10];
        int b[] = new int [10];
        int c[] = new int[20];
        
        
        System.out.println("Leer la tabla a.....");
        for (i=0; i<10;i++){
            System.out.println("Introduce un número:");
            a[i]=lector.nextInt();
        }
        System.out.println("La tabla 'a' completada..");
        
        
        System.out.println("Leer la tabla b .....");
        for (i=0;i<10;i++){
            System.out.println("Introduce un número:");
            b[i]=lector.nextInt();
        }
        System.out.println("La taba 'b' completada..");
        j=0;
        for(i=0;i<10;i++){
            c[j]=a[i];
            j++;
            c[j]=b[i];
            j++;
        }
        System.out.println("Mostrar tabla 'c':");
        for(j = 0; j < 20; j++){
            System.out.print(c[j] + " ");
            System.out.println("");
        }
    } 
}
