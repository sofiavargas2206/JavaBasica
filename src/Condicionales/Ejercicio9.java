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
public class Ejercicio9 {
    public static void main (String[] args){
        int dia,mes,año;
    dia=Integer.parseInt(JOptionPane.showInputDialog("Ingrese dia"));
    mes=Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes"));
    año=Integer.parseInt(JOptionPane.showInputDialog("Ingrese año"));
    
    if((dia>1 && dia<=30)&&(mes>1 && mes<=12) && (año>1)){
    JOptionPane.showMessageDialog(null, "La fecha se encuentra correcta");
    }
    else{
         JOptionPane.showMessageDialog(null, "La fecha se encuentra incorrecta verifique que año sea mayor a 1, mes este entre 1 y 2 y dia entre 1 y 30");
    }
    }
    
}
