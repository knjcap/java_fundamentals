package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        int c = 9;
        int d = 10;
        if (c<100 & d<100) {
            System.out.println("c and d are less than 100");
        }

        int e = 99;
        int f = 101;
        if (e<100 && f<100); {
            System.out.println("only e is less than 100");
        }

        int g = 102;
        int h = 99;
            if (g<100 || h<100); {
                System.out.println("only h is less than 100");
        }
            if (g<100 ^ h<100); {
                System.out.println("only 1 of them is true");
        }
            if (!(h>g)); {
                System.out.println("h is NOT greater than g");
        }
        // write your code below

    }

}

