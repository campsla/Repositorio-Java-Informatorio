package Complementarios_1;
import java.util.Scanner;


public class ejercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
 
        System.out.println("Ingresar nombre del usuario  : ");
        String nombre = scan.nextLine();
               
        System.out.println("HOLA "+ nombre +"!!!");

        scan.close();
    }


}