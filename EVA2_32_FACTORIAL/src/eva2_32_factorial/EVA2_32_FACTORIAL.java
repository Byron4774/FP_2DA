/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_32_factorial;

import java.util.Scanner;

/**
 *
 * @author megan
 */
public class EVA2_32_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int numerito, resu = 1;
        
        System.out.println("Escribe el numero al que le quiere sacar su Factorial");
        numerito = input.nextInt();
        
        for(int i = 1; i <= numerito; i++){
            resu = resu * i;
        }
        System.out.println("El Factorial es:");
        System.out.println(resu);
    }
    
}
