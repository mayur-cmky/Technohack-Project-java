import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rc= new Random();
        String[]rps={"rock","paper","scissor"};
        String player,computer;

        System.out.println("Welcome to Rock , Paper , Scissor Game");
        System.out.println("---------------------------------------------");
        System.out.println("Press Any key to continue");
        while (true) {
            System.out.println("Enter move :(rock , paper, scissor)");
            player= sc.nextLine();
            System.out.println("Enter esc for exit..");
            if (player.equalsIgnoreCase("esc")) {
                break;
                
            }
            if(!player.equalsIgnoreCase("rock")&&
            !player.equalsIgnoreCase("paper")&&
            !player.equalsIgnoreCase("scissor"))
            {
                System.out.println("Invalid move.. Please try again:(");
                continue;
            }
            int rand=rc.nextInt(3);
            computer=rps[rand];
            System.out.println("Computer Move:" + computer);
            if (player.equalsIgnoreCase(computer)) {
                System.out.println("Its a tie..!!, Play Again!");   
            }
            else if (player.equalsIgnoreCase("rock")){
                if(computer.equalsIgnoreCase("scissor")){
              System.out.println("You Won!!");   
                }
            
            else{
                System.out.println("You Lose!!");
            }
        }
            else if(player.equalsIgnoreCase("paper")){
                if(computer.equalsIgnoreCase("scissor")){
                    System.out.println("You Won!!");
                }
                else{
                    System.out.println("You Lose!!");
                }
            }
            else if(player.equalsIgnoreCase("scissor")){
                if(computer.equalsIgnoreCase("rock")){
                    System.out.println("You Won!!");
                }
                else{
                    System.out.println("You Lose!!");
                }
            }

            
            System.out.println("Game Over!! Thanks for Playing....");
            
        }
        


    }

}
