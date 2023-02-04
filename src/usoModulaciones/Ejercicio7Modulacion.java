/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usoModulaciones;

import java.util.Scanner;

/**
 *Se tiene 1000 m de tela, si para una camiseta se usan 30m de tela, 
 * cuanta tela necesitaríamos para 12 camisetas y cuanta nos faltaría para alcanza un total de 640 m de tela usada
 * @author SOFIA
 */
public class Ejercicio7Modulacion {
       public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
    
    int camisetasHechas,totalTela, camisetasTotal, faltante,telaPrincipal ;
  
    telaPrincipal=1000; 
    camisetasHechas=teclado.nextInt();    

    camisetasTotal= camisetasHechas*30;
    faltante = telaPrincipal%camisetasTotal;
    totalTela = faltante+camisetasTotal;
   
    System.out.println( "modular "+ faltante);
    System.out.println( "las semanas "+ totalTela);

       
       
       }
}
