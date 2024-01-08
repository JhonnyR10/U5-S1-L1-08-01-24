package giovannilongo.U5S1L1080124;

import giovannilongo.U5S1L1080124.entities.Drinks;
import giovannilongo.U5S1L1080124.entities.Menu;
import giovannilongo.U5S1L1080124.entities.Pizza;
import giovannilongo.U5S1L1080124.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Configuration
public class BeansConfiguration {
    @Bean
    public Pizza margherita() {
        Pizza pizza = new Pizza();
        pizza.setName("Pizza Margherita");
        pizza.setPrice(4.99);
        pizza.setToppings(Collections.singletonList(new Topping("Cheese", 0.69, 92)));
        pizza.setNutritionalInfo(1104);
        return pizza;
    }

    @Bean
    public Pizza hawaiianPizza() {
        Pizza pizza = new Pizza();
        pizza.setName("Hawaiian Pizza");
        pizza.setPrice(6.49);
        List<Topping> toppings = new ArrayList<>();
        toppings.add(new Topping("Tomato", 0.0, 10));
        toppings.add(new Topping("Cheese", 0.69, 92));
        toppings.add(new Topping("Ham", 0.99, 35));
        toppings.add(new Topping("Ananas", 0.79, 24));
        pizza.setToppings(toppings);
        pizza.setNutritionalInfo(1024);
        return pizza;
    }

    @Bean
    public Drinks water() {
        Drinks drink = new Drinks();
        drink.setName("Water");
        drink.setPrice(1.29);
        drink.setNutritionalInfo(0);
        return drink;
    }

    @Bean
    public Topping cheese() {
        Topping topping = new Topping();
        topping.setName("Cheese");
        topping.setPrice(0.69);
        topping.setNutritionalInfo(92);
        return topping;
    }

    @Bean
    public Topping ham() {
        Topping topping = new Topping();
        topping.setName("Ham");
        topping.setPrice(0.99);
        topping.setNutritionalInfo(35);
        return topping;
    }

    @Bean
    public Menu menu() {
        Menu menu = new Menu();
        menu.setPizzas(Arrays.asList(margherita(), hawaiianPizza()));
        menu.setDrinks(Collections.singletonList(water()));
        menu.setToppings(Arrays.asList(cheese(), ham()));
        return menu;
    }
}
