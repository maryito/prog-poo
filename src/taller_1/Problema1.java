package taller_1;
import java.util.Scanner;

public class Problema1 {
    String nombre;

    Scanner teclado = new Scanner(System.in);

    public void mostrar() {
        System.out.println("Bienvenido a mi taller #1");
        System.out.print("Ingrese su nombre: ");

        // Captura de información
        nombre = teclado.next();

        System.out.println("Su nombre es: "+ nombre);

    }

}
