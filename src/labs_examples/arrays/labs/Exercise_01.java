package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayNumbersFromUser = new int[10];
        int sumOfAll = 0;
        double averageOfAll =0;
        System.out.println("Enter your 10 numbers");
        for (int i = 0; i < 10; i++) {
            //System.out.println("Enter number" + (i + 1) + ": ");
            //System.out.println("Number" + (i+1) + ": " +arrayNumbersFromUser[i]);
            if (sc.hasNextInt()) {
                arrayNumbersFromUser[i] = sc.nextInt();
               sumOfAll+=arrayNumbersFromUser[i];
               averageOfAll=sumOfAll / 10.0;
            }

        }
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arrayNumbersFromUser[i] + " ");
            //System.out.println();

        }

        System.out.println("= " +sumOfAll+ " and the average is " +averageOfAll);
        sc.close();
        //System.out.println("and the total are: ");
        //int totalnumber = 0;
        //for (int i = 0; i < 10; i++) {
         //   totalnumber += arrayNumbersFromUser[i];
           // System.out.println(totalnumber);

        //}
    }
}
