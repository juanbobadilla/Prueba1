
package aplicacion1;

import java.util.Scanner;

/**
 *
 * @author Juan Pablo Bobadilla and Juan David Tovar
 */
public class Aplicacion1 {

    
    public static void main(String[] args) {
        
         //importamos el escaner       
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
int grado;
        
        System.out.println("digite su nombre");
        nombre=leer.nextLine();
        System.out.println("digite su edad");
        edad=leer.nextInt();
	System.out.println("digite su grado");
        grado=leer.nextInt();
        
        System.out.print("Binevenido "+ nombre+" tu edad es: " + edad + "su grado es: "+ grado);
        
        
    }
    
}
