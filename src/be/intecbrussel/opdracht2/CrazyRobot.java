package be.intecbrussel.opdracht2;

import java.util.Comparator;
import java.util.stream.Stream;

public class CrazyRobot extends Robot {
    //constructors
    public CrazyRobot() {
        this("nameless CrazyRobot");
    }

    public CrazyRobot(String unitName) {
        super(unitName);
    }


    //custom methods
    private String reverseUnitName(String unitName) {
        return new StringBuilder(unitName).reverse().toString();
    }

    @Override
    public void boot() {
        System.out.println("Booting up " + reverseUnitName(getUnitName()));
    }

    @Override
    public String toString() {
        return "CrazyRobot{ +" +
                super.toString() +
                "}";
    }
}
