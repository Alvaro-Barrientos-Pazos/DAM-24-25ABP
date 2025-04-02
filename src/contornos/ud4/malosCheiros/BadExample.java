package contornos.ud4.malosCheiros;

// Mal nombre de la clase, poco descriptivo
public class BadExample {

    // Nombres no descriptivos, poco claros
    // Todos los miembros son públicos
    public int a;
    public String b;
    public double c;

    public BadExample(int a, String b) {
        this.a = a;
        this.b = b;
        this.c = 0.0;
    }

    public void updateValues(int x, String y) {
        this.a = x;
        this.b = y;
    }

    // Metodo redundante de BadExample.updateValues()
    public void changeValues(int x, String y) {
        this.a = x;
        this.b = y;
    }

    // Mala encapsulación: las variables están expuestas y no están adecuadamente encapsuladas
    public int getA() {
        return a;
    }

    // Método que realiza multiples tareas
    public void calculateStuff() {
        // El valor 0 se podria guardar en una constante
        if (this.c > 0) {
            this.c++;
        } else {
            this.c = c; // Bloque innecesario pues no se cambia nada.
        }

        if (this.b != null && !this.b.isEmpty()) { // Comprobación mala, redundante con la lógica anterior
            System.out.println("Valor: " + b);
        } else {
            System.out.println("Nada aquí");
        }
    }

    // Método principal que prueba la funcionalidad pero tiene un diseño malo
    public static void main(String[] args) {
        BadExample badExample = new BadExample(5, "Hola");

        // El código de abajo muestra redundancia en las acciones
        badExample.updateValues(10, "Nuevo Nombre");
        badExample.changeValues(20, "Otro Nombre");

        badExample.calculateStuff(); // No sigue el principio de responsabilidad única
    }
}
