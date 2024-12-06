class Car {
    private String name;
    private int mileage;
    private int cost;

    public Car() {
        name = "Unknown";
        mileage = 0;
        cost = 0;
    }

    public Car(String name, int mileage, int cost) {
        this.name = name;
        this.mileage = mileage;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getMileage() {
        return mileage;
    }

    public int getCost() {
        return cost;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 15, 7000000);
        System.out.println("Car Name: " + c1.getName());
        System.out.println("Mileage: " + c1.getMileage() + " km/l");
        System.out.println("Cost:" + c1.getCost());

        Car c2 = new Car();
        System.out.println("\nCar Name: " + c2.getName());
        System.out.println("Mileage: " + c2.getMileage() + " km/l");
        System.out.println("Cost: " + c2.getCost());
    }
}
