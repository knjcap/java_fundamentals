package labs_examples.objects_classes_methods.labs.objects;

public class Motor {
    String name;
    String color;
    int cc;
    String typeOfTyres;

    public Motor(String name, String color, int cc, String typeOfTyres){
        this.name=name;
        this.color=color;
        this.cc=cc;
        this.typeOfTyres=typeOfTyres;

    }

    public Motor(String name, String color) {
        this.name=name;
        this.color=color;
    }
    public Motor(String name, String color, int cc){
        this.name=name;
        this.color=color;
        this.cc=cc;
    }
}

