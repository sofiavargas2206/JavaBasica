
import java.util.Scanner;
import java.lang.Math; //Importamos la clase Math de la biblioteca del API Java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SOFIA
 */
public class Ejercicio6 {
    
    public static void main (String[] args){
    Scanner valor = new Scanner(System.in);
    double a,b,total;
    a=valor.nextInt();
    b=valor.nextInt();
    
    total= ((Math.pow(a,2))+(Math.pow(b,2))+2*a*b);
    
    System.out.println("su valor es" +total);
    }
    
}
