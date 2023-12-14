package labs_examples.objects_classes_methods.labs.methods;

public class MethodTraining {

    public static void main(String[] args) {
        System.out.println(call(2));
        //System.out.println("Consonant: " + consonant);
    }


    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        return a + b + c + d;

    }
// 2) Demonstrate the difference between "pass by value" and "pass by reference"
    // pass by value = when a primitive type is passed to a method, then this is done by the use of pass-by-value
    // if it is non-primitive types that include objects of any class , it always passed by the use of pass-by-reference

    // eg: pass-by-value

    int passvalue = 0;

    static int call(int aaa) {
        int passvalue = aaa + 10;
        return passvalue;
    }

    // eg of pass reference

    // Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
    static int max(int a, int b, int c, int d) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;
        return max;
    }

        // Write a method that will determine whether or not a number is prime
    }


// no 7: still to do


