/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_for;

import java.util.Scanner;

/**
 *
 * @author Byron
 */
public class EVA2_10_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // imprimir del 1 al 20
        Scanner input = new Scanner(System.in);
        for(int i = 1; i <= 20; i++){
            System.out.print(i + "-");
        }
        System.out.println("");
        for(int i = 20; i >= 1; i--){
            System.out.print(i + "-");
        }
        // imprimir los PARES de 0 a 100
        // +=, -=, *=, /=
        System.out.println("");
        for(int i = 0; i <= 100; i += 2){
            System.out.print(i + "-");
        }
        System.out.println("");
        for(int i = 100; i >= 0; i -= 2){
            System.out.print(i + "-");
        }
        System.out.println("");
        
        int prim, segu;
        
        System.out.println("Introduzca su primer numero");
        prim = input.nextInt();
        System.out.println("Introduzca su segundo numero");
        segu = input.nextInt();
        
        for(int i = prim; i <= segu; i++){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        for(int i = segu; i >= prim; i--){
            System.out.print(i+" ");
        }
    }
    
}
