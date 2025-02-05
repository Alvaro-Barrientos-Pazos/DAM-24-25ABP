/*
    Modelar una casa con muchas bombillas, de forma que cada bombilla
    se pueda encender o apagar individualmente. Para ello, implementar una clase
    Bombilla con una variable privada que indique si está encendida o apagada, así como
    un método que nos diga el estado de una bombilla concreta. Además, queremos poner un
    interruptor general, de forma que si éste se apaga, todas las bombillas quedan apagadas.
    Cuando el interruptor general se activa, las bombillas vuelven a estar encendidas o
    apagadas, según estuvieran antes. Cada bombilla se enciende y se apaga
    individualmente, pero solo responde que está encendida si su interruptor particular está
    activado y además hay luz general.
*/

package ud3.bombilla;

public class E0709_CasaBombillas {

    public static Bombilla b1,b2,b3;
    public static boolean global_switch = true;


    public static void main(String[] args) {
        b1 = new Bombilla(false);
        b2 = new Bombilla(true);
        b3 = new Bombilla(false);

        printBulpState(b1);
        printBulpState(b2);
        printBulpState(b3);

        globalSwitch(false);

        printBulpState(b1);
        printBulpState(b2);
        printBulpState(b3);
    }

    public static void globalSwitch(boolean is_on){
        global_switch = is_on;
    }

    public static void printBulpState(Bombilla b){
        System.out.println(global_switch && b.getState() == false? "Apagada":"Encendida");
    }

}