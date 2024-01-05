package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

// this is overloading

public class Sum {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    void show() {
        System.out.println("Sum show");
    }
}
