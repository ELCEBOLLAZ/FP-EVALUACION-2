/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_busqueda_lineal;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class EVA2_18_BUSQUEDA_LINEAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] datos = {10, 20, 30, 40, 50, 60, 70};
        int valor, posi = -1;
        Scanner captu = new Scanner(System.in);
        System.out.println("Valor a buscar: ");
        valor = captu.nextInt();
        for(int i = 0; 1 < datos.length; i++){
            if(valor  == datos[i]){
                //regresar la pocision
                posi = i;
                //detener el ciclo
                break;
            }
        }
        if(posi == -1){
            System.out.println("VALOR NO ENCONTRADO");
        }else{
            System.out.println("El valor esta en la pocision " + posi);
        }
    }
    
}
