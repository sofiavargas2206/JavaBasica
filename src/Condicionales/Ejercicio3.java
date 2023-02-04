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
public class Ejercicio3 {
    public static void main (String[] args){
        char letra;
    letra=JOptionPane.showInputDialog("Ingrese la letra").charAt(0);
    
    if(Character.isUpperCase(letra)){
    JOptionPane.showMessageDialog(null, "La letra es mayuscula");
    }else{
    
    JOptionPane.showMessageDialog(null, "La letra es minuscula");
    }
    
    }
    
}
