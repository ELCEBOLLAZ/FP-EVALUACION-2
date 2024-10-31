/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_promedio_califas;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class EVA2_2_PROMEDIO_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa, sumaCall;
        Scanner captu = new Scanner(System.in);
        //inicializar el contador
        sumaCall = 0;
        for(int i = 1; i <= 10; i++){
        System.out.println("Estudiante # "+ 1);
        System.out.println("Cual es tu calificacion?");
        califa = captu.nextInt();
        captu.nextLine();
        //acumular las calififcaciones
        sumaCall = sumaCall + califa;
        }
        //CALCULAR EL PROMEDIO
        //DIVISIONES EN JAVA --> SI DIVIDIMOS ENTEROS
        double promedio = sumaCall / 10;
        System.out.println("Promedio = " + promedio);//sumatoria
        
        
    }
    
}
