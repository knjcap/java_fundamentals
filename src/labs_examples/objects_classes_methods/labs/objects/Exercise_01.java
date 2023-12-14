package labs_examples.objects_classes_methods.labs.objects;

public class Exercise_01 {
    public static void main(String[] args) {
      PlaneFuel myPlaneFuel = new PlaneFuel(13.5, "Min");
      PlaneEngine myPlaneEngine = new PlaneEngine(2034.34);
      PlaneKitchen myPlaneKitchen = new PlaneKitchen(true);
      PlaneWheels myPlaneWheels = new PlaneWheels(100, "Goodyear");
      PlaneWings myPlaneWings = new PlaneWings(10, "Wing Brand Model");
      Airplane myAirplane = new Airplane(myPlaneEngine, myPlaneKitchen, myPlaneWheels, myPlaneWings, myPlaneFuel);

      System.out.println("My plane has a " +myPlaneEngine.getHorsePower() + " horsepower");




    }
}
