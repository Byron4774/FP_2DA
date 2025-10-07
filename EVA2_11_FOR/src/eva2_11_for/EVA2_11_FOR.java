/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_for;

import java.util.Scanner;

/**
 *
 * @author Byron
 */
public class EVA2_11_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int rep;
        String mensaje;
        System.out.println("Mensaje a repetir:");
        mensaje = input.nextLine();
        System.out.println("Cantidad de repeticiones:");
        rep = input.nextInt();
        for(int i = 1; i <= rep; i++ ){
            System.out.println(mensaje);
        }
        

        
        
        
    }
    
}
