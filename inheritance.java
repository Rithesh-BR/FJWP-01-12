class CreditCard {
    int cardNo = 12345678;
    int pin = 56789;
}

class Hacker extends CreditCard {
    void viewDetails() {
        System.out.println("Card Number: " + cardNo);
        System.out.println("PIN: " + pin);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Hacker hacker = new Hacker();
        hacker.viewDetails();
    }
}
