package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;
// Demonstrate using an interface as an instance variable - have a constructor that takes in the interface as a
//parameter. Also have a setter that allows you to update the interface object. Through code, demonstrate that you
//understand how we can use Interfaces as dependencies (instance variables) and how useful and flexible they make our
//application.
interface Language {
    void getName(String name);
}

class DeveloperLanguage implements Language {
    public void getName(String name) {
        System.out.println("Developer Language " + name);
    }
}

class Main {
    public static void main(String[] args) {
        DeveloperLanguage developerLanguage = new DeveloperLanguage();
        developerLanguage.getName("Java");
    }
}