// Class representing the shared buffer
class Buffer {
    private int data;
    private boolean available = false; // flag to check if data is present

    // Method for producer to put data
    public synchronized void put(int value) {
        try {
            while (available) { // if buffer is full, wait
                wait();
            }
            data = value;
            System.out.println("Producer produced: " + data);
            available = true;
            notify(); // notify consumer
        } catch (InterruptedException e) {
            System.out.println("Producer interrupted.");
        }
    }

    // Method for consumer to get data
    public synchronized void get() {
        try {
            while (!available) { // if buffer is empty, wait
                wait();
            }
            System.out.println("Consumer consumed: " + data);
            available = false;
            notify(); // notify producer
        } catch (InterruptedException e) {
            System.out.println("Consumer interrupted.");
        }
    }
}

// Producer class
class Producer extends Thread {
    Buffer buffer;

    Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.put(i); // produce data
            try {
                Thread.sleep(500); // simulate delay
            } catch (InterruptedException e) {
                System.out.println("Producer sleep interrupted");
            }
        }
    }
}

// Consumer class
class Consumer extends Thread {
    Buffer buffer;

    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.get(); // consume data
            try {
                Thread.sleep(800); // simulate processing time
            } catch (InterruptedException e) {
                System.out.println("Consumer sleep interrupted");
            }
        }
    }
}

// Main class
public class q5 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
