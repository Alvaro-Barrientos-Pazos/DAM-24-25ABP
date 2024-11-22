package ud2.practicas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Radar {

    @Test
    void testRadar() {
        
        assertEquals(10, excesoVelocidade(10, 300, 110));
        assertEquals(0, excesoVelocidade(10, 600, 60));
        assertEquals(10, excesoVelocidade(10, 600, 50));
        assertEquals(30, excesoVelocidade(10, 600, 30));
        assertEquals(60, excesoVelocidade(15, 300, 120));
        assertEquals(0, excesoVelocidade(10, 300, 120));
        assertEquals(30, excesoVelocidade(10, 300, 90));

        assert multaInfraccion(20, 0) == 0;
        assert multaInfraccion(20, 15) == 100;
        assert multaInfraccion(30, 21) == 300;
        assert multaInfraccion(40, 31) == 400;
        assert multaInfraccion(50, 50) == 500;
        assert multaInfraccion(50, 51) == 600;
        
        assert multaInfraccion(60, 0) == 0;
        assert multaInfraccion(70, 30) == 100;
        assert multaInfraccion(80, 31) == 300;
        assert multaInfraccion(90, 51) == 400;
        assert multaInfraccion(100, 61) == 500;
        assert multaInfraccion(110, 71) == 600;
        assert multaInfraccion(120, 1) == 100;
        

    }


    static int excesoVelocidade(int distance, int sec, int limit ){
        final int DISTANCE    = 10;
        final int SPEED_LIMIT = 120;
        
        double hours = sec/3600.;
        double averageSpeed = distance/hours;

        if (averageSpeed <= limit) {
            return 0;
        }

        return (int)averageSpeed-limit;
    }
    
    static int multaInfraccion(int limit, double exceedingSpeed){
        int multa = 0;
        if (limit <= 50 && exceedingSpeed > 0) {
            if (exceedingSpeed <= 20 ) {
                multa = 100;
            } else if (exceedingSpeed > 20 && exceedingSpeed <= 30) {
                multa = 300;
            } else if (exceedingSpeed > 30 && exceedingSpeed <= 40) {
                multa = 400;
            } else if (exceedingSpeed > 40 && exceedingSpeed <= 50) {
                multa = 500;
            } else {
                multa = 600;
            }
        }

        if (limit >= 60 && exceedingSpeed > 0) {
            if (exceedingSpeed <= 30) {
                multa = 100;
            } else if (exceedingSpeed > 30 && exceedingSpeed <= 50) {
                multa = 300;
            } else if (exceedingSpeed > 50 && exceedingSpeed <= 60) {
                multa = 400;
            } else if (exceedingSpeed > 60 && exceedingSpeed <= 70) {
                multa = 500;
            } else {
                multa = 600;
            }
        }
        return multa;

    }



}
