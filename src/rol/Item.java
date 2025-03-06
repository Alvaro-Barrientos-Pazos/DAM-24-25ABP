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


    

}
