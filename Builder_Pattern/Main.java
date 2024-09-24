public class Main {
    public static void main(String[] args) {
        Director workingDirector = new Director(new WorkingLaptopBuilder());
        Director gamingDirector = new Director(new GamingLaptopBuilder());

        workingDirector.constructLaptop("8gb", "arm34", "FGH29", "simpleHP");
        gamingDirector.constructLaptop("16gb", "arm45", "wfe3", "nightkey");
    }
}
