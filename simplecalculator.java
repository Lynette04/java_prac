//This is a simple calculator
import java.util.Scanner;


public class simplecalculator {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to the simple calc, your math friend!");

            System.out.println("Please enter your first number: ");
            double number1 = scanner.nextDouble();
            
            System.out.println("Please enter your second number: ");
            double number2 = scanner.nextDouble();

            System.out.println("Please enter your choice of operation: ");
            char operator = scanner.next().charAt(0);

            double result;

            switch(operator){
                case '+':
                    result = number1 + number2;
                    System.out.println(result);
                    break;
                case '-':
                    result = number1 - number2;
                    System.out.println(result);
                    break;
                case '*':
                    result = number1 * number2;
                    System.out.println(result);
                    break;
                case '/':
                    result = number1/ number2;
                    System.out.println(result);
                    break;
                default:
                    System.out.println("Ooops, that is not an operator!");               
            }
        }
    }
}
