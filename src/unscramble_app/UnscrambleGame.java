package unscramble_app;

import java.util.*;

public class UnscrambleGame {
    private static final String[] WORDS = {
            "apple", "banana", "orange", "grape", "pear",
            "computer", "keyboard", "mouse", "monitor", "printer",
            "java", "python", "javascript", "html", "css",
            "happy", "sad", "angry", "excited", "nervous",
            "sun", "moon", "star", "planet", "galaxy"
    };
    String currentWord;
    String scrambledWord;
    int score = 0;
    Random random = new Random();

    public void pickAndShuffle(){
        currentWord = WORDS[random.nextInt(WORDS.length)];
        List<String> letters = Arrays.asList(currentWord.split(""));
        do {
            Collections.shuffle(letters);
        } while (letters.contains(currentWord));

        StringBuilder stb = new StringBuilder();
        for (String letter: letters){
            stb.append(letter);
        }
        scrambledWord = stb.toString();
    }

    public void display(){
        System.out.println("===Unscramble Game===");
        System.out.println("Unscramble the word: " + scrambledWord);
        System.out.println("Your score: " + score);
        System.out.println("Your guess: ");
    }

    public static void main(String[] args) {
        UnscrambleGame myApp = new UnscrambleGame();
        myApp.display();
    }
}

