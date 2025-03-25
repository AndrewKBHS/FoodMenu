import java.util.*;

public class Appetizer extends Item{
    private String name;
    private double cost;
    private String[] ingredients;
    private int servingSize;
    public Appetizer(String name,double cost,String[] ingredients,int servingSize) {
        super(name,cost,ingredients);
        this.servingSize=servingSize;
    }
    
    public int gServingSize() {
        return servingSize;
    }
    public void sServingSize(int servingSize) {
        this.servingSize=servingSize;
    }
    
    public String toString() {
        return super.toString() + "\n" + "Serves " + servingSize + " people.";
    }
}
