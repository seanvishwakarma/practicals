// Program to create multiple threads by extending Thread class

class ThreadA extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("ThreadA - iteration " + i);
                Thread.sleep(500);  // pause for 500ms
            }
        } catch (InterruptedException e) {
            System.out.println("ThreadA interrupted");
        }
    }
}

class ThreadB extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("ThreadB - iteration " + i);
                Thread.sleep(500);  // pause for 500ms
            }
        } catch (InterruptedException e) {
            System.out.println("ThreadB interrupted");
        }
    }
}

public class q1 {
    public static void main(String[] args) {
        // Create thread objects
        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();

        // Start both threads
        t1.start();
        t2.start();

        System.out.println("Main thread finished starting other threads.");
    }
}
