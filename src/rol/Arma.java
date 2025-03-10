package rol;

public class Arma extends Item{
    
    int ataque;
    boolean dosManos = false;

    Arma(String name, double weight, int price, int ataque){
        super(name,weight,price);
        
        this.ataque = ataque;
    }


    Arma(String name, double weight, int price, int ataque, boolean dosManos){
        super(name,weight,price);

        this.ataque = ataque;
        this.dosManos = dosManos; 
    }

    


}
