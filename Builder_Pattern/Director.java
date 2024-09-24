/*
 * Client / Director
 */
public class Director {
    LaptopBuilder builder;

    Director(LaptopBuilder builder){
        this.builder = builder;
    }

    /*construct Product */
    public void constructLaptop(String ram,String processor,String battery,String keyboard){
        this.builder.buildRam(ram);
        this.builder.buildProcessor(processor);
        this.builder.buildBattery(battery);
        this.builder.buildKeyboard(keyboard);
    }

    /*return laptop */
    Laptop geLaptop(){
        return builder.geLaptop();
    }
}
