
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SOFIA
 */
public class Ejercicio5 {
    public static void main (String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        float nota1,nota2,nota3,nota4, total ;
        
        System.out.println("Ingrese sus 3 notas");
        nota1=teclado.nextFloat();//4,0  
        nota2=teclado.nextFloat();//1,0
        nota3=teclado.nextFloat();//2,0
        nota4=teclado.nextFloat();//5,0
        
        nota1*=0.10f;
        nota2*=0.25f;
        nota3*=0.25f;
        nota4*=0.40f;
        total = (nota1+nota2+nota3+nota4);
        System.out.println("Su nota final es: " + total);
        
                
    }
}
