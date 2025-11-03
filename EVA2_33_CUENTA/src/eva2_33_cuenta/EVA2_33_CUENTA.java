/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_33_cuenta;

import java.util.Scanner;

/**
 *
 * @author megan
 */
public class EVA2_33_CUENTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int saldo = 1000000, retiro;
        System.out.println("Su saldo inicial es de $" + saldo);
        while(saldo > 0){
            System.out.println("Cuanto dinero desea retirar?");
            retiro = input.nextInt();
            saldo = saldo - retiro;
            if(saldo > 0){
                System.out.println("Su saldo restante es de $" + saldo);
            }else if(saldo == 0){
                System.out.println("Ya no hay saldo disponible en su cuenta.");
            }else{
                System.out.println("Estas en numeros rojos!");
            }
                
        }
        
    }
    
}
