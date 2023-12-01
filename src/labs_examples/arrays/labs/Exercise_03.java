package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int counter =3;
        int [][] numberRequested = new int[5][5];
            for (int i=0; i<numberRequested.length; i++) {
                for (int j=0; j<numberRequested[i].length; j++) {
                    //if (counter % 3 ==0) {
                    numberRequested[i][j] = counter;
                    counter = counter + 3;

                }
            }

            System.out.println("The 2D array is: ");
                for (int i=0; i<numberRequested.length; i++) {
                    for (int j = 0; j < numberRequested[i].length; j++) {
                        System.out.print(numberRequested[i][j] + " ");
                    }
                    System.out.println();


                }
    }
}
