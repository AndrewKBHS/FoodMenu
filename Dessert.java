import java.util.*;

public class Dessert extends Item{
    private String name;
    private double cost;
    private String[] ingredients;
    private boolean usesSpoon;
    private String size;
    
    public Dessert(String name,double cost,String[] ingredients,String size,boolean usesSpoon) {
        super(name,cost,ingredients);
        this.size=size;
        this.usesSpoon=usesSpoon;
    }
    
    public String gSize() {
        return size;
    }
    public boolean gUsesSpoon() {
        return usesSpoon;
    }
    
    public void sSize(String size) {
        this.size=size;
    }
    public void sUsesSpoon(boolean usesSpoon) {
        this.usesSpoon=usesSpoon;
    }
    
    public String toString() {
        return super.toString() + "\n" + "Uses a spoon: " + usesSpoon;
    }
}
