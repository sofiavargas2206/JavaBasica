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
public class Ejercicio5 {
    public static void main(String[] args){
        int horas, salario, adicionales;
        horas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas"));
        if(horas<=40){
        salario=horas*16;
        }
        else{
        adicionales=horas-40;
        salario= (40*16)+(adicionales*20);        
       
        }
         JOptionPane.showMessageDialog(null, salario);
    
    }
}
