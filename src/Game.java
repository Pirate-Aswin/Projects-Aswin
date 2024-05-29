import java.util.*;
class Game {
    public static void main(String[] args) {
        guessNumber();
    }

    static void guessNumber(){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to the Guessing Game!!!!");
        System.out.println();
        int value = rand.nextInt(1000);
        int attempt = 1;
        int guess;
        do {
            System.out.print("Guess the Number (0 to 1000): ");
             guess = sc.nextInt();
            if(guess==value){
                System.out.println("You Guessed the Correct Value!!!");
                System.out.println("The Total Attempt You Taken: "+attempt);
                System.exit(0);
            }
            else if(guess<value){
                System.out.println("You Guess is too low!!! Try Agan!!!");
            }
            else{
                System.out.println("You Guess is too high!!! Try Agan!!!");
            }
        }while(guess!=value);
    }
}