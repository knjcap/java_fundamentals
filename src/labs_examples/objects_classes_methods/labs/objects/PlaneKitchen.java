package labs_examples.objects_classes_methods.labs.objects;

public class PlaneKitchen {
    private boolean isTheKitchenBig;

    public PlaneKitchen(boolean isTheKitchenBig) {
        this.isTheKitchenBig = isTheKitchenBig;
    }

    public boolean isTheKitchenBig() {
        return isTheKitchenBig;
    }

    public void setTheKitchenBig(boolean theKitchenBig) {
        isTheKitchenBig = theKitchenBig;
    }

    @Override
    public String toString() {
        return "PlaneKitchen{" +
                "isTheKitchenBig=" + isTheKitchenBig +
                '}';
    }
}
