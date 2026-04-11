class RunnableThreadExample implements Runnable {
    private String task;

    public RunnableThreadExample(String task) {
        this.task = task;
    }


    @Override
    public void run() {
        System.out.println(task + " " + Thread.currentThread().getName());
    }
}


public class RunnableThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableThreadExample("Thread 1"));
        Thread t2 = new Thread(new RunnableThreadExample("Thread 2"));
        Thread t3 = new Thread(new RunnableThreadExample("Thread 3"));

        t1.start();
        t2.start();
        t3.start();
    }
}
