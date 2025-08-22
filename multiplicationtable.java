//This is a program to print the multiplication table of a number upto 12 times that number.
import java.util.Scanner;
public class multiplicationtable {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            int num;
            do{
                System.out.printf("Enter a positive whole number to get its multiplication table till 12 times that number: ");
                num = scanner.nextInt();
            }while(num<1);    
            if(num>=1){
               for(int i=1; i<=12; i++){
               System.out.println(" " + i + " x" + " "+num + " = " + i*num);
              } 
            }       
        }
    }
  }