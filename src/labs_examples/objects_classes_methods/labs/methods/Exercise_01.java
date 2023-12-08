package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {
        myJoke();
        int aa = vgMethod("hello", "how", "are", "you");
        int bb = vgMethod("hi", "there");
        int cc = vgMethod("hi");
            System.out.println(" " + aa);
            System.out.println(" " + bb);
            System.out.println(" " +cc);


            // please create the methods as instructed below then

        // call each of those methods from here, within the main(
    }

    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b

    static int multiply(int a, int b) {
        return a * b;
    }


// 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    static int divide(int a, int b) {
        return a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console

    static void myJoke() {
        System.out.println("This is my joke");

    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    static int numberOfYears (int yr){
        return yr * 31_536_000;
    }


    // 5) Create a varargs method that will return the length of the varargs array passed in

    static int vgMethod (String... vg) {
        int count =0;
            for (String x : vg) {
                count++;

            }
        return count;
    }

}


