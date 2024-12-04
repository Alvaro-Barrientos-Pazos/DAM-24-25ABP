
package ud3.Bombilla;

public class Bombilla {

   private boolean _state = false;


   public Bombilla(boolean is_on){
      _state = is_on;
   }

   public void setState(boolean is_on){
      _state = is_on;
   }
   
   public boolean getState(){
      return _state;
   }
}
