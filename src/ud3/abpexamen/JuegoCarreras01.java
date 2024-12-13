/* Álvaro Barrientos Pazos */
package ud3.abpexamen;

import ud3.abpexamen.CocheCarreras;

public class JuegoCarreras01 {

    public static void main(String[] args) {
        
        final int TRACK_LENGTH = 500;
        final int TURBO_CHANCE = 25;
        
        CocheCarreras car1 = new CocheCarreras("Rayo",20,100,5);
        CocheCarreras car2 = new CocheCarreras("Trueno",62,10,0);
        CocheCarreras fastCar, slowCar;

        boolean isLooping = true;

        if (car1.getVelocidadMaxima()>=car2.getVelocidadMaxima()){
            fastCar = car1;
            slowCar = car2;
        }
        else{
            fastCar = car2;
            slowCar = car1;
        }

        fastCar.mostrar();
        System.out.println("======");
        slowCar.mostrar();


        while(isLooping){

            fastCar.playTurn(TURBO_CHANCE);
            if (fastCar.getDistanciaRecorrida() >= TRACK_LENGTH){
                System.out.printf("\n¡%s ha cruzado la meta y es el ganador!",fastCar.getNombre());
                isLooping = false;
                return;
            }
            slowCar.playTurn(TURBO_CHANCE);
            if (slowCar.getDistanciaRecorrida() >= TRACK_LENGTH){
                System.out.printf("\n¡%s ha cruzado la meta y es el ganador!",slowCar.getNombre());
                isLooping = false;
                return;
            }

        }


    }
    
}
