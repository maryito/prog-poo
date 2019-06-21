import clase_06.Monedero;

public class Main {
    public static void main (String [] args) {
//        Problema1 temp = new Problema1();
//        Problema1 n2 = new Problema1();
//
//
//        temp.mostrar();
//        n2.mostrar();
//        Problema2 ejemplo =  new Problema2();
//
//        ejemplo.ejecutar();

        // Clase #6
        String emp1 = "Chino Juancho, S.A";

        Monedero cliente1 = new Monedero(emp1, "62104598", "pepito");
        System.out.println(cliente1.getEmpresa());
        System.out.println(cliente1.getEstado());

        System.out.println("Saldo actual: "+ cliente1.getSaldo());

        cliente1.recibir("62105951", 100.0);
        cliente1.enviar("60101122", 10.0);

    }
}
