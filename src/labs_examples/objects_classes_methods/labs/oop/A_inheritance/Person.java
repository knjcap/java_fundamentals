package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Person {
    private int age;
    private String name;

    public void howToCommunicate() {
        System.out.println("Using mouth");
    }

    public void howToEat (){
        System.out.println("Person eat");
    }
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
