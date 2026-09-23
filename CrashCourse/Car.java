public class Car {
    
    int modelYear;
    String carModel;
    double carValue;
    double tankPercent;
    int speed;
    boolean beingDriven;
    boolean needsRepair;

    public Car(int modelYear, String carModel, double carValue) {
        this.modelYear = modelYear;
        this.carModel = carModel;
        this.carValue = carValue;

        speed = 0;
        beingDriven = false;
        needsRepair = false;
        tankPercent = 1.0;
    }

    public void honkHorn() {
        System.out.println("beep!");
    }

    public void crash() {
        if (beingDriven = false)
        {System.out.println("crashing is impossible right now!");}
    } else {
        needsRepair = true;
    }


}
