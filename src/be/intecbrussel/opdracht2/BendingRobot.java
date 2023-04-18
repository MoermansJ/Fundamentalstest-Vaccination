package be.intecbrussel.opdracht2;

public class BendingRobot extends Robot {
    //properties
    private double maxBendAngle;


    //constructors
    public BendingRobot(double maxBendAngle, String unitName) {
        super(unitName);
        this.maxBendAngle = maxBendAngle;
    }

    //custom methods
    public void bend(double bendAngle) {
        if (bendAngle < 0 || bendAngle > maxBendAngle) {
            System.out.println("IMPOSSIBLE ANGLE (" + bendAngle + "°)");
            return;
        }

        System.out.println("Successfully bent at " + bendAngle + "° angle!");
    }

    @Override
    public String toString() {
        return "BendingRobot{" +
                "maxBendAngle=" + maxBendAngle +
                super.toString() +
                '}';
    }
}
