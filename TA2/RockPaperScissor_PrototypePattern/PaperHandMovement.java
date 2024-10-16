package TA2.RockPaperScissor_PrototypePattern;

public class PaperHandMovement implements HandMovement {
    String mode = "paper"; 

    public String getHandMovementType(){
        return mode;
    }

    @Override
    public HandMovement clone(){
        try {
            return (HandMovement)super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void display(){
        System.out.println("""
            _______
        ---'   ____)____
                  ______)
                  _______)
                 _______)
        ---.__________)
        """);
    }
}
