// Abstraction means hiding implementation details from the consumer
public abstract class Abstraction {
    abstract void run();

    void stop() {
        System.out.println("Stopping");
    }
}

interface AbstractionInterface {
    void run();
}