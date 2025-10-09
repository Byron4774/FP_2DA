/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author Byron
 */
public class EVA2_13_NUMEROS_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int ini, fin;
        System.out.println("Inicio");
        ini = input.nextInt();
        System.out.println("Fin");
        fin = input.nextInt();
        
        for(int i = ini; i <= fin; i++){
            int resi = i % 2;
            if(resi == 0){
                System.out.print(i + "-");
            }
            
        }
    }
    
}
