package Complementarios_2;
import java.util.ArrayList;
import java.util.Collections;

public class ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> cartas = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            cartas.add("Carta " + (i + 1));
        }

        System.out.print("Orden normal: ");
        for (String card : cartas) {
            System.out.print(card + " ");
        }

        Collections.reverse(cartas);
        System.out.println("");
        System.out.print("Orden inverso: ");
        for (String card : cartas) {
            System.out.print(card + " ");
        }

        Collections.shuffle(cartas);
        System.out.println("");
        System.out.print("Orden aleatorio: ");
        for (String card : cartas) {
            System.out.print(card + " ");
        }
    }
}
