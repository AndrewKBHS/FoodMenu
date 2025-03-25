import java.util.*;
public class ItemTester {
    public static void main(String[] args) {
        Item salad = new Item("Salad", 9.99, new String[] {"lettuce", "ranch dressing", "tomatoes"});
        MainDish curry = new MainDish("Curry", 12.99, new String[] {"curry sauce", "pork", "carrots", "rice"}, 2, new String[] {"eggs, gluten"});
        Dessert iceCream = new Dessert("Vanilla ice cream", 4.99, new String[] {"vanilla extract", "sugar", "water"} , "small", true);
        Appetizer springRolls = new Appetizer("Spring rolls", 2.99, new String[] {"cilantro", "lettuce", "rice paper", "glass noodles"}, 3);
        
        System.out.println(salad);
        System.out.println();
        System.out.println(curry);
        System.out.println();
        System.out.println(iceCream);
        System.out.println();
        System.out.println(springRolls);
    }
}
