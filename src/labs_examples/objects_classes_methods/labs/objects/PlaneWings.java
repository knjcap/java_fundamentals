package labs_examples.objects_classes_methods.labs.objects;

public class PlaneWings {
    private int wingSizeInMeter;
    private String wingModel;

    public PlaneWings(int wingSizeInMeter, String wingModel) {
        this.wingSizeInMeter = wingSizeInMeter;
        this.wingModel = wingModel;
    }

    public int getWingSizeInMeter() {
        return wingSizeInMeter;
    }

    public void setWingSizeInMeter(int wingSizeInMeter) {
        this.wingSizeInMeter = wingSizeInMeter;
    }

    public String getWingModel() {
        return wingModel;
    }

    public void setWingModel(String wingModel) {
        this.wingModel = wingModel;
    }

    @Override
    public String toString() {
        return "PlaneWings{" +
                "wingSizeInMeter=" + wingSizeInMeter +
                ", wingModel='" + wingModel + '\'' +
                '}';
    }
}

