class Car2 {
    private String name;
    private int mileage;
    private int cost;

    public Car2() {
        name = "Unknown";
        mileage = 0;
        cost = 0;
    }

    public Car2(String name, int mileage, int cost) {
        this();  
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

public class localChaining {
    public static void main(String[] args) {
        Car2 c1 = new Car2("BMW", 15, 7000000);
        System.out.println("Car Name: " + c1.getName());
        System.out.println("Mileage: " + c1.getMileage() + " km/l");
        System.out.println("Cost:" + c1.getCost());
    }
}
