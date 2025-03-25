package ud5.examenProg;

import java.util.Arrays;

/* Implementa un modelo de clases en Java que permita la creación de exámenes tipo test. El modelo debe incluir las siguientes clases:
    
La clase "Pregunta", que representará una pregunta de tipo test con varias opciones de respuesta y una única opción correcta, y que tendrá los siguientes 
     a. atributos:
         i. Enunciado de la pregunta
         ii. Lista de respuestas
         iii. Índice de la respuesta correcta

        b. métodos: 
            i. un constructor que validará que la pregunta tenga al menos 2 respuestas diferentes y un índice de opción correcta válido, es decir, dentro de los límites del número de respuestas..
            ii. corregir() que recibe el índice de la opción elegida y devuelve true si es la opción correcta y false si no lo es.
            iii. el método redefinido toString(), que devolverá un String con el enunciado de la pregunta y en las siguientes líneas las posibles respuestas precedidas de las letras consecutivas del alfabeto, es decir, a), b), c), d)...
            iv. el método redefinido equals() considerará iguales dos preguntas que tengan el mismo enunciado y la misma lista de respuestas.

    
La clase "Examen", que contendrá los siguientes 
     a. atributos:
         i. un título del examen 
         ii. un conjunto de preguntas y los siguientes métodos:

        b. métodos:
            i. Un constructor que permita indicar el título.
            ii. addPregunta() añade una pregunta al examen comprobando que no se haya añadido ya una igual.
            iii. numPreguntas() devuelve el número de preguntas del examen.
            iv. el método redefinido toString(), que devolverá un String con el título del examen y todas las preguntas del examen numeradas, con su enunciado y sus respuestas pero sin indicar la opción correcta.
 */


public class Examen {

    String title;
    Pregunta[] questions = new Pregunta[0];

    public Examen(String title){
        this.title = title;
    }

    boolean addPregunta(Pregunta p){
        
        for ( int i = 0; i < questions.length; i++ ) {
            if (questions[i].equals(p)){
                return false;
            }
        }
        
        questions = Arrays.copyOf(questions, questions.length+1);
        questions[questions.length-1] = p;
        return true;
    }


    public int numPreguntas(){
        return questions.length;
    }


    public static void main(String[] args) {
        Examen examen = new Examen(" - Examen de prueba -");
        
        Pregunta p1 = new Pregunta("Pregunta 1?", new String[]{"P1 R1","P1 R2","P1 R3"}, 0);
        //Pregunta p2 = new Pregunta("Pregunta 1?", new String[]{"P1 R1","P1 R2","P1 R3"}, 0);   // Pregunta repetida
        
        Pregunta p2 = new Pregunta("Pregunta 2?", new String[]{"P2 R1","P2 R2","P2 R3"}, 1);
        Pregunta p3 = new Pregunta("Pregunta 3?", new String[]{"P3 R1","P3 R2","P3 R3"}, 2);

        System.out.println();

        examen.addPregunta(p1);
        examen.addPregunta(p2);
        examen.addPregunta(p3);

        System.out.println(p1.equals(p2));
        System.out.println(examen);

    }


    @Override
    public String toString() {

        String msg = title;

        for (Pregunta pregunta : questions) {
            msg = String.format("%s\n%s",msg, pregunta.toString());
        }
        return msg;
    }


    static public class Pregunta {

        final int MIN_NUM_ANSWER = 2;
        final int MAX_NUM_ANSWER = 3;
    
        public String questionText;
        public String[] answers;
    
        public int answerId;
    
        public Pregunta(String questionText, String[] answers, int answerId){
            if (answers.length >= MIN_NUM_ANSWER && answerId < MAX_NUM_ANSWER && answerId >= 0 ){
                this.questionText = questionText;
                this.answers = answers;
                this.answerId = answerId;
            }
        }
    
        boolean corregir(int guessId){
            if (guessId == answerId){
                return true;
            }
            
            return false;
        }
    
        // iii. el método redefinido toString(), que devolverá un String con el enunciado de la pregunta y en las siguientes líneas las posibles respuestas precedidas de las letras consecutivas del alfabeto, es decir, a), b), c), d)...
        @Override
        public String toString() {
            String msg = questionText;
    
            for (int i = 0; i < answers.length; i++) {
                msg = String.format("%s\n%c) %s", msg, 'a' + i, answers[i]);
            }
    
            return msg;
        }
        

        // iv. el método redefinido equals() considerará iguales dos preguntas que tengan el mismo enunciado y la misma lista de respuestas.
        @Override
        public boolean equals(Object o){
            Pregunta p = (Pregunta)o;
            
            if (p.questionText.equals(questionText)){

                if (Arrays.equals(answers, p.answers)){
                    return true;
                }
            }
    
            return false;
        }
    
    }
    

}