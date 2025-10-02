/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_switch;

import java.util.Scanner;

/**
 *
 * @author Byron
 */
public class EVA2_2_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int dia;
        System.out.println("Dia de la semana en numero (1-7):");
        dia = input.nextInt();
        
        switch(dia){//OPCIONES --> CASOS
            case 1:
                System.out.println("Lunes");
                break;//fin del caso y del switch
            case 2:
                System.out.println("Martes");
                break;//fin del caso y del switch
            case 3:
                System.out.println("Miercoles");
                break;//fin del caso y del switch
            case 4:
                System.out.println("Jueves");
                break;//fin del caso y del switch
            case 5:
                System.out.println("Viernes");
                break;//fin del caso y del switch
            case 6:
                System.out.println("Sabado");
                break;//fin del caso y del switch
            case 7:
                System.out.println("Domingo");
                break;//fin del caso y del switch
            default://OPCIONAL, SIEMPRE AL FINAL, NO NECESITA break
                System.out.println("Numero incorrecto");
        }
    }
    
}
