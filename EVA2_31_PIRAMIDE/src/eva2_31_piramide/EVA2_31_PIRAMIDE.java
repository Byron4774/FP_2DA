/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_31_piramide;

import java.util.Scanner;

/**
 *
 * @author megan
 */
public class EVA2_31_PIRAMIDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        Scanner input = new Scanner(System.in);
        int valorxd;
        char asterisco = '*';
        System.out.println("Escribe el numero de hileras que quieres");
        valorxd = input.nextInt();
        
        for(int i = 1; i <= valorxd; i++){
            for(int j = 0; j < i; j++){
                System.out.print(asterisco);
            }
            System.out.println("");
            
        }
        for(int i = valorxd; i >= 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print(asterisco);
            }
            System.out.println("");
        }
    }
    
}
