
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SOFIA
 */
public class Operadores {
    public static void main (String[] args ){
      
//        float numero1, numero2;
        Scanner entrada = new Scanner (System.in);
//        numero1=entrada.nextFloat();
//        numero2=entrada.nextFloat();
//        
//        float suma = numero1+numero2, resta = numero1-numero2;
//        float multiplicacion = numero1*numero2, division = numero1/numero2, modulo=numero1%numero2; 
//        
//        
//        System.out.println(suma);
//        System.out.println(resta);
//        System.out.println(multiplicacion);
//        System.out.println(division);
//        System.out.println(modulo);
        
//        float numero1=10, numero2=5;
//        numero1*=numero2;
//        System.out.println(numero1);

          int x=5, y;
// en este caso como se le esta asignando primero x a y el valor de y es 5 y de x es 6          
          y=x++; 
// en este caso como se le esta incrementando primero x y luego asignango a y el valor de y es 6 y de x es 6
          y=++x; 
// en este caso como se le esta asignando primero x a y el valor de y es 5 y de x es 4          
          y=x--; 
// en este caso como se le esta incrementando primero x y luego asignango a y el valor de y es 4 y de x es 4
          y=--x;
    }
}
