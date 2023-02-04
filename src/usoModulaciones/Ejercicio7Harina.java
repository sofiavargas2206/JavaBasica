/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usoModulaciones;

import java.util.Scanner;

/**
 * se tiene una cantidad total de 810GR de harina, actualmente ya se han usado 425gr para hacer una torta 
 * que cantidad de harina me haria falta por usar para haber usado la totalidad de la harina 
 * @author SOFIA
 */
public class Ejercicio7Harina {
      public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
    int harinaTotal=810, torta=425, harinaFaltante;
    harinaFaltante=harinaTotal%torta;
    System.out.println( "las semanas "+ harinaFaltante);        
      
      }
}
