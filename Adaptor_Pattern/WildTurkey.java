package Adaptor_Pattern;

public class WildTurkey implements Turkey {

    @Override
    public void fly() {
        System.out.println("flying");
    }

    @Override
    public void gobble() {
        System.out.println("quack");
    }
}
