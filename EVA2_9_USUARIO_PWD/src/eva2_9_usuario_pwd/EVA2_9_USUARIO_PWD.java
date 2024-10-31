/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_usuario_pwd;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class EVA2_9_USUARIO_PWD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONSTANTES
        String usu, pwd;
        
        Scanner captu = new Scanner(System.in);
        
        do{
        System.out.println("Introduce tu usuario");
        usu = captu.nextLine();
        
        System.out.println("Introduce tu contraseña");
        pwd = captu.nextLine();
        }while(!(usu.equals("admin") && pwd.equals("1234")));
        System.out.println("ACCESO CONCEDIDO");
    }
    
}
