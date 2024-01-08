package giovannilongo.U5S1L1080124.entities;

public class Topping {
    private String name;
    private double price;
    private int nutritionalInfo;

    public Topping(String name, double price, int nutritionalInfo) {
        this.name = name;
        this.price = price;
        this.nutritionalInfo = nutritionalInfo;
    }

    public Topping() {
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

    public int getNutritionalInfo() {
        return nutritionalInfo;
    }

    public void setNutritionalInfo(int nutritionalInfo) {
        this.nutritionalInfo = nutritionalInfo;
    }

    @Override
    public String toString() {
        return name + " " +
                price + " " +
                nutritionalInfo;
    }
}
