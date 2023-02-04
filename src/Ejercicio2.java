
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SOFIA
 */
public class Ejercicio2 {
    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
    float horasTrabajadas, salarioHora;
    float salarioSemanal;
    
    System.out.println("Ingrese las horas trabajadas");
    horasTrabajadas = teclado.nextFloat();
    
     System.out.println("Ingrese el valor por hora del salario");
    salarioHora = teclado.nextFloat();
    
    salarioSemanal=horasTrabajadas*salarioHora;
    System.out.println("Su salario es: " +salarioSemanal);
    
    }
    
}
