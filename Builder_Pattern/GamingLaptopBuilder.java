/*
 * this class is concrete Builder class
 */
public class GamingLaptopBuilder implements LaptopBuilder {
    Laptop laptop;
    GamingLaptopBuilder(){
        laptop = new Laptop();
    }
    public void buildRam(String ram){
        laptop.setRam(ram);
    }
    public void buildProcessor(String processor){
        laptop.setProcessor(processor);
    }

    public void buildKeyboard(String keyboard){
        laptop.setKeyboard(keyboard);
    }

    public void buildBattery(String battery){
        laptop.setBattery(battery);
    }

    public Laptop geLaptop(){ /* getResult method */
        return this.laptop;
    }
}