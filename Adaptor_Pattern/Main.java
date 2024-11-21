package Adaptor_Pattern;

public class Main {
    static void test(Duck duck) {
        duck.quack();
        duck.fly();

    }

    public static void main(String[] args) {
            WildTurkey wildTurkey = new WildTurkey();
            TurkeyAdapter turkeyAdapter= new TurkeyAdapter(wildTurkey);
            test(turkeyAdapter);
    }
}
