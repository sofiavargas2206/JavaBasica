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
public class Ejercicio11 {
    public static void main (String[] args){
        int numero1,numero2, sum,rest,mult,div;
        char operacion;
    numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero1"));
    numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero2"));
    operacion=JOptionPane.showInputDialog("Ingrese operacion").charAt(0);
    
    switch(operacion){
    case 'S':
    case 's': 
        sum=numero1+numero2;
        JOptionPane.showMessageDialog(null,sum);
        break;
    case 'R':
    case 'r':
        rest=numero1-numero2;
        JOptionPane.showMessageDialog(null,rest);
        break;
    case 'M':
    case 'm':
        mult=numero1*numero2;
        JOptionPane.showMessageDialog(null,mult);
        break;
    case 'D':
    case 'd':
        div=numero1/numero2;
        JOptionPane.showMessageDialog(null,div);
        break;
    }
   
    }
}
