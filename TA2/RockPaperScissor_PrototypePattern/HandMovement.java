package TA2.RockPaperScissor_PrototypePattern;

public interface HandMovement extends Cloneable {
    void display();
    String getHandMovementType();
    HandMovement clone();
}
