package TA2.RockPaperScissor_PrototypePattern;

public class RockHandMovement implements HandMovement{
    String mode = "rock"; 

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
        ---'   ____)
              (_____)
              (_____)
              (____)
        ---.__(___)
        """);
    }
}
