/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_validar;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class EVA2_8_VALIDAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        Scanner captu = new Scanner(System.in);
        do{
        System.out.println("Numero correspondiente al dia (1 - 7):");
        dia = captu.nextInt();
        }while(dia <  1 || dia > 7);
        
        switch(dia){
            case 1:
                System.out.println("Lunes");
                break;//ultima instruccuion - FIN DEL CASO
                case 2:
                System.out.println("Martes");
                break;//ultima instruccuion - FIN DEL CASO
                case 3:
                System.out.println("Miercoles");
                break;//ultima instruccuion - FIN DEL CASO
                case 4:
                System.out.println("Jueves");
                break;//ultima instruccuion - FIN DEL CASO
                case 5:
                System.out.println("Viernes");
                break;//ultima instruccuion - FIN DEL CASO
                case 6:
                System.out.println("Sabado");
                break;//ultima instruccuion - FIN DEL CASO
                case 7:
                System.out.println("Domingo");
                break;//ultima instruccuion - FIN DEL CASO
                default:
                    System.out.println("Ingresa un numero entre 1 y 12");
        }
    }
    
}
