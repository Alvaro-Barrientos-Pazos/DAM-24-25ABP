package rol;

public class Item {

    private String name;
    private double weight;
    private int price;


    public Item(String name, double weight, int price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }


    public String getName() {
        return name;
    }


    public double getWeight() {
        return weight;
    }


    public int getPrice() {
        return price;
    }

    public String toString(){
        return name;
    }

    public boolean equals(Item item){
        if (name != item.getName())
            return false;
        
        if (price != item.getPrice())
            return false;
        
        if (weight != item.getWeight())
            return false;

        return true;

    }

    

}
