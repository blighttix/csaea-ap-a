package CrashCourse;

public class Dog {
    
    // data / attributes
    String dogName;
    String ownerName;
    String breed;
    int age;
    double weight;
    boolean isHungry;
    boolean isHome;
    int energyLevel;


    // constructor

    public Dog(String dogName, String ownerName, String breed) {
        this.dogName = dogName;
        this.ownerName = ownerName;
        this.breed = breed;

        energyLevel = 100;
        isHome = true;
        weight = 10.0;
        isHungry = false;
        age = 0;
    }

    public void bark() {
        System.out.println("bark");
    }

    public void scratch() {
    }

    public void bite() {
    }

    public void eat() {
        isHungry = false;
    }

    public void run_away() {
        isHome = false;
    }

    public void come_home() {
        isHome = true;
    }

    public void sleep() {
        energyLevel += 75;
    }

    public void birthday() {
        age += 1;
    }

}
