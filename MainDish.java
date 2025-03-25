import java.util.*;

public class MainDish extends Item{
    private String name;
    private double cost;
    private String[] ingredients;
    private int servingSize;
    private String[] allergies;
    
    public MainDish(String name,double cost,String[] ingredients,int servingSize,String[] allergies) {
        super(name,cost,ingredients);
        this.servingSize=servingSize;
        this.allergies=allergies;
    }
    
    public int gServingSize() {
        return servingSize;
    }
    public String[] gAllergies() {
        return allergies;
    }
    
    public void sServingSize(int servingSize) {
        this.servingSize=servingSize;
    }
    public void sAllergies(String[] allergies) {
        this.allergies=allergies;
    }
    
    public String toString() {
        return super.toString() + "\n" + "Contains: " + Arrays.toString(allergies);
    }
}
