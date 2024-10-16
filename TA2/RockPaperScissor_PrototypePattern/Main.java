package TA2.RockPaperScissor_PrototypePattern;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HandMovementRegistry registry = new HandMovementRegistry();

        //prototypes
        HandMovement rock = new RockHandMovement();
        HandMovement scissors = new ScissorHandMovement();
        HandMovement paper =  new PaperHandMovement();
        HandMovement yo =  new YoHandMovement();

        //register in hash map
        registry.registeryHandMovement("rock", rock);
        registry.registeryHandMovement("scissors", scissors);
        registry.registeryHandMovement("paper", paper);
        registry.registeryHandMovement("Yo", yo);

        // clone and display Hand Gui logic

        HandMovement userHand = null;
        HandMovement computerHand = null;


        
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many rounds of Rock-Paper-Scissors would you like to play?");
        int rounds = scanner.nextInt();
        int userCount = 0;
        System.out.println("==========================Start Game==========================");
        for (int i = 0; i < rounds; i++) {
            
            userHand = getUserMove(registry);
            computerHand = getComputerMove(registry);

              // Show user move
            System.out.println("Your move :");
            userHand.display();

            
            // Show Computer move
            System.out.println("computer move :");
            computerHand.display();

            if(playerWins(userHand.getHandMovementType(),computerHand.getHandMovementType())== 0){
                i--;
            }else if(playerWins(userHand.getHandMovementType(),computerHand.getHandMovementType()) == 1){
                
                userCount++;
                System.out.println(userCount);
            }

            System.out.printf("score %d %d round: %d\n",userCount,i+1-userCount,i+1);
          

        }
        
      
        if(userCount>rounds/2){
            System.out.println("You are Winner");
            userHand = registry.makeHandMovement("Yo");
            userHand.display();
        }else if(userCount==rounds/2 && rounds%2 == 0){
            System.out.println("Tie... ");
        }else{
            System.out.println("Computer Wins");
        }

        

        

    }

    private static HandMovement getUserMove(HandMovementRegistry registry){
       // Getting input from the user
       Scanner scanner = new Scanner(System.in);
      
       System.out.println("Make a move! (rock/paper/scissors)");
       String playerMove = scanner.next();

       //Set user GUI Hand 
       if (playerMove.equals("rock")) {
           return registry.makeHandMovement("rock");

       } else if (playerMove.equals("paper")) {
           return registry.makeHandMovement("paper");

       } else {
           return registry.makeHandMovement("scissors");
       }
    }
    private static HandMovement getComputerMove(HandMovementRegistry registry){
        // Getting input from the computer
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        // computerMove;
        if (randomNumber == 0) {
            return registry.makeHandMovement("rock") ;
        } else if (randomNumber == 1) {
            return registry.makeHandMovement("paper");
        } else {
            return registry.makeHandMovement("scissors");
        }
    }

    private static int playerWins(String playerMove, String computerMove) {
        if (playerMove.equals("rock") && computerMove.equals("scissors") ) {
            return 1;
        } else if (playerMove.equals("paper") && computerMove.equals("rock")) {
            return 1;
        } else if (playerMove.equals("scissors") && computerMove.equals("paper")) {
            return 1;
        } else if(playerMove.equals(computerMove)){
            return 0;
        }
        return -1;
    }

}