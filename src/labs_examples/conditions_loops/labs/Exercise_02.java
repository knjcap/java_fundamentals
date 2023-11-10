package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */


import java.util.Scanner;
public class Exercise_02 {

    public static void main(String[] args) {
    
        // write completed here
    Scanner scanner = new Scanner (System.in);
    System.out.print("Enter the number from 1 to 7: ");
    int numberDay = scanner.nextInt();

        if (numberDay ==1)
            System.out.println("Monday");
        else if (numberDay ==2)
            System.out.println("Tuesday");
        else if (numberDay ==3)
            System.out.println("Wednesday");
        else if (numberDay ==4)
            System.out.println("Thursday");
        else if (numberDay ==5)
            System.out.println("Friday");
        else if (numberDay ==6)
            System.out.println("Saturday");
        else if (numberDay ==7)
            System.out.println("Sunday");
        else
            System.out.println("You have not entered the number from 1 to 7");


    }
}
