import java.util.Random;
import java.util.Scanner;

public class number_guessing_game {
    public static void main(String [] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("*** WELCOME TO NUMBER GUESSING GAME***");
        System.out.println("GUESS THE NUMBER BETWEEN 1 TO 100");
        int number = rand.nextInt(100)+1;
        System.out.println("GUESS YOUR NUMBER : ");
        int attempts = 0;
        int guess;
        do {
            guess = sc.nextInt();
            attempts ++;
            if (guess < number){
                System.out.println("ENTER A GREATER NUMBER...");
            } else if (guess > number) {
                System.out.println("ENTER A SMALLER NUMBER....");
            }
            else{
                System.out.println("*** CONGRATULATIONS ***");
                System.out.println("YOU HAVE ENTERED THE CORRECT NUMBER");
            }
        }while (guess != number);
    }
}
