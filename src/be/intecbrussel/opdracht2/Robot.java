package be.intecbrussel.opdracht2;

public abstract class Robot {
    //properties
    private String unitName;


    //constructors
    public Robot() {
        this("nameless Robot");
    }

    public Robot(String unitName) {
        this.unitName = unitName;
        boot();
    }


    //custom methods
    public void boot() {
        System.out.println("Booting up " + unitName);
    }

    public String getUnitName() {
        return unitName;
    }

    @Override
    public String toString() {
        return "unitName='" + unitName + '\'';
    }
}
