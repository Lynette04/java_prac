//This is a simple program to calculate a user's score in a game out of the maximum score as a percentage. It is a simple demonstration of widening casting.
public class Maximumscore {
    public static void main(String[] args){
        int maximumscore = 300;
        int userscore = 240;
        float percentage = (float) userscore/maximumscore * 100.0f;
        char percent = '%';

        System.out.println("The maximum score of the game is " + maximumscore);
        System.out.println("The user's score is " + userscore);
        System.out.println("The percentage score is "+ percentage + percent);
    }

}
