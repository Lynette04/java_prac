/*This is a menu driven calculator where a user enters a number 
 whether 1,2,3 or 4 to perform a basic calculation whether addition, subtraction,
 multiplication or division*/
import java.util.Scanner;
public class Menudrivencalculator {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
           double num1,num2,result;
           int op;
            do{ 
            System.out.println("Welcome to the simple calculator.");
            
            //Ask the user for two numbers
            System.out.printf("Enter your first number: ");
            num1 = scanner.nextDouble();

            System.out.printf("Enter your second number: ");
            num2 = scanner.nextDouble();
           //provide the menu to the user
            System.out.println("Choose 1 for addition.");
            System.out.println("Choose 2 for subtraction.");
            System.out.println("Choose 3 for multiplication.");
            System.out.println("Choose 4 for division.");
            System.out.println("Choose 5 to exit the program.");
            
            System.out.printf("Enter a number whether '1','2','3','4' or '5': ");
            op = scanner.nextInt();

            switch(op){
                case 1:
                result = num1 + num2;
                System.out.println("The result is " + result);
                break;

                case 2:
                result = num1 - num2;
                System.out.println("The result is " + result);
                break;

                case 3:
                result = num1 * num2;
                System.out.println("The result is " + result);
                break;

                case 4:
                if(num2!=0){
                    result = num1 / num2;
                    System.out.println("The result is " + result);
                } else{
                    System.out.println("You cannot divide by 0.");
                }
                break;
                
                case 5:
                System.out.println("Thank you for using the simple calculator.");
                break;

                default:
                System.out.println("Enter a number whether 1,2,3 or 4 to perform a calculation.");
            }
        } while(op!=5);
      }
    }
}
