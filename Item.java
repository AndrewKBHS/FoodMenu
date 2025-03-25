import java.util.*;

public class Item {
    private String name;
    private double cost;
    private String[] ingredients;
    
    public Item(String name,double cost,String[] ingredients) {
        this.name=name;
        this.cost=cost;
        this.ingredients=ingredients;
    }
    
    public String gName() {
        return name;
    }
    public double gCost() {
        return cost;
    }
    public String[] gIngredients() {
        return ingredients;
    }
    
    public void sName(String name) {
        this.name=name;
    }
    public void sCost(double cost) {
        this.cost=cost;
    }
    public void sIngredients(String[] ingredients) {
        this.ingredients=ingredients;
    }
    
    public String toString() {
        return name + " costs $" + cost + " and uses:" + "\n" + Arrays.toString(ingredients); 
    }
    
}
