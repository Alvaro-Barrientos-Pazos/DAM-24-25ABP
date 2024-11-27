package ud3.E0701;

public class CuentaCorriente {

    String dni;
    String nombreTitular;
    double saldo;


    CuentaCorriente(String dni, int saldoInicial, String nombreTitular) {
        this(dni, saldoInicial);
        this.nombreTitular = nombreTitular;
    }

    CuentaCorriente(String dni, double saldoInicial) {
        this.saldo = 0;
        this.dni = dni;
        this.saldo = saldoInicial;
    }


    public boolean sacarDinero(int cantidad) {
        if (saldo >= cantidad){
            return true;
        }
        
        return false;
    }


    public void ingresarSaldo(int cantidad){
        saldo += cantidad;
    }

    public void mostrarInfo(){
        System.out.println("nombre del Titular : "+nombreTitular);
        System.out.println("dni : "+dni);
        System.out.println("saldo : "+saldo);
    }


}
