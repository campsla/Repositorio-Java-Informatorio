package Complementarios_1;
import java.util.Scanner;


public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre y apellido: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese su dirección actual: ");
        String direccion = sc.nextLine();
        System.out.print("Ingrese su ciudad actual: ");
        String ciudad = sc.nextLine();

        sc.close();

        Info Persona = new Info(nombre, edad, direccion, ciudad);
        System.out.println(Persona);
    }

}

class Info {
    String nombre;
    int edad;
    String direccion;
    String ciudad;

    public Info(String nombre, int edad, String direccion, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return  this.ciudad + " - " + direccion + " - "+ edad +" - " + nombre + "";
    }
}
    
    

