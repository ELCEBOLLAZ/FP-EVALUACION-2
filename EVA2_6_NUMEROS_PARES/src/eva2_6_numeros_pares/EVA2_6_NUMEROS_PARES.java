/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class EVA2_6_NUMEROS_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y;
        
        Scanner captu;
        captu = new Scanner(System.in);
        
        System.out.println("Escribe numero 1: ");
        x = captu.nextInt();
        
        System.out.println("Escribe numero 2: ");
        y = captu.nextInt();
        
        for (int i = x; i <= y; i++){
            int modulo = i % 2;//residuo de la division
            if(modulo == 0)//verdad --> sea impar, para detener la impresion
                continue;
            System.out.println(i + " - ");
        }
    }
    
}
