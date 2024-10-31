/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class EVA2_11_NUMERO_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, z;
        Scanner captu = new Scanner(System.in);
        do{
        int y = z;
        System.out.println("Ingresa numeros: ");
        x = captu.nextInt();
        if(x >= y){
            z = (z - y) + x;
        }
        }while(x >= 0);
        System.out.println("El numero mas grande es: " + z);
    }
    
}
