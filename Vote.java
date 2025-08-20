//This is a simple program to check if someone is old enough to vote
import java.util.Scanner;
public class Vote {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            //Ask user for age after greeting them.
            System.out.print("What is your name: ");
            String name = scanner.next();
            System.out.println("Hey there " + name + "! How old are you: ");
            int age = scanner.nextInt();

            //Check if they are old enough to vote
            if(age >= 18){
                System.out.println("You are old enough to vote!");
            } else{
                System.out.println("You cannot vote! ");
            }
        }
    }
}
