package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        String vowels ="aeiou";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word");
        String wordUserInput = scanner.nextLine();

        while (wordUserInput.contains(vowels)) {
            System.out.println("Your word is " +wordUserInput+ "and the first vowel is" );
        }
    }

}

// THS IS NOT DONE YET. WILL COME BACK ON THIS