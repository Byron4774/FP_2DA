/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_do_while;

import java.util.Scanner;

/**
 *
 * @author megan
 */
public class EVA2_20_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int opcion;
        do{
        System.out.println("MENU PRINCIPAL-----------");
        System.out.println("Presiona la opcion:");
        System.out.println("1. Pedidos:");
        System.out.println("2. Proveedores:");
        System.out.println("3. Facturacion:");
        System.out.println("4. Salir");
        opcion = input.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Pedidos del sistema!!");
                break;
            case 2:
                System.out.println("Proveedores del sistema!!");
                break;
            case 3:
                System.out.println("Facturacion del sistema!");
                break;
        }
        }while(opcion != 4);//mientras sea diferente de 4
        System.out.println("Fin del programa.");
    }
    
}
