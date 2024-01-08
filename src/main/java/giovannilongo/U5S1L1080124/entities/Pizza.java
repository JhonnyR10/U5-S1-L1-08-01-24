package giovannilongo.U5S1L1080124.entities;

import java.util.List;

public class Pizza {
    private String name;
    private double price;
    private List<Topping> toppings;
    private int nutritionalInfo;

    public Pizza(String name, double price, List<Topping> toppings, int nutritionalInfo) {
        this.name = name;
        this.price = price;
        this.toppings = toppings;
        this.nutritionalInfo = nutritionalInfo;
    }

    public Pizza() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public int getNutritionalInfo() {
        return nutritionalInfo;
    }

    public void setNutritionalInfo(int nutritionalInfo) {
        this.nutritionalInfo = nutritionalInfo;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", toppings=" + toppings +
                ", nutritionalInfo='" + nutritionalInfo + '\'' +
                '}';
    }
}
