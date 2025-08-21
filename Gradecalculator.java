//This is a simple  grade calculator
import java.util.Scanner;

public class Gradecalculator{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            //Ask user to input their test score
            System.out.printf("Enter your score to get your grade: ");
            int score = scanner.nextInt();

            if(score>=80 && score<=100){
                System.out.printf("Your grade is A.");
            } else if(score>=70){
                System.out.printf("Your grade is B.");
            }else if(score>=60){
                System.out.printf("Your grade is C.");
            }else if(score>=50){
                System.out.printf("Your grade is D.");
            }else if(score>=40){
                System.out.printf("Your grade is E.");
            }else if(score>=0){
                System.out.printf("Your grade is F.");
            }else{
                System.out.printf("The score should be between 0 and 100 to get a grade.");
            }

        }
    }
}