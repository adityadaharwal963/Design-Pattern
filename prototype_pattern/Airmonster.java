/*
 * Concrete prototype  
 */
public class Airmonster implements Monster {
    private String color = "red";
    @Override
    public Monster clone(){
        try {
            return (Monster)super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
        
    }

    @Override
    public void display() {
        System.out.println("Air monstor created of color "+color);
    }
}