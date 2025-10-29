/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_adivinar_numero;

import java.util.Scanner;

/**
 *
 * @author megan
 */
public class EVA2_25_ADIVINAR_NUMERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int valor, adivinar;
        
        do{
            adivinar = (int)(Math.random() * 5);
            System.out.println("Adivina el numero. -1 para terminar.");
            valor = input.nextInt();
            if(valor == adivinar)
                System.out.println("ADIVINASTE!!");
            
        }while(valor != -1);//Condicion para repetir(true)
                
    }
    
}
