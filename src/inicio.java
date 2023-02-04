
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SOFIA
 */
public class inicio {
    
    public static void main(String[] args){
        final int entero = 12; 
        //concatenar es con un +
//    System.out.println("Bienvenid@");
//    Scanner entrada = new Scanner (System.in);
//    String nombre;
//    char letra;
//    nombre = entrada.nextLine();
//    int edad;
//    edad = entrada.nextInt();
//    letra= entrada.next().charAt(1);
//    
//   System.out.println("su nombre es "+nombre+" y su edad" + edad + "la psoicion es " +letra);
   
      String nombre;
    char letra;
    int edad;
    double decimal;
    nombre=  JOptionPane.showInputDialog("ingrese su nombre ");
    edad=  Integer.parseInt(JOptionPane.showInputDialog("ingrese su edad "));
    letra = JOptionPane.showInputDialog("Ingrese su palabra favorita").charAt(0);
    decimal = Double.parseDouble(JOptionPane.showInputDialog("ingrese valor de PI "));
    
    System.out.println("sus repuestas fueron "+nombre+" " + edad + " "+ " " + letra+" "+" "+decimal);
    JOptionPane.showMessageDialog(null,""+edad);
    
   
    
    
    }
    
}
