public class ConstructorChainingThis {
    ConstructorChainingThis() {
        this(100);  
        System.out.println("Default constructor");
    }

    ConstructorChainingThis(int value) {
        System.out.println("Parameterized constructor with value: " + value);
    }

    public static void main(String[] args) {
        ConstructorChainingThis obj = new ConstructorChainingThis();
    }
}
