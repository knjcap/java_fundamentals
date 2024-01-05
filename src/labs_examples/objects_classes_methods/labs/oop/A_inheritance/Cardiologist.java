package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Cardiologist extends Doctor {
    public Cardiologist(int age, String name) {
        super(age, name);
    }
    public void howToEat (){
        System.out.println("Cardiologist eat");
    }
}
