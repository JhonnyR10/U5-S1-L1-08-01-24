package giovannilongo.U5S1L1080124.entities;

import java.util.List;

public class Menu {
    private List<Pizza> pizzas;
    private List<Drinks> drinks;

    private List<Topping> toppings;

    public Menu(List<Pizza> pizzas, List<Drinks> drinks, List<Topping> toppings) {
        this.pizzas = pizzas;
        this.drinks = drinks;
        this.toppings = toppings;
    }

    public Menu() {
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public List<Drinks> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drinks> drinks) {
        this.drinks = drinks;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "pizzas=" + pizzas +
                ", drinks=" + drinks +
                ", toppings=" + toppings +
                '}';
    }
}
