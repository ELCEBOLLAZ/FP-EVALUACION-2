/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_ciclos_arreglos;

/**
 *
 * @author samue
 */
public class EVA2_14_CICLOS_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dato, valores[]; //un solo arreglo --> valores
        int[] datos, z, y, x; //todos son arreglos
        int[] arreglo = new int[100];
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = (int)(Math.random() * 100);
        }
        //System.out.println(arreglo); 
        for(int i = 0; i < arreglo.length; i++){//leer todos los vañpres
            System.out.print(arreglo[i] + " - ");
        }
        
    }
    
}
