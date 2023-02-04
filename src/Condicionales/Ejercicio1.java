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
public class Ejercicio1 {
    public static void main (String[] args){
    int numero;
    
    numero=Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
    
    JOptionPane.showMessageDialog(null,(numero%10==0 ? "numero es multiplo de 10" : "numero no es multiplo de 10"));
    
    }
}
