package clase_06;

import java.util.Scanner;

public class Monedero {
    private String empresa;
    private String celular;
    private Double monto;
    private Double saldo;
    private String token;
    private String usuario;
    private Boolean estado;

    public Monedero(String emp, String cel, String usu) {
        System.out.println("Bienvenido a nuestro Constructor");
        // Inicializando con datos de entrada
        this.empresa = emp;
        this.celular = cel;
        this.usuario =  usu;

        // Con encapsulacion
        setEmpresa(emp);
        setCelular(cel);
        setUsuario(usu);

        // Logica de negocio
        this.estado = true;
        this.monto = 0.0;
        this.token =  "1";
        this.saldo = 5.0;

        // Con encapsulacion
        setEstado(true);
        setMonto(0.0);
        setToken("1");
        setSaldo(5.0);
    }

    // Get & Set Encapculación
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public void registro() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Registro de nuestra monedo -"+this.getEmpresa());
        System.out.println("Ingrese el # de celular");
        setCelular(teclado.next() );
        //TODO: continuar implementación
    }

    public  void recibir(String celular, Double monto) {
        double total = 0;

        if( monto >= 1 && monto <= 500) {
            total = getSaldo() + monto;

            setSaldo(total);
            System.out.println("Transferencia realizada ...");
            System.out.println("Nuevo saldo: "+ getSaldo());

        } else {
            System.out.println("No ....");
        }

    }

    public void enviar(String celular, Double monto) {
        double total = 0;

        if( monto >= 1 && monto <= 500) {

            if (monto < getSaldo()) {
                total = getSaldo() - monto;

                setSaldo(total);
                System.out.println("Transferencia realizada ...");
                System.out.println("Nuevo saldo: "+ getSaldo());
            } else {
                System.out.println("No tiene suficiente fondo....");
            }

        } else {
            System.out.println("No ....");
        }
    }
    //TODO: Implementar metodos de consultar
}
