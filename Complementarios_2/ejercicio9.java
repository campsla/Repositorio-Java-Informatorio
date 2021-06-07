package Complementarios_1;
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una frase o texto por favor: ");
        String texto = sc.nextLine();

        System.out.print("Ingrese que letra desea contar: ");
        char a = sc.nextLine().charAt(0);
        sc.close();

        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (a == texto.charAt(i)) {
                contador++;
            }
        }

        System.out.println("La letra: " + a + " fue encontrada " + contador + " veces");
    }
    
}