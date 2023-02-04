/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author SOFIA
 */
public class Ejercicio7 {
    public static void main (String[] args){
    
    int numero1,numero2,numero3;
    numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
    numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
    numero3=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 3"));
    
    int[] arreglo={numero1,numero2,numero3};
   
    Arrays.sort(arreglo);                                                                                           
//mostrarlo ordenado
    for (int n : arreglo) {
         JOptionPane.showMessageDialog(null, "El orden es asi: " + n);                                                                                      
    }

    
    
    }
    
}
