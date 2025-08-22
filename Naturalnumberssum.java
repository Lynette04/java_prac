//This is a program to find the sum of the first n natural numbers
import java.util.Scanner;
public class Naturalnumberssum {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            Long n;
            long sum=0;
            do{
                System.out.printf("Enter the number of the first natural numbers whose sum you want to find: ");
                n = scanner.nextLong();
            } while(n<1);

            for(int i=1; i<=n; i++){
                sum=sum+i;
            }
            System.out.printf("The sum is "+ sum);
        }
    }
}
