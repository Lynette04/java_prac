//This is a simple program to check if a number is even.
import java.util.Scanner;
public class Evennumber {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){

            //Ask user to enter a whole number to check if it is even
            System.out.print("Enter a whole number to check if it is even: ");
            int num = scanner.nextInt();
            //Test if the number is even, it will give a remainder of 0 if even and a remainder of 1 if odd.
            if(num % 2 == 0){
                System.out.println(" " + num + " is even");
            } else{
                System.out.println(" " + num + " is odd");
            }
        }
    }
}
