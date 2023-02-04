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
public class Ejercicio2 {
    public static void main (String[] args){
    int numero1,numero2;
    numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
    numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
   if(numero1>numero2){
   JOptionPane.showMessageDialog(null, "El numero 1 es mayor que el numero 2");
   }else if(numero1==numero2){
   JOptionPane.showMessageDialog(null, "El numero 1 es igual que el numero 2");
   }
   else{
   JOptionPane.showMessageDialog(null, "El numero 1 es menor que el numero 2");
   }
    }
    
}
