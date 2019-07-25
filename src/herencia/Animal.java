package herencia;

public class Animal {
    String nombre;

    public void correr(){
        System.out.println("Corriendo...");
    }
    public void comer(){
        System.out.println("Comiendo...");

    }
}

abstract class  Raza {

    public void Origen(String nom) {}
}