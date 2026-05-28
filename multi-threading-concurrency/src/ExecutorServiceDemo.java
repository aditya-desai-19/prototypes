import java.util.concurrent.*;

/*
    Executor service is used to manage thread and its lifecycle efficiently.
 */



public class ExecutorServiceDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        Runnable task = () -> {
            System.out.println("Task is running");
        };

        // It is similar as Runnable only difference is it returns a value and throws exception when some error occurs.
        Callable<Integer> task2 = () -> 10 + 20;

        // Future is an interface which stores result of asynchronous operation
        Future<Integer> future = executorService.submit(task2);

        System.out.println(future.get());

        executorService.shutdown();
    }
}
