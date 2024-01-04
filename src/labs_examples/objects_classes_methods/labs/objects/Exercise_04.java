package labs_examples.objects_classes_methods.labs.objects;

// For this exercise please create two classes. The first class is the controller and it will contain the main() method.
//The second class is a POJO. Just a simple object type class that defines an object. In this POJO, demonstrate
//at least three overloaded constructors. In the main() method, create at least 3 objects of your POJO class, each using
//a different constructor.

public class Exercise_04 {
    public static void main(String[] args) {
        Motor motor1 = new Motor("Hyundai", "black");
        Motor motor2 = new Motor("Kwasaki", "blue", 1800, "hard tyres");
        Motor motor3 = new Motor("BMW", "white", 2500);
    }
}
