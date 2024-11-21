package Adaptor_Pattern;

public class TurkeyAdapter implements Duck{
    // Adapter should be composed of Adaptee.


    Turkey turkey;
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }
    @Override
    public void fly() {
       turkey.fly();
    }

    @Override
    public void quack() {
        turkey.gobble();

    }
}
