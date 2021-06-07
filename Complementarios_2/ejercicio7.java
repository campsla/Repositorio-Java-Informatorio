package Complementarios_2;

public class ejercicio7 {
    public static void main(String[] args) {
        String[] array = fizzBuzz(1, 8);
        for (String s : array) {
            System.out.print(s + " - ");
        }
    }
    public static String[] fizzBuzz(int initial, int limit) {
        if (limit < initial)
            throw new RuntimeException("El primer numero debe ser menor al segundo.");

        String[] array = new String[limit - 1];
        array[0] = String.valueOf(initial);
        for (int i = 1; i < array.length; i++) {
            if (((initial + i) % 2 == 0) && ((initial + i) % 3 == 0)) {
                array[i] = "FizzBuzz";
            } else if ((initial + i) % 3 == 0) {
                array[i] = "Buzz";
            } else if ((initial + i) % 2 == 0) {
                array[i] = "Fizz";
            } else {
                array[i] = String.valueOf(initial + i);
            }

        }

        return array;
    }


    
}
