package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Exercise_01_Controller {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(45,"Nino" );
        doctor.howToCommunicate();
        Cardiologist cardiologist = new Cardiologist(50, "John");
        cardiologist.howToCommunicate();
        doctor.howToEat();
        cardiologist.howToEat();
        System.out.println(doctor.getName()+" is " +doctor.getAge()+ " years old.");
    }
}
