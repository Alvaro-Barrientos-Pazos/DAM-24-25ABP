/*
 *  Diseñar la clase cuentacorriente, que almacena los datos: DNI y nombre del
    titular, asi como el saldo. Las operaciones típicas con una cuenta corriente son:
 */

package ud3.E0701;

import ud3.E0701.CuentaCorriente;

public class E0701 {

   public static void main(String[] args) {
      CuentaCorriente cCorriente = new CuentaCorriente("123045V",100,"Álvaro Barrientos Pazos");
   
      System.out.println(cCorriente.sacarDinero(1));
      cCorriente.ingresarSaldo(120);
      cCorriente.mostrarInfo();
   
   }
}
