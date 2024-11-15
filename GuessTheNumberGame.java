//task 1
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    
    private static final int MAX_ATTEMPTS = 5;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;
        int score = 0;
        
        System.out.println("Welcome to Guess the Number Game!");
        
        while (playAgain) {
            int numberToGuess = generateRandomNumber(1, 100);
            int attempts = 0;
            boolean guessedCorrectly = false;
            
            System.out.println("\nI'm thinking of a number between 1 and 100. Try to guess it!");
            
            while (attempts < MAX_ATTEMPTS) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                
                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    guessedCorrectly = true;
                    score += (MAX_ATTEMPTS - attempts + 1);  // Higher score for fewer attempts
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
                
                System.out.println("Attempts left: " + (MAX_ATTEMPTS - attempts));
            }
            
            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all attempts. The number was: " + numberToGuess);
            }
            
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        }
        
        System.out.println("Game over! Your total score is: " + score);
        System.out.println("Thank you for playing!");
        
        scanner.close();
    }
    
    // Generate a random number within a specified range
    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}

