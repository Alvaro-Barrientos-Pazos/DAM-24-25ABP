package ud3.EjercicioBanco.Classes;

/*
    Todas las cuentas corrientes con las que se va a trabajar pertenecen al mismo
    banco. Añadir un atributo que almacene el nombre del banco (que es único) en la clase
    CuentaCorriente. Diseñar un método que permita recuperar y modificar el nombre del
    banco (al que pertenecen todas las cuentas corrientes)
*/

public class E0704 {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(null, 0);

        cc.changeBank("Banco Yolo");

        System.out.println(cc.getBankName());


    }
}
