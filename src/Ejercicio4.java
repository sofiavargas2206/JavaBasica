
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SOFIA
 */
public class Ejercicio4 {
    public static void main (String[] args){
    Scanner entrada = new Scanner(System.in);
    float pagoMensual=1000;
    float comision = 150;
    int carrosVendidos;
    float costeCarros, pagoTotal;
    
    System.out.println("ingrese la cantidad de carros: ");
    carrosVendidos = entrada.nextInt();
    System.out.println("ingrese el valor de los carros: ");
    costeCarros = entrada.nextFloat();
    
    pagoTotal=pagoMensual + (comision*carrosVendidos);
    pagoTotal += (0.05f*costeCarros*carrosVendidos);// 0,05 significa el 5%
    
    System.out.println("el total es: " + pagoTotal);
    }
}
