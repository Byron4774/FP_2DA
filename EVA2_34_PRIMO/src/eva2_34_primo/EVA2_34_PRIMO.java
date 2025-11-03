/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_34_primo;

import java.util.Scanner;

/**
 *
 * @author megan
 */
public class EVA2_34_PRIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int valor;
        boolean primo = true;
        
        System.out.println("Introduzca un numero para determinar si es primo o no:");
        valor = input.nextInt();
        
        for(int i = 2; i < valor; i++){
            int residuo = valor % i;
            if(residuo == 0){
                primo = false;
                break;
            }
        }
        if(primo)
            System.out.println("El valor " + valor + " Es primo");
        else
            System.out.println("El valor " + valor + " No es primo");
        

    }
    
}
