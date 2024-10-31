/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class EVA2_3_POTENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base, expo;
        //inicio del acumulador
        Scanner captu = new Scanner(System.in);
        System.out.println("Cual es tu base: ");
        base = captu.nextInt();
        captu.nextLine();
        System.out.println("Cual es tu exponente: ");
        expo = captu.nextInt();
        captu.nextLine();
        int resu = 1;
        for(int i = 1; i<= 3; i++){
                resu = resu * base;
        }
        System.out.println("El resultado es: "+resu);
    }
    
}
