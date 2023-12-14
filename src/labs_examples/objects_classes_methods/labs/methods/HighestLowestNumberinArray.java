package labs_examples.objects_classes_methods.labs.methods;
// Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
//            which is passed in as an argument
public class HighestLowestNumberinArray {
    static int Highest(int[] array) {
        int high = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > high) {
                high = array[i];
            }
        }
        return high;

    }

    public static void main(String[] args) {
        int[] num = {1, 3, 4, 5, 7, 11, 20, 29, 30};
        int highest = Highest(num);
        System.out.println(highest);

    }

            }



