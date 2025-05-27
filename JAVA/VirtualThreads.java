public class VirtualThreads{
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            Thread.startVirtualThread(() -> {
                System.out.println("Hello from virtual thread " + Thread.currentThread().threadId());
            });
        }

        long end = System.currentTimeMillis();
        System.out.println("Virtual threads launched in " + (end - start) + " ms");
    }
}
