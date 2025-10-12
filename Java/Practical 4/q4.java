// Class with synchronized method
class Table {
    // Synchronized method to prevent thread interference
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(500); // simulate delay
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted.");
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished printing table of " + n + "\n");
    }
}

// Thread class accessing Table object
class MyThread extends Thread {
    Table t;
    int number;

    MyThread(Table t, int number) {
        this.t = t;
        this.number = number;
    }

    public void run() {
        t.printTable(number); // call synchronized method
    }
}

public class q4 {
    public static void main(String[] args) {
        Table obj = new Table(); // single shared object

        // Create multiple threads accessing the same object
        MyThread t1 = new MyThread(obj, 5);
        t1.setName("Thread-1");
        MyThread t2 = new MyThread(obj, 10);
        t2.setName("Thread-2");

        // Start threads
        t1.start();
        t2.start();
    }
}
