package labs_examples.objects_classes_methods.labs.objects;

// Please demonstrate Object association by creating at least two POJOs and a Controller class. The Controller
//class will contain the main() method. In the main() create an object of each POJO you just created and associate
//the two together. (This is easier than it sounds. Refer to the Object Association documentation if you're not sure.)
public class Exercise_03 {
    public static void main(String[] args) {
        Fraternity fraternity = new Fraternity("Tau Gamma Phi");
        Person person = new Person("Nino");
        System.out.println(person.name+" is a member of " +fraternity.name+ " fraternity");

    }
}
