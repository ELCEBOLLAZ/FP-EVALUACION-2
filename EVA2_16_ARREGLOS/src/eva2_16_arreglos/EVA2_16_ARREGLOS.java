/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_arreglos;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class EVA2_16_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantidad;
        int califas[];
        String nombres[];
        Scanner captu = new Scanner(System.in);
        System.out.println("Cantidad de calificaciones a capturar:");
        cantidad = captu.nextInt();
        captu.nextLine();
        califas = new int[cantidad];
        nombres = new String[cantidad];
        
        for(int i = 0; i < califas.length; i++){
            System.out.println("Nombre del estudiante #" + i);
            nombres[i] = captu.nextLine();
            
            System.out.println("Calificacion estudiante #" + i);
            califas[i] = captu.nextInt();
            captu.nextLine();
        }
        //IMPRIMIR CALIFICACIONES
        for(int i = 0; i < califas.length; i++){
            System.out.print(nombres[i] + ":" + califas[i] + "-");
        }
    }
    
}
