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
public class Ejercicio4 {
    public static void main (String[] args){
    float valor,descuento;
    
    valor=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la compra"));
    if(valor>=300){
    descuento=valor*0.20f;
    valor-=descuento;
    JOptionPane.showMessageDialog(null, "El valor tiene decuento quedando en "+valor);
    }
    else{
     JOptionPane.showMessageDialog(null, "El valor es "+valor);
    }
    
    }
    
}
