
package ud3.Bombilla;

public class Bombilla {

   private boolean _state = false;


   public Bombilla(){
      _state = true;
   }


   public Bombilla(boolean is_on){
      _state = is_on;
   }

   public void setState(boolean is_on){
      _state = is_on;
   }


   public static void printState(Bombilla bulp){
      System.out.println(bulp._state == false? "Apagada":"Encendida");
   }

}
