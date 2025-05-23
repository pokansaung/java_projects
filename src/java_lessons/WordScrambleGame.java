package java_lessons;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordScrambleGame {

    public static void main(String[] args) {
        // List of words for the game
        List<String> words = Arrays.asList(
                "all", "small", "ball", "move", "true", "development", "magnet"
        );

        // Randomly select a word
        String pickedWord = words.get((int)(Math.random() * words.size()));

        // Scramble the word (ensure it's different from original)
        String scrambledWord;
        do {
            scrambledWord = scrambleWord(pickedWord);
        } while (scrambledWord.equals(pickedWord));

        System.out.println("Scrambled word: " + scrambledWord);

        // Game loop
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Guess the original word (or type 'quit' to exit): ");
            String userGuess = scanner.nextLine().toLowerCase();

            if (userGuess.equals("quit")) {
                System.out.println("The word was '" + pickedWord + "'. Goodbye!");
                break;
            } else if (userGuess.equals(pickedWord)) {
                System.out.println("Congratulations! You guessed correctly!");
                break;
            } else {
                System.out.println("Incorrect. Try again!");
            }
        }
        scanner.close();
    }

    // Helper method to scramble a word
    private static String scrambleWord(String word) {
        List<String> letters = Arrays.asList(word.split(""));
        Collections.shuffle(letters);
        return String.join("", letters);
    }
}