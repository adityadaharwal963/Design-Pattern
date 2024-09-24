/**
 * LaptopBuilder is Abstract Builder class
 */
public interface LaptopBuilder {

    void buildRam(String ram);
    void buildProcessor(String processor);
    void buildKeyboard(String keyboard);
    void buildBattery(String battery);
    Laptop geLaptop();
}