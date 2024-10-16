 package TA2.RockPaperScissor_PrototypePattern;

 public class YoHandMovement implements HandMovement {
    String mode = "Yo"; 

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
    ( _\\    /_ )
     \\ _\\  /_ / 
      \\ _\\/_ /_ _
      |_____/_/ /|
      (  (_)__)J-)
      (  /`.,   /
       \\/  ;   /
        | === |
        """);
    }
}
