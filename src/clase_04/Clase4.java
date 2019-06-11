package clase_04;


import taller_1.Problema1;

import java.util.Scanner;

public class Clase4 {
    int edad = 7;


    public void calcular_edad(){
        if (edad >=  18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }

    public void clasificacion_de_edad() {
        String detalle  = "";
        if( edad > 0 && edad < 9) {
            detalle = "Niño";
        } else if (edad >= 9 && edad < 18) {
            detalle = "Adolecente";
        } else if (edad >= 18 && edad < 40) {
            detalle = "Adulto";
        } else {
            detalle = "Anciano";
        }

        System.out.println("Sus categoria es: "+detalle);

    /*    if( edad > 0 && edad < 9) {
            System.out.println("Niño");
        } else if (edad >= 9 && edad < 18) {
            System.out.println("Adolecente");
        } else if (edad >= 18 && edad < 40) {
            System.out.println("Adulto");
        } else {
            System.out.println("Anciano");
        }

     */
    }

    public String menu(int opc) {
        String impresion = "";
        System.out.println("Ejecutando el programa....");

        switch (opc) {
            case 1:
                Problema1 p1 = new Problema1();

                p1.mostrar();
                impresion = "Problema #1";
            break;
            case 2:
                impresion = "Problema #2";
            break;
            case 3:
                impresion = "Problema #3";
            break;
            case 4:
                impresion = "Problema #4";
            break;
            case 5:
                impresion = "Problema #5";
            break;
            case 6:
                impresion = "Problema #6";
            default:
                impresion = "Opción Invalidad!";
            break;
        }
        return  impresion;
    }

    public static void main( String [] arg) {
        int opc = 0;

        Clase4 prueba = new Clase4();

//        prueba.calcular_edad();

        Scanner teclado = new Scanner(System.in);

/* Condiciones nmultiples
        System.out.println("Ingrese su edad: ");
        prueba.edad = teclado.nextInt();
        if ( prueba.edad > 0) {

            prueba.clasificacion_de_edad();
        } else {
            System.out.println("Solamente aceptamos... :)");
        }
 */
        // Menu
        System.out.println("------------------ MENU ------------------");
        System.out.println("1. Problema #1 ");
        System.out.println("2. Problema #2 ");
        System.out.println("3. Problema #3 ");
        System.out.println("4. Problema #4 ");
        System.out.println("5. Problema #5 ");
        System.out.println("6. Problema #6 ");
        System.out.println("7. Salir");
        System.out.print("Ingrese alguna de las opciones ---> ");

        opc = teclado.nextInt();

        System.out.println("Su elección es "+ prueba.menu(opc));

    }
}
