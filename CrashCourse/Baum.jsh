import module java.base;
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
        fishWeight += 0.1;
    }

    public void grow() {
        // makes attack stronger somehow
        fishWeight += 1.0;
    }

}
Fish blub = new Fish("blub", "goldfish", "orange");
Fish bloob = new Fish("bloob", "beta", "blue");
Fish bitey = new Fish("bitey", "piranha", "tan");
Fish yum = new Fish("yum", "salmon", "silver");
Fish yummers = new Fish("yummers", "tuna", "silver");
yum.attack()
yum.lay_eggs()
yum.swim()
yum.eat()
yum.grow()
yum.characterName
yum.characterHealth
yum.fishType
yum.underWater
yum.fishWeight
yum.fishColor
yum.inOpen