package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Doctor extends Person {

    public Doctor(int age, String name) {
        super(age, name);
    }
    public void howToCommunicate() {
        System.out.println("Doctor communicate using pen");
    }
}
