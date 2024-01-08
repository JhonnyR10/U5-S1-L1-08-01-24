package giovannilongo.U5S1L1080124;

import giovannilongo.U5S1L1080124.entities.Drinks;
import giovannilongo.U5S1L1080124.entities.Menu;
import giovannilongo.U5S1L1080124.entities.Pizza;
import giovannilongo.U5S1L1080124.entities.Topping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5S1L1080124Application {

    public static void main(String[] args) {
        SpringApplication.run(U5S1L1080124Application.class, args);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5S1L1080124Application.class);
        Menu menu = ctx.getBean(Menu.class);
        printMenu(menu);
    }

    private static void printMenu(Menu menu) {
        System.out.println("Pizzas:");
        for (Pizza pizza : menu.getPizzas()) {
            System.out.println(pizza.getName() + " - $" + pizza.getPrice());
            System.out.println("Toppings: " + pizza.getToppings());
        }

        System.out.println("\nDrinks:");
        for (Drinks drink : menu.getDrinks()) {
            System.out.println(drink.getName() + " - $" + drink.getPrice());
            System.out.println("Nutritional Info: " + drink.getNutritionalInfo());
        }

        System.out.println("\nToppings:");
        for (Topping topping : menu.getToppings()) {
            System.out.println(topping.getName() + " - $" + topping.getPrice());
            System.out.println("Nutritional Info: " + topping.getNutritionalInfo());
        }
    }
}
