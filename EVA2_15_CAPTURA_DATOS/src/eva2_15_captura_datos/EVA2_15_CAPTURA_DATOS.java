/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_captura_datos;

import java.util.Scanner;

/**
 *
 * @author Byron
 */
public class EVA2_15_CAPTURA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int tama;
        System.out.println("Cuantas calificaciones quieres capturar?");
        tama = input.nextInt();
        int califas[] = new int[tama];
        //captura
        for(int i = 0; i < califas.length; i++){
            System.out.println("Calificacion #" +(i+1) + ":");
            califas[i] = input.nextInt();
        }
        //lectura
        for(int i = 0; i < califas.length; i++){
            System.out.println("[" + califas[i] + "]");
        }
        //PROMEDIO DEL GRUPO?
        //SUMAR TODAS LAS CALIFICACIONES
        int sumaCalifas = 0;
        for(int i = 0; i < califas.length; i++){
            sumaCalifas = sumaCalifas + califas[i];
            //sumaCalifas += califas[i];
        }
        System.out.println("acumulado = " + sumaCalifas);
        double promedio = sumaCalifas / (double)califas.length;
        System.out.println("Promedio: " + promedio);
    }
    
}
