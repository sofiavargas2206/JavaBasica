/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author SOFIA
 */
public class Ejercicio8 {
    public static void main (String[] args){
    
    int numero1;
    numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
    if(numero1<10){
    JOptionPane.showMessageDialog(null, "El numero tiene 1 cifra");
    }
    else if (numero1<100){
    JOptionPane.showMessageDialog(null, "El numero tiene 2 cifras");
    
    }
    else if (numero1 <1000){
    JOptionPane.showMessageDialog(null, "El numero tiene 3 cifras");
    
    }
    else{
    
    JOptionPane.showMessageDialog(null, "El numero tiene 4 cifras ó mas");
    }
    
    
            
            }
}
