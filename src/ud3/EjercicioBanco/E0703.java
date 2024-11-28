package ud3.EjercicioBanco;

import ud3.EjercicioBanco.Classes.CuentaCorriente;

public class E0703 {

    public static void main(String[] args) {
        CuentaCorriente cCorriente = new CuentaCorriente("123045V",100,"Álvaro Barrientos Pazos");

        System.out.println(cCorriente.saldo);
        System.out.println(cCorriente.nombreTitular);
        System.out.println(cCorriente.dni);
    }

}
