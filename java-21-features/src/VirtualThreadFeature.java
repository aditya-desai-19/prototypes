public class VirtualThreadFeature {
    public static void main(String[] args) throws InterruptedException {
        /*
            Traditional threads are bound to OS and consume a lot of memory almost 1mb/thread
            Hence are not scalable for large concurrent system
         */
        for (int i = 0; i <= 5; i++) {
            Thread thread = new Thread(() -> {
                System.out.println("Running in thread " + Thread.currentThread().getName());
            });

            thread.start();
        }

        /*
            Virtual threads are lightweight thread which are managed JVM.
            In case of virtual threads 1 or more than one thread are bound to OS.
            When a thread is paused the OS thread is released and can accept other virtual thread thus improving efficiency.
         */

        for (int i = 0; i <= 5; i++) {
            Thread.startVirtualThread(() -> {
                System.out.println("Running in virtual thread " + Thread.currentThread().getName());
            });
        }

        Thread.sleep(1000);
    }
}
