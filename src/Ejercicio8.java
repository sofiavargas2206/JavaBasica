
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SOFIA
 */
public class Ejercicio8 {
    public static void main (String[] args){
        double a,b,c, xP,xN;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese el valor que tendra a");
        a=teclado.nextDouble();
        System.out.println("Ingrese el valor que tendra b");
        b=teclado.nextDouble();
        System.out.println("Ingrese el valor que tendra c");
        c=teclado.nextDouble();
        
        xP=((-b)+(Math.sqrt(Math.pow(b,2)-4*a*c)))/2*a;
        
        xN=((-b)-(Math.sqrt(Math.pow(b,2)-4*a*c)))/2*a;
        
           
        System.out.println("La ecuacion cuadratica positiva es:"+xP);
        System.out.println("La ecuacion cuadratica negativa es:"+xN);
    }
}
