package TA2.RockPaperScissor_PrototypePattern;

public class ScissorHandMovement implements HandMovement{
    String mode = "scissors"; 

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
        ---'   ____)_____
                   ______)
                  /
                  \\______
               ___________)
              (____)
        ---.__(___)
        """);
    }
}
