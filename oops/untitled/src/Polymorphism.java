// Polymorphism means same method behaves differently
class PolyParent {
    public void run() {
        System.out.println("Parent is running");
    }
}

public class Polymorphism extends PolyParent {
    // Method overloading
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    // Method overriding
    @Override
    public void run() {
        System.out.println("Child is running");
    }
}
