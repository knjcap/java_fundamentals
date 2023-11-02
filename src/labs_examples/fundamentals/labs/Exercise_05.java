package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"

        int valueString = str.length();
        System.out.println(valueString);

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2

        boolean equalString = str.equalsIgnoreCase(str2);
        System.out.println("Do str1 & str2 match? " +equalString);


        // please concatenate str & str2 and set the result to a new String variable below

        String concatenatestring = str + str2;
        System.out.println(concatenatestring);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc

        System.out.println(str.replace("h", "m"));
        System.out.println(str.substring(1,3));
        System.out.println(str2.contains("hel"));
        System.out.println(str2.indexOf("l", 1));


    }


}