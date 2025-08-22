//This is a guessing game. The user should guess a random number between 0 and 10.
import java.util.Scanner;
public class Guessinggame{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            int choice,randomnumber;
            randomnumber = (int)(Math.random() * 11);

            System.out.printf("Guess a number between 0 and 10: ");
            choice = scanner.nextInt();
            
            do{
                System.out.printf("Wrong choice, guess again: ");
                choice = scanner.nextInt();
            }while(choice!=randomnumber);

            if(choice==randomnumber){
                System.out.printf("Correct!");
            }
        }
    }
}