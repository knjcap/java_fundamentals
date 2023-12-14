package labs_examples.objects_classes_methods.labs.objects;

public class PlaneFuel {
    private double fuelCapacity;
    private String currentFuelLevel;

    public PlaneFuel(double fuelCapacity, String currentFuelLevel) {
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(String currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public String toString() {
        return "PlaneFuel{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel='" + currentFuelLevel + '\'' +
                '}';
    }
}
