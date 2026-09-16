package CrashCourse;

public class Fish {
    String characterName;
    int characterHealth;
    String fishType;
    boolean underWater;
    double fishWeight;
    String fishColor;
    boolean inOpen;

    public Fish(String characterName, String fishType, String fishColor) {
        this.characterName = characterName;
        this.fishType = fishType;
        this.fishColor = fishColor;

        underWater = true;
        fishWeight = 5.0;
        characterHealth = 100;
        inOpen = true;
    }

    public void attack() {
    }

    public void lay_eggs() {
    }

    public void swim() {
        // something something could change inOpen or unerWater
    }

    public void eat() {
        fishWeight += 0.5;
    }

    public void grow() {
        // makes attack stronger somehow
        fishWeight += 1.0;
    }

}
