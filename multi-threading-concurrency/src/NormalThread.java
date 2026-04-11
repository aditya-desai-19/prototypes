class ThreadExample extends Thread {
    private String task;

    public ThreadExample(String task) {
        this.task = task;
    }

    public void run() {
        System.out.println(task + " " + Thread.currentThread().getName());
    }
}

public class NormalThread {
    public static void main(String[] args) {
        Thread t1 = new ThreadExample("Thread 1");
        Thread t2 = new ThreadExample("Thread 2");
        Thread t3 = new ThreadExample("Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
