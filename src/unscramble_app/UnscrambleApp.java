package unscramble_app;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class UnscrambleApp {
    private static final String[] WORDS = {
            "apple", "banana", "orange", "grape", "pear",
            "computer", "keyboard", "mouse", "monitor", "printer",
            "java", "python", "javascript", "html", "css",
            "happy", "sad", "angry", "excited", "nervous",
            "sun", "moon", "star", "planet", "galaxy"
    };

    private String currentWord;
    private String scrambledWord;
    private int score;
    private int attempts;
    private Scanner scanner;
    private Random random;

    public UnscrambleApp() {
        scanner = new Scanner(System.in);
        random = new Random();
        score = 0;
        attempts = 0;
    }

    public static String[] getWords() {
        return WORDS;
    }

    public void pickAndShuffle() {
        // Pick a random word
        currentWord = WORDS[random.nextInt(WORDS.length)];

        // Convert word to list of characters for shuffling
        List<String> letters = Arrays.asList(currentWord.split(""));
        Collections.shuffle(letters);

        // Build the scrambled word
        StringBuilder sb = new StringBuilder();
        for (String letter : letters) {
            sb.append(letter);
        }
        scrambledWord = sb.toString();
    }

    public void playGame() {
        System.out.println("Welcome to the Word Unscramble Game!");
        System.out.println("Unscramble the letters to form a valid word.");
        System.out.println("Type 'quit' to exit the game.\n");

        while (true) {
            pickAndShuffle();

            System.out.println("Scrambled word: " + scrambledWord);
            System.out.print("Your guess: ");
            String guess = scanner.nextLine().trim().toLowerCase();

            if (guess.equals("quit")) {
                break;
            }

            attempts++;

            if (guess.equals(currentWord)) {
                System.out.println("Correct! Well done.");
                score++;
            } else {
                System.out.println("Incorrect. The word was: " + currentWord);
            }

            System.out.println("Score: " + score + "/" + attempts);
            System.out.print("Play again? (yes/no): ");
            String playAgain = scanner.nextLine().trim().toLowerCase();

            if (!playAgain.equals("yes")) {
                break;
            }
            System.out.println();
        }

        System.out.println("\nGame over! Final score: " + score + "/" + attempts);
        System.out.println("Thanks for playing!");
        scanner.close();
    }

    public static void main(String[] args) {
        UnscrambleApp game = new UnscrambleApp();
        game.playGame();
    }
}
