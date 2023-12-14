package labs_examples.objects_classes_methods.labs.objects;

public class PlaneEngine {
    private double horsePower;

    public PlaneEngine(double horsePower) {
        this.horsePower = horsePower;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "PlaneEngine{" +
                "horsePower=" + horsePower +
                '}';
    }
}
