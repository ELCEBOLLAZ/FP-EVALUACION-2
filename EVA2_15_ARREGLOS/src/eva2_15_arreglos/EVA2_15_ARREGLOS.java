/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_arreglos;

/**
 *
 * @author samue
 */
public class EVA2_15_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] diasSemana = new String[7];
        diasSemana[0] = "Domingo";
        diasSemana[1] = "Lunes";
        diasSemana[2] = "Martes";
        diasSemana[3] = "Miercoles";
        diasSemana[4] = "Juevez";
        diasSemana[5] = "Viernes";
        diasSemana[6] = "Sabado";
        
        //IMPRIMIR
        for(int i = 0; i < diasSemana.length; i++){
            System.out.println(diasSemana[i]);
        }
    }
    
}
