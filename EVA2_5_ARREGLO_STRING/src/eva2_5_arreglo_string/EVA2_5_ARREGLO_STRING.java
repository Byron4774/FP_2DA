/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_arreglo_string;

import java.util.Scanner;

/**
 *
 * @author Byron
 */
public class EVA2_5_ARREGLO_STRING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a,b,c;
        int x[], y,z;
        String cadenas[] = new String[7];
        cadenas[0] = "Lunes";
        cadenas[1] = "Martes";
        cadenas[2] = "Miercoles";
        cadenas[3] = "Jueves";
        cadenas[4] = "Viernes";
        cadenas[5] = "Sabado";
        cadenas[6] = "Domingo";
        
        Scanner input = new Scanner(System.in);
        int dia;
        System.out.println("Dia de la semana de (0 a 6):");
        dia = input.nextInt();
        System.out.println(cadenas[dia]);
 
 
        
    }
    
}
