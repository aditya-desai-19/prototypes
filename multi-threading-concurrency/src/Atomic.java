import java.util.concurrent.atomic.AtomicInteger;

/*
    Atomic classes are thread-safe utility classes in java.util.concurrent.atomic that perform lock-free,
    atomic operations on single variables using Compare-And-Set (CAS).
 */

class ACounter {
    AtomicInteger count = new AtomicInteger(0);

    void increment() {
        count.incrementAndGet();
    }
}

public class Atomic {
    public static void main(String[] args) throws Exception {
        ACounter counter = new ACounter();

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i <= 1000; i++)
                    counter.increment();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.count);
    }
}
