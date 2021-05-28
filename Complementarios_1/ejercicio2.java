package Complementarios_1;


public class ejercicio2 {
    public static void main (String [] args){
       mostrar();    
    }

    public static void mostrar(){
        System.out.print("ingrese su nombre: ");
        holamundo(captarpalabra());
    }
    public static String captarpalabra() {
        String  palabra= System.console().readLine();
        return palabra;
    }

    public static void holamundo(String palabra){
        System.out.println("Hola "+palabra);

    }

}