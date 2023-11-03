package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {
        float volume;
        float surfaceArea;
        float radius = 3.14f;
        int height = 5;
        float pi = 3.1416f;
        volume = (pi * radius * radius * height); //formula is pi * radius to the 2nd power * height
        System.out.println("The volume is " +volume);
        surfaceArea = (2 * pi * radius * radius) + (2 * pi * radius * height); //formula is 2πr2 + 2πrh
            System.out.println("The surface are is " +surfaceArea);

        // write code here

    }
}