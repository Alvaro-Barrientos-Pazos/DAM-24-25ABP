/* Álvaro Barrientos Pazos */

package ud3.abpexamen;

import java.lang.Math;

public class CocheCarreras {

    private String name;
    private int maxNumTurbo,netNumTurbo,maxSpeed, maxAutonomy, netAutonomy;
    private double distance;
    


    public CocheCarreras(String name, int maxSpeed, int maxAutonomy){
        if (maxSpeed <= 0 ){
            System.out.println("La velocidad máxima es invalida, se ha ajustado al valor por defecto: 1");
            maxSpeed = 1;
        }
        if (maxAutonomy <= 1){
            System.out.println("La autonomia máxima es invalida, se ha ajustado al valor por defecto: 1");
        }
        
        this.name        = name;
        this.maxSpeed    = maxSpeed;
        this.maxAutonomy = maxAutonomy;
        netAutonomy      = maxAutonomy;

        distance    = 0.;
        maxNumTurbo = 3;
        netNumTurbo = maxNumTurbo;

    }

    public CocheCarreras(String name, int maxSpeed, int maxAutonomy, int maxNumTurbo ){
        this(name,maxSpeed,maxAutonomy);

        if (maxNumTurbo < 0){
            System.out.println("Valor invalidos");
            return;
        }

        
        this.maxNumTurbo = maxNumTurbo;
        netNumTurbo = maxNumTurbo;

    }

    public String getNombre(){
        return name;
    }

    public int getAutonomiaRestante(){
        return netAutonomy;
    }

    public int TurboRestantes(){
        return netNumTurbo;
    }

    public int getVelocidadMaxima(){
        return maxSpeed;
    }

    public double getDistanciaRecorrida(){
        return distance;
    }


    public double avanzar(){
        double rngDistance = Math.random() * maxSpeed + 1;
        
        if (rngDistance >= netAutonomy){
            distance += netAutonomy;
            netAutonomy = 0;
            return netAutonomy;
        }
        else{
            distance += rngDistance;
            netAutonomy -= rngDistance;
            return rngDistance;
            
        }
        
    }


    public double usarTurbo(){

        if (netNumTurbo > 0){
            double turboDistance = maxSpeed * 1.5;

            if (turboDistance >= netAutonomy){
                turboDistance = netAutonomy;
                distance += netAutonomy;
                netAutonomy = 0;
                return turboDistance;
            }
            else{
                netAutonomy -= turboDistance;
                distance += turboDistance;
                return turboDistance;
            }
            
        }

        return 0;

    }

    public void playTurn(int RaceTurboChance){
        if (netAutonomy <= 0){
            repostar();
            System.out.printf("%s paro para repostar\n",name);
        }

        else if (netNumTurbo>0){ 
            if (Math.random() * (101) <= RaceTurboChance){
                System.out.printf("%s usa turbo avanza %.2f metros. Quedan %d turbos. (Total recorrido: %.2f metros)\n",name,usarTurbo(),netNumTurbo,distance);
            }
        }

        else{
            System.out.printf("%s avanza %.2f metros (Total recorrido: %.2f metros)\n",name,avanzar(),distance);
        }

    }


    public void repostar(){
        netAutonomy = maxAutonomy;
        netNumTurbo = maxNumTurbo;
    }

    public void reiniciarDistancia(){
        distance = 0;
    }

    public void mostrar(){
        System.out.println("Coche: "+name);
        System.out.println("Velocidad Máxima: "+maxSpeed);
        System.out.println("Turbos: "+netNumTurbo+"/"+maxNumTurbo);
        System.out.println("Autonomía: "+netAutonomy+"/"+maxAutonomy);
        System.out.println("Distancia: "+distance);

    }


}
