package ud3.ejerciciosclases.EP0712_SegundoGrado;

public class SegundoGrado {

    double a;
    double b;
    double c;
    
    double disc;  // Discriminante

    double positive = -1;
    double negative = -1;


    public SegundoGrado(){

    }

    public SegundoGrado(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;

        reCalculate();
    }

    public void setValues(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        reCalculate();
    }

    public void reCalculate(){
        disc = b*b - 4 * (a * c);

        if (disc < 0){
            return;
        }

        double raizC = Math.sqrt(disc);
        
        positive = -b + raizC;
        positive = positive / (2*a);

        negative = -b - raizC;
        negative = negative / (2*a);
    }

    public double getPositiveResult(){
        return positive;
    }

    public double getNegativeResult(){
        return negative;
    }

}
