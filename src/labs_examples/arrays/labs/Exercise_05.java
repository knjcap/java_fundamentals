package labs_examples.arrays.labs;

import java.util.Arrays;


/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {
        int[] numbersToReverse = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int left = 0;
            int right = numbersToReverse.length - 1;

            while (left < right) {
                int temp = numbersToReverse[left];
                numbersToReverse[left] = numbersToReverse[right];
                numbersToReverse[right] = temp;
                        left++;
                        right--;
            }
                System.out.println(Arrays.toString(numbersToReverse));
    }
}
