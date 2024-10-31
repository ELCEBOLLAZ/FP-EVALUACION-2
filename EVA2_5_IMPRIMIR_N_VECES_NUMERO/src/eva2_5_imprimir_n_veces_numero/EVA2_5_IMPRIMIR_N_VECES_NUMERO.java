/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_imprimir_n_veces_numero;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class EVA2_5_IMPRIMIR_N_VECES_NUMERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        String gg;
        
        Scanner captu;
        captu = new Scanner(System.in);
        
        System.out.println("Escribe el texto que se desea imrpimir: ");
        gg = captu.nextLine();
        
        System.out.println("Escribe la cantidad de veces que desea que se imprima el texto: ");
        x = captu.nextInt();
        
        for (int i = 1; i<= x; i++){
            System.out.println(gg);
        }
    }
    
}
