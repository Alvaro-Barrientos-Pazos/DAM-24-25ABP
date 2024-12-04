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

package ud3.Bombilla;

import ud3.Bombilla.Bombilla;

public class E0709_CasaBombillas {

    public static Bombilla bombilla1,bombilla2,bombilla3;


    public static void main(String[] args) {
        bombilla1 = new Bombilla(false);
        bombilla2 = new Bombilla(true);
        bombilla3 = new Bombilla(false);

        Bombilla.printState(bombilla1);
        Bombilla.printState(bombilla2);
        Bombilla.printState(bombilla3);

        globalSwitch(false);

        Bombilla.printState(bombilla1);
        Bombilla.printState(bombilla2);
        Bombilla.printState(bombilla3);

    }

    public static void globalSwitch(boolean is_on){
        bombilla1.setState(is_on);
        bombilla2.setState(is_on);
        bombilla3.setState(is_on);
    }

}