/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_cadena_en_linea;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class EVA2_7_CADENA_EN_LINEA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String gg;
        int esp;
        
        Scanner captu;
        captu = new Scanner(System.in);
        
        System.out.println("Ingresa el texto que deseas imprimir: ");
        gg = captu.nextLine();
        esp = 0;
        System.out.println("Tamaño " + gg.length());
        for(int i = 0; 1 >= gg.length(); i++){
            System.out.println(gg.charAt(esp + 1));
        }
        
        
    }
    
}
