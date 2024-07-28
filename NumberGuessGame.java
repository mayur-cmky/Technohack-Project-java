import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random ra= new Random();

        int randomNum = ra.nextInt(100)+1;
        int guess=0;
        int numberOfTries=0;
        System.out.println("WELCOME TO GUESS NUMBER GAME!!....");
        System.out.println("*************************************");
        System.out.println("PRESS ANY KEY TO START...");
        //System.out.println("your number is:" + randomNum);
        
        while (guess !=randomNum) {
            System.out.println("Enter your guess number between (1-100):-");
            guess=sc.nextInt();
            numberOfTries++;
            if(guess<randomNum){
                System.out.println("Your guess number is low.Please try again!..");

            }
            else if (guess>randomNum) {
                System.out.println("Your guess number is high.Please try again!..");
                
            }
            else{
                System.out.println("Congratulations!! You won the game...!");
                System.out.println("in"+" "+numberOfTries+" "+"tries.");
            }
        }
    }

}
