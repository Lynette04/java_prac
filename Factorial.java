//This is a simple program to find the factorial of a number
import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            int num;
            do{
                System.out.printf("Enter a positive number(inclusive of zero) to find its factorial: ");
                num = scanner.nextInt();
            } while(num<0);
          
            if(num>=0){
                long factorial=1;
                for(int i=1; i<=num; i++){
                    factorial=factorial * i;
                }
                System.out.println("Factorial of "+num + " is "+ factorial);
            }
        }
    }
}