class NumberPrinter extends Thread {

    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is running...");
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " prints: " + i);
                Thread.sleep(1000); // simulate waiting/blocking
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");
        }
        System.out.println(Thread.currentThread().getName() + " finished execution.");
    }
}

public class q3 {
    public static void main(String[] args) throws InterruptedException {
        // 1. Thread is created (New state)
        NumberPrinter t1 = new NumberPrinter();
        t1.setName("Thread-1");
        System.out.println("Thread created. isAlive(): " + t1.isAlive());

        // 2. Start the thread (Runnable → Running)
        t1.start();
        System.out.println("Thread started. isAlive(): " + t1.isAlive());

        // Main thread waits for t1 to finish
        t1.join(); // main thread will wait until t1 terminates

        // 3. After completion (Terminated state)
        System.out.println("After completion. isAlive(): " + t1.isAlive());
        System.out.println("Main thread ends.");
    }
}
