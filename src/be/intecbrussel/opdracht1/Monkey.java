package be.intecbrussel.opdracht1;

public class Monkey extends Animal {
    //properties
    private boolean isHyperActive;


    //constructors
    public Monkey() {
        this(false, false, 0, "DEFAULT_MONKEY_NAME", 0);
    }

    public Monkey(boolean isHyperActive, boolean isClean, int age, String name, int animalNumber) {
        super(isClean, age, name, animalNumber);
        this.isHyperActive = isHyperActive;
    }


    //getters & setters
    public boolean isHyperActive() {
        return isHyperActive;
    }

    public void setHyperActive(boolean hyperActive) {
        isHyperActive = hyperActive;
    }


    //custom methods
    @Override
    public void treatAnimal() {
        this.setClean(true);
        this.setHyperActive(false);
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "isHyperActive=" + isHyperActive +
                super.toString() +
                '}';
    }
}