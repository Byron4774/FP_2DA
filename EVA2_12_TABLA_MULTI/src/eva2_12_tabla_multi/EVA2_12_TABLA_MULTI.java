/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_tabla_multi;

import java.util.Scanner;

/**
 *
 * @author Byron
 */
public class EVA2_12_TABLA_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int prim;
        
        
        System.out.println("Introduce el numero:");
        prim = input.nextInt();
        
        for(int i = 1; i <= 10 ; i++){
            System.out.println(i + " * " + prim + (" = " + i * prim));
            
        }
        
    }
    
}
