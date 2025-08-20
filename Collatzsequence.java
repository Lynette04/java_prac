// This is a simple program to demonstrate the Collatz sequence
import java.util.Scanner;

public class Collatzsequence {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            //Ask user to input any postive number that is not one

            System.out.print("Enter a positive integer that is not 1: ");
            int n = scanner.nextInt();
            System.out.print(n);
            
            do{
                if(n % 2 == 0){
                    n=n/2; 
                }
                else{
                    n= n*3 + 1;
                }
                System.out.print( "-> "+n);
                if(n==1){
                        break;
                    }
            } while(n!=1);

        }
    }
}
