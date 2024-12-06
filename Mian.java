class Plane {
    void takeoff() {
        System.out.println("Plane is taking off");
    }

    void fly() {
        System.out.println("Plane is flying");
    }

    void land() {
        System.out.println("Plane is landing");
    }
}

class CargoPlane extends Plane {
    @Override
    void fly() {
        System.out.println("Cargo plane is flying at low heights");
    }

    @Override
    void takeoff() {
        System.out.println("Cargo plane needs a longer runway to take off");
    }
}

public class Main {
    public static void main(String[] args) {
        Plane p1 = new Plane();
        CargoPlane cp1 = new CargoPlane();

        // Calling methods on Plane object
        System.out.println("Regular Plane:");
        p1.takeoff();
        p1.fly();
        p1.land();

        // Calling methods on CargoPlane object
        System.out.println("\nCargo Plane:");
        cp1.takeoff();
        cp1.fly();
        cp1.land();
    }
}
