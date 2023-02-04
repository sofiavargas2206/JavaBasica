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
public class Ejercicio10 {
    public static void main (String[] args){
        int dia,mes,año;
    dia=Integer.parseInt(JOptionPane.showInputDialog("Ingrese dia"));
    mes=Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes"));
    año=Integer.parseInt(JOptionPane.showInputDialog("Ingrese año"));
    
    if((dia>1 && dia<=31)&&(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12 ) && (año>1)){
        JOptionPane.showMessageDialog(null, "La fecha se encuentra correcta");
    }
    else if((dia <28) && (mes==2) && (año>1) ){
        JOptionPane.showMessageDialog(null, "La fecha se encuentra correcta");
    }
    else if((dia>1 && dia<=30)&&( mes==4 || mes==6 || mes==9 || mes==11 ) && (año>1)){
        JOptionPane.showMessageDialog(null, "La fecha se encuentra correcta");
    }
    else {
        JOptionPane.showMessageDialog(null, "La fecha se encuentra incorrecta");
    
    }
    
    }
}
