package be.intecbrussel.opdracht2;

public class LiftingRobot extends Robot {
    //properties
    private double maxLiftHeight;


    //constructors
    public LiftingRobot(double maxLiftHeight, String unitName) {
        super(unitName);
        this.maxLiftHeight = maxLiftHeight;
    }


    //custom methods
    public void lift(double height) {
        if (height > maxLiftHeight || height < 0) {
            System.out.println("IMPOSSIBLE HEIGHT (" + height + ")");
            return;
        }

        System.out.println("Successfully lifted to " + height + " unit(s)!");
    }

    @Override
    public String toString() {
        return "LiftingRobot{" +
                "maxLiftHeight=" + maxLiftHeight +
                super.toString() +
                '}';
    }
}
