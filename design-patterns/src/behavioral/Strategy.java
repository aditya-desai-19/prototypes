package behavioral;

/*
    When to use Strategy pattern?
    When to want to replace conditional logic with polymorphism
 */
interface PaymentMethod {
    void pay(double amount);
}

class CreditCard implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " using credit card");
    }
}

class Upi implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " using upi");
    }
}

class ShoppingCart {
    private PaymentMethod paymentMethod;

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        paymentMethod.pay(amount);
    }
}

public class Strategy {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentMethod(new CreditCard());
        cart.processPayment(1000);

        cart.setPaymentMethod(new Upi());
        cart.processPayment(500);
    }
}
