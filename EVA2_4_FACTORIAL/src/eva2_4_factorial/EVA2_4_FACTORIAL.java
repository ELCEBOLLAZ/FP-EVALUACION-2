/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class EVA2_4_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, fact, jaja = 0;
        Scanner captu = new Scanner(System.in);
        System.out.println("Ingresa el numero: ");
        num = captu.nextInt();
        captu.nextLine();
        fact = num;
        for(int i = 1; i<=num; i--){
            jaja=(fact - 1) * fact;
        }
        System.out.println("El factorial de tu numero es: "+jaja);
    }
    
}
