/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_arreglos_for;

/**
 *
 * @author Byron
 */
public class EVA2_14_ARREGLOS_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[] = new int[10];

        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int)(Math.random() * 100);
        }
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("[" + arreglo[i] + "]");
        }
        
        
    }
    
}
