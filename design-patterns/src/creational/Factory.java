package creational;

/* When to use Factory pattern?
    When requirement says support different types then instead of writing new A() all over the place.
    You create a central class that handles object creation and returns you the object.
 */
interface Payment {
    void pay();
}

class Upi implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment through UPI");
    }
}

class CreditCard implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment through Credit card");
    }
}

class FactoryClass {
    public static Payment getPayment(String paymentMethod) {
        if(paymentMethod.equalsIgnoreCase("Upi")) {
            return new Upi();
        } else if(paymentMethod.equalsIgnoreCase("CreditCard")) {
            return new CreditCard();
        }
        return null;
    }
}

public class Factory {
    public static void main(String[] args) {
        Payment p1 = FactoryClass.getPayment("CreditCard");
        if(p1 != null) {
            p1.pay();
        }
    }
}
