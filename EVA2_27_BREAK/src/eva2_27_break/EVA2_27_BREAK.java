/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_break;

import java.util.Scanner;

/**
 *
 * @author megan
 */
public class EVA2_27_BREAK {

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
            if(valor == adivinar){
                System.out.println("ADIVINASTE!!");
            }else if(valor == -1){
                System.out.println("Gracias por jugar!!");
                break;
            }else{
                System.out.println("NO ADIVINASTE!!");
            }
            
        }while(true);
    }
    
}
