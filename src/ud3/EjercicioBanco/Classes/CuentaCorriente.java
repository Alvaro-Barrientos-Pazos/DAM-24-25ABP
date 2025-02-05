package ud3.ejercicioBanco.classes;

public class CuentaCorriente {

    static String nombreBanco;
    private double saldo;
    public String nombreTitular;
    String dni;

    Gestor gestor;
    
    


    public CuentaCorriente(String dni, int saldoInicial, String nombreTitular) {
        this(dni, saldoInicial);
        this.nombreTitular = nombreTitular;
    }


    public CuentaCorriente(String dni, double saldoInicial) {
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


    public void mostrar(){
        System.out.println("nombre del Titular : "+nombreTitular);
        System.out.println("dni : "+dni);
        System.out.println("saldo : "+saldo);

        if (gestor != null){
            gestor.getData();
        }


    }


    public void changeBank(String banco){
        nombreBanco = banco;
    }


    public String getBankName(){
        return nombreBanco;
    }

    public void addAcounter(String nombreGestor, int telefono, int importeMaximo){
        gestor = new Gestor(nombreBanco, telefono, importeMaximo);
    }

    public double getSaldo(){
        return saldo;
    }

}
