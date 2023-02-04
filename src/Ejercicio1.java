
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SOFIA
 */
public class Ejercicio1 {
    public static void main (String[] args){
         Scanner entrada = new Scanner (System.in);
         System.out.print("Ingrese sus 3 notas para realizar el calculo");
         float nota1= entrada.nextFloat();
         float nota2=entrada.nextFloat();
         float nota3=entrada.nextFloat();
         
         float total = nota1+nota2+nota3;
         
         System.out.println("Su nota es :" +total);
         
         
    
    } 
}
