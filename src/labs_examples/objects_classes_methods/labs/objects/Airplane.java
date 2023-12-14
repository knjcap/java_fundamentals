package labs_examples.objects_classes_methods.labs.objects;
//Following the example in CarExample.java, please use Object Composition to model an Airplane class.
//The Airplane class must be composed of at least 4 other classes (as well as any primitive types you'd like).
//The Airplane class itself should have a fuel capacity (double) variable, as well as a currentFuelLevel variable.
//We'll use these a bit later.
public class Airplane {
    PlaneEngine planeengine;
    PlaneKitchen planekitchen;
    PlaneWheels planewheels;
    PlaneWings planewings;
    PlaneFuel planefuel;

    public Airplane(PlaneEngine planeengine, PlaneKitchen planekitchen, PlaneWheels planewheels, PlaneWings planewings, PlaneFuel planefuel) {
        this.planeengine = planeengine;
        this.planekitchen = planekitchen;
        this.planewheels = planewheels;
        this.planewings = planewings;
        this.planefuel = planefuel;
    }

    public PlaneEngine getPlaneengine() {
        return planeengine;
    }

    public void setPlaneengine(PlaneEngine planeengine) {
        this.planeengine = planeengine;
    }

    public PlaneKitchen getPlanekitchen() {
        return planekitchen;
    }

    public void setPlanekitchen(PlaneKitchen planekitchen) {
        this.planekitchen = planekitchen;
    }

    public PlaneWheels getPlanewheels() {
        return planewheels;
    }

    public void setPlanewheels(PlaneWheels planewheels) {
        this.planewheels = planewheels;
    }

    public PlaneWings getPlanewings() {
        return planewings;
    }

    public void setPlanewings(PlaneWings planewings) {
        this.planewings = planewings;
    }

    public PlaneFuel getPlanefuel() {
        return planefuel;
    }

    public void setPlanefuel(PlaneFuel planefuel) {
        this.planefuel = planefuel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "planeengine=" + planeengine +
                ", planekitchen=" + planekitchen +
                ", planewheels=" + planewheels +
                ", planewings=" + planewings +
                ", planefuel=" + planefuel +
                '}';
    }
}
