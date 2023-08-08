package pkg02_saludador;

import java.util.Scanner;

public class Saludador {

    /*
        Pide un nombre por consola y salúdalo por consola.
    */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        
        System.out.println("Escribe tu nombre:");
        String nombre = sc.next();
        
        System.out.println("¡Hola "+nombre+"!");
        
    }
    
}
