
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *EJERCICIO 7: construir un programa que dado un numero total de horas, devuelve el numero de semanas, dias y horas
 * equivalentes Por ejemplo dado 1000 horas son en total 5 meanas, 6 dias y 16 horas 
 * 
 * @author SOFIA
 */
public class Ejercicio7 {
    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
    
    int horasTotales, horas, semanas, dias;
    horasTotales=teclado.nextInt();    
 //   semanas = horasTotales / 168;
   // dias =(horasTotales%168)/24;
   // horas = (horasTotales%24);
    
    dias=horasTotales/24;
    semanas=dias/7;
    dias%=7;
    horas = horasTotales%24;     
    System.out.println( "las semanas "+ semanas);
    System.out.println( "los dias "+ dias);
    System.out.println( "las horas  "+ horas);
    }
}
