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
        tankPercent = 100.0;
    }

    public void honkHorn() {
        System.out.println("beep!");
    }

    public void crash() {
        if (beingDriven = false)
        {System.out.println("crashing is impossible right now!");}
        else {
        needsRepair = true;
        System.out.println("you must repair your car now.");}
    }

    public void driveCar(int speedInput) {
    if (needsRepair || (tankPercent<=5)) {
        System.out.println("you can't drive this car right now.");
    } else {
        speed = speedInput;
        System.out.println("you are now driving at " + speed + "MpH.");}

    }

    public void repairCar() {
        if (needsRepair) {
            needsRepair = false;
            System.out.println("your car cas been repaired.");
        }
        else { System.out.println("your car doesn't need repair.");}
    }

    public void fillTank(double percent) {
        tankPercent += percent;
        System.out.println("your tank is now "+ tankPercent +"% full");
    }
}
