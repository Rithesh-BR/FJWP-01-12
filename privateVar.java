//This code gives error , because we are trtung to acces a private varibales from paret class
class CreditCard {
    private int cardNo = 12345678;
    private int pin = 56789;
}

class Hacker extends CreditCard {
    void viewDetails() {
        System.out.println("Card Number: " + cardNo);
        System.out.println("PIN: " + pin);
    }
}

public class privateVar {
    public static void main(String[] args) {
        Hacker hacker = new Hacker();
        hacker.viewDetails();
    }
}
