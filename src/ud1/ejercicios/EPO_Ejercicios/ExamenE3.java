/* 
Examen DAM Curso 2023 - 2024  Ejercicio 3

Realiza un programa que simule el funcionamiento de un cajero automático. El programa solicitará al usuario el importe en efectivo que desea retirar, que será un número 
entero de euros (€). El programa calculará el número mínimo de billetes de 50, 20, 10 y 5 euros para obtener dicho importe y presentará la información al usuario.

Si el importe introducido por el usuario no es múltiplo de 5 se informará también al usuario del importe que el cajero no es capaz de satisfacer por no disponer de billetes 
de esa cantidad. Por ejemplo, si el usuario introduce 78 €, el programa informará de que se retirarán 75 € en los billetes que corresponda y que 3 € no se pueden retirar por 
no existir billetes tan pequeños.

 */

package ud1.ejercicios.EPO_Ejercicios;

import java.util.Scanner;

public class ExamenE3 {
    public static void main(String[] args) {
        
        final double CINCUENTA = 50.0;        
        final double VEINTE    = 20.0;
        final double CINCO     = 5.0;
        
        Scanner sc = new Scanner(System.in);
       
        double importe;

        System.out.print("Introduce el importe a extraer: ");
        importe = sc.nextInt();


        int b50 = (int)(importe/CINCUENTA);
        importe = importe%CINCUENTA;

        int b20 = (int)(importe/VEINTE);
        importe = importe%VEINTE;

        int b5 = (int)(importe/CINCO);

        System.out.printf("billetes de 50:\t%d\nbilletes de 20:\t%d\nbilletes de 5:\t%d\n",b50,b20,b5);

        String mensaje = importe%5 == 0 ? "No sobra nada" : "No es posible extraer el de: " + (int)(importe%5) + " euros";

        System.err.println(mensaje);





        
        sc.close();

        
    }

}
