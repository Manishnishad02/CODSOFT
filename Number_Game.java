/**
 * The Number_Game class allows the user to play a guessing game where they have 
 * to guess a randomly generated number between 1 and 100 within 7 attempts, 
 * and keeps track of their score.
 */
import java.util.Random;
import java.util.Scanner;

public class Number_Game 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber;
        int userGuess;
        int attempts = 0;
        int score = 0;
        boolean playAgain = true;

        while (playAgain) 
        {
            randomNumber = random.nextInt(100) + 1;
            attempts = 0;

            while (true) 
            {
                System.out.println("Welcome to the Number Guessing Game!");
                System.out.print("Enter your guess (1-100): ");
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == randomNumber) 
                {
                    System.out.println("Congratulations! You guessed the correct number.");
                    score++;
                    break;
                } else if (userGuess > randomNumber) 
                {
                    System.out.println("Your guess is too high. Try again!");
                } else 
                {
                    System.out.println("Your guess is too low. Try again!");
                }

                if (attempts >= 7) 
                {
                    System.out.println("Sorry, you have run out of attempts. The correct number was " + randomNumber + ".");
                    break;
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("no")) 
            {
                playAgain = false;
            }
        }

        System.out.println("Your final score is: " + score);
    }
}