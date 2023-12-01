package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int numberInputByUser=0;
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number from 1 to 10");
        numberInputByUser = scan.nextInt();

        switch (numberInputByUser) {
            case 10:
                System.out.println("Index is 0");
                break;
            case 9:
                System.out.println("Index is 1");
                break;
            case 8:
                System.out.println("Index is 2");
                break;
            case 7:
                System.out.println("Index is 3");
                break;
            case 6:
                System.out.println("Index is 4");
                break;
            case 5:
                System.out.println("Index is 5");
                break;
            case 4:
                System.out.println("Index is 6");
                break;
            case 3:
                System.out.println("Index is 7");
                break;
            case 2:
                System.out.println("Index is 8");
                break;
            case 1:
                System.out.println("Index is 9");
                break;
            default:
                System.out.println("NO index as you have entered a number outside 1-10");

        }


    }
}