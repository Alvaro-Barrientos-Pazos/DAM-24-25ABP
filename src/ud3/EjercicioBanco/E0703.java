package ud3.ejercicioBanco;

import ud3.ejercicioBanco.classes.CuentaCorriente;

public class E0703 {

    public static void main(String[] args) {
        CuentaCorriente cCorriente = new CuentaCorriente("123045V",100,"Álvaro Barrientos Pazos");

        System.out.println(cCorriente.getSaldo());
        System.out.println(cCorriente.nombreTitular);
        //System.out.println(cCorriente.dni);
    }

}
