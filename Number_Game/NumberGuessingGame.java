import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 100;
    private static final int MAX_ATTEMPTS = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int roundsWon = 0;
        int totalAttempts = 0;
        boolean playAgain;

        do {
            int numberToGuess = random.nextInt(MAX_RANGE - MIN_RANGE + 1) + MIN_RANGE;
            int attemptsLeft = MAX_ATTEMPTS;
            boolean hasWon = false;

            System.out.println("Guess the number between " + MIN_RANGE + " and " + MAX_RANGE + ".");

            while (attemptsLeft > 0 && !hasWon) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                totalAttempts++;

                if (userGuess == numberToGuess) {
                    hasWon = true;
                    roundsWon++;
                    System.out.println("Congratulations! You guessed the number correctly.");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                attemptsLeft--;
                if (attemptsLeft > 0 && !hasWon) {
                    System.out.println("You have " + attemptsLeft + " attempts left.");
                }
            }

            if (!hasWon) {
                System.out.println("You've used all attempts! The correct number was " + numberToGuess + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        } while (playAgain);

        System.out.println("Game over! You won " + roundsWon + " rounds and took a total of " + totalAttempts + " attempts.");
        scanner.close();
    }
}
