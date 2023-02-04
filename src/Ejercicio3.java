
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SOFIA
 */
public class Ejercicio3 {
    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
    float guillermo, luis, juan, total;
    System.out.println("ingrese el dinero que tiene guillermo");
    guillermo = teclado.nextFloat();
    
    luis=guillermo/2;
    juan = (luis+guillermo)/2;
    
    total= juan+luis+guillermo;
    
    System.out.println("El total que tienen los 3 es: " + total);
    
            
    
    }
}

