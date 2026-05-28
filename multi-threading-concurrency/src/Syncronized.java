/*
syncronized keyword is used to avoid race condition when multiple threads try to access same resource

There are two ways to use syncronized keyword:
1. Function definition
    syncronized void fun() {}

2. syncronized block
    syncronized (this) {
        //code
    }
 */

class Counter {
    public int count = 0;

    void increment() {
//        synchronized (this) {
            count += 1;
//        }
    }
}

public class Syncronized {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

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
