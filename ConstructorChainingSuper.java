class Parent {
    Parent() {
        System.out.println("Parent class constructor");
    }
}

public class ConstructorChainingSuper extends Parent {
    ConstructorChainingSuper() {
        super();  
        System.out.println("Child class constructor");
    }

    public static void main(String[] args) {
        ConstructorChainingSuper obj = new ConstructorChainingSuper();
    }
}
