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
public class Ejercicio6 {
    public static void main (String[] args){
    int numero1,numero2;
    
    numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));    
    numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
    
    if(numero1%2== 0&& numero2%2==0){
    JOptionPane.showMessageDialog(null, "Ambos numeros son pares");
    }
    else if(numero1%2==0 && numero2%2!=0){
        JOptionPane.showMessageDialog(null, "Numero1 es par y numero 2 impar");
    }
    else if(numero1%2!=0 && numero2%2==0){
        JOptionPane.showMessageDialog(null, "Numero1 es impar y numero 2 par");
    }
    else {
         JOptionPane.showMessageDialog(null, "Ambos numeros son impares");
    }
    
    
    }
    
}
