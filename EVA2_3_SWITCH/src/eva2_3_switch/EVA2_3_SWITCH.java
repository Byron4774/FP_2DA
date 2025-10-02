/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_switch;

/**
 *
 * @author Byron
 */
public class EVA2_3_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String valor = "Lunes";
        switch(valor){
            case "Lunes":
                System.out.println(1);
                break;
            case "Martes":
                System.out.println(2);
                break;
            case "Miercoles":
                System.out.println(3);
                break;
            case "Jueves":
                System.out.println(4);
                break;
            case "Viernes":
                System.out.println(5);
                break;
            case "Sabado":
                System.out.println(6);
                break;
            case "Domingo":
                System.out.println(7);
                break;
            default:
                System.out.println("Valor incorrecto");
                
            
        }
        
        /* double valorDouble = 5.5;
           switch(valorDouble){ //SOLO ACEPTA VALORES NUMERCIOS INT
        case 1.1:
                System.out.println("VALOR 1.1");
                break;
        case 5.5:
                System.out.println("VALOR 5.5");
                break;
        }
        */
        
    }
    
}
