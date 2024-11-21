package ud2.practicas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class IMC {

    @Test
    void testImc() {

        double resultadoCaso1 = imc(70, 170);
        assertEquals(24.22, resultadoCaso1, 0.01);

        double resultadoCaso2 = imc(90, 185);
        assertEquals(26.30, resultadoCaso2, 0.01);

        double resultadoCaso3 = imc(60, 160);
        assertEquals(23.44, resultadoCaso3, 0.01);

        double resultadoCaso4 = imc(45, 160);
        assertEquals(17.578, resultadoCaso4, 0.01);

        double resultadoCaso5 = imc(65, 165);
        assertEquals(23.875, resultadoCaso5, 0.01);

        double resultadoCaso6 = imc(100, 175);
        assertEquals(32.653, resultadoCaso6, 0.01);

        double resultadoCaso7 = imc(99.98, 200);
        assertEquals(24.995, resultadoCaso7, 0.01);
    }


    static double imc(double kg, int cm) {
        
        if (kg<20|| kg>300 || cm < 50 || cm > 250){
            System.out.println("Se han introducido valore/s invalidos");
            return -1;
        }

        double m = cm * 0.01;
        double imcValue = kg/(m*m);

        String msg = "Normal";

        if (imcValue < 18.5){
            msg = "Bajo peso";
        }
        else if (imcValue >= 25){
            msg = "Sobrepeso";

        }
        else if (imcValue >= 30){
            msg = "Obesidad";
        }


        System.out.println("Clasificación: "+msg);

        

        return imcValue;
    }


    static double getValidWeight(){
        Scanner sc = new Scanner(System.in);

        double input = -1;
        boolean isLoop = true;

        do {
            System.out.println("Introduce el peso en kg");
            try{
                input = sc.nextDouble();
                isLoop = false;
            }
            catch (InputMismatchException e){
                System.out.println("Valor Invalido: Debes usar números enteros o decimales");
                isLoop = true;
            }
        }while (isLoop);
        sc.close();

        return input;
    }


    static int getValidHeight(){
        Scanner sc = new Scanner(System.in);

        int input = -1;
        boolean isLoop = true;

        do {
            System.out.println("Introduce la altura en cm");
            try{
                input = sc.nextInt();
                isLoop = false;
            }
            catch (InputMismatchException e){
                System.out.println("Valor Invalido: Solo se aceptan números enteros");
                isLoop = true;
            }
        }while (isLoop);
        sc.close();

        return input;
    }


}
