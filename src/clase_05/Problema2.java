package clase_05;

import java.util.Scanner;
import java.util.Vector;
public class Problema2 {
    Double interes = 0.02;
    Vector trans =  new Vector();
    float [] trans2 =  new float[10];
    String nom = null;
    String ape = null;
    float capital = 0;

    public void ejecutar() {
        float temp = 0;
        double saldo = 0;
        double total = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Problema #2");

        System.out.print("Nombre: ");
        nom = teclado.next();

        System.out.print("\n Apellido: ");
        ape = teclado.next();

        System.out.println("Monto de la inversion: ");
        capital = teclado.nextFloat();

        System.out.println("Monto #1 -> ");
        trans2[0] = teclado.nextFloat();

        System.out.println("Monto #2 -> ");
        trans2[1] = teclado.nextFloat();

        System.out.println("Monto #3 -> ");
        trans2[2] = teclado.nextFloat();

        System.out.println("Monto #4 -> ");
        trans2[3] = teclado.nextFloat();

        System.out.println("Monto #5 -> ");
        trans2[4] = teclado.nextFloat();

        System.out.println("Monto #6 -> ");
        trans2[5] = teclado.nextFloat();

        System.out.println("Monto #7 -> ");
        trans2[6] = teclado.nextFloat();

        System.out.println("Monto #8 -> ");
        trans2[7] = teclado.nextFloat();

        System.out.println("Monto #9 -> ");
        trans2[8] = teclado.nextFloat();

        System.out.println("Monto #10 -> ");
        trans2[9] = teclado.nextFloat();

        // TODO: Implementar con for

        // La logica
        temp = ( trans2[0] + trans2[1] + trans2[2] + trans2[3] + trans2[4] + trans2[5] + trans2[6] + trans2[7] + trans2[8] + trans2[9]);
        saldo = capital + temp;

        if (saldo >= 10000) {
            interes += 0.05;
        } else if ( saldo >= 500) {
            interes += 0.03;
        } else if ( saldo >= 100) {
            interes +=  0.01;
//            interes =  interes + 0.01
        } else {
            System.out.println("No aplica");
        }

        total = saldo + (saldo * interes);

        System.out.println("Su total del mes es de -> "+ total);

    }

    public static void main(String[] args) {
        Problema2 ejemplo = new Problema2();

        ejemplo.ejecutar();

    }
}
