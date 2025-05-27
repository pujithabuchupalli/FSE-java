import java.util.concurrent.*;
import java.util.*;

public class ExecuterService{
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = Arrays.asList(
            () -> { Thread.sleep(1000); return "Task 1 completed"; },
            () -> { Thread.sleep(2000); return "Task 2 completed"; },
            () -> { Thread.sleep(500); return "Task 3 completed"; }
        );

        List<Future<String>> results = executor.invokeAll(tasks);

        for (Future<String> future : results) {
            System.out.println(future.get());
        }

        executor.shutdown();
    }
}
