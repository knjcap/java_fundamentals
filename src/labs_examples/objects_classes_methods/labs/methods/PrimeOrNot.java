package labs_examples.objects_classes_methods.labs.methods;
//    5) Write a method that will determine whether or not a number is prime
public class PrimeOrNot {
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(4));

    }
}
