/*
 * Concrete prototype  
 */
public class Watermonster implements Monster {
    private String color;
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
        System.out.println("Air monstor created of color"+color);
    }
}
