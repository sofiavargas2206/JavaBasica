/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author SOFIA
 */
public class swichcase {
    public static void main (String[] args){
        int dato;
        dato = Integer.parseInt(JOptionPane.showInputDialog("ingrese dato"));
        switch(dato){
                case 1: JOptionPane.showMessageDialog(null, "el numero es 1");
                break;
                case 2: JOptionPane.showMessageDialog(null, "el numero es 2");
                break;
                case 3: JOptionPane.showMessageDialog(null, "el numero es 3");
                break;
                case 4: JOptionPane.showMessageDialog(null, "el numero es 4");
                break;
                case 5: JOptionPane.showMessageDialog(null, "el numero es 5");
                break;
                default: JOptionPane.showMessageDialog(null, "no es numero del 1 al 5");
        }
        
    
    
    }
    
}
