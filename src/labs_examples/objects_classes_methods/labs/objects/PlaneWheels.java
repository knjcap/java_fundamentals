package labs_examples.objects_classes_methods.labs.objects;

public class PlaneWheels {
    private int wheelSize;
    private String wheelName;

    public PlaneWheels(int wheelSize, String wheelName) {
        this.wheelSize = wheelSize;
        this.wheelName = wheelName;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public String getWheelName() {
        return wheelName;
    }

    public void setWheelName(String wheelName) {
        this.wheelName = wheelName;
    }

    @Override
    public String toString() {
        return "PlaneWheels{" +
                "wheelSize=" + wheelSize +
                ", wheelName='" + wheelName + '\'' +
                '}';
    }
}

