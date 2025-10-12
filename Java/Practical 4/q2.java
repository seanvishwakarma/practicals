// Program to demonstrate thread creation using Runnable interface

class MyTask implements Runnable {
    private String taskName;

    // Constructor to identify the thread
    MyTask(String name) {
        this.taskName = name;
    }

    // The code that runs inside the thread
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(taskName + " - iteration " + i);
                Thread.sleep(500); // delay of 0.5 seconds
            }
        } catch (InterruptedException e) {
            System.out.println(taskName + " interrupted.");
        }
    }
}

public class q2 {
    public static void main(String[] args) {
        // Create Runnable objects
        MyTask task1 = new MyTask("Thread-1");
        MyTask task2 = new MyTask("Thread-2");

        // Create Thread objects and pass Runnable tasks
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        // Start threads concurrently
        t1.start();
        t2.start();

        System.out.println("Main thread started both threads.");
    }
}
