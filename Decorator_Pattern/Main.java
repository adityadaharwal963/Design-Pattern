
public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " INR " + beverage.cost());
        Beverage beverage2 = new DarkRoast();
        //this is wrapping of classes.
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " INR " + beverage2.cost());
    }
}
