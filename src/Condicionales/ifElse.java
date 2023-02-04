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
public class ifElse {
    public static void main (String[] args){
    int numero, dato=5;
    numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
    if(numero==dato){
    JOptionPane.showMessageDialog(null,"el numero es 5");
    }
    else{
    JOptionPane.showMessageDialog(null, "El numero es dfviferente a 5");
    }
    //camelcase----------
    JOptionPane.showMessageDialog(null, (numero%2==0 ? "El nuemero es par " : "El numero es impar"));
    }
    
}
