//This is a simple greet program.
import java.util.Scanner;
public class Greet {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            // Ask user for their name
            System.out.print("What is your name: ");
            String name = scanner.next();

            System.out.println("Hey there " + name + "! Nice to meet yah!");
        }
    }
}
