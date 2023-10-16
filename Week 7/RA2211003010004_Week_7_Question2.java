class RA2211003010004_Buffer {
    private int number;
    private boolean available = false;

    public synchronized int get() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        notifyAll();
        return number;
    }

    public synchronized void put(int number) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.number = number;
        available = true;
        notifyAll();
    }
}

class RA2211003010004_Producer implements Runnable {
    private RA2211003010004_Buffer buffer;

    public RA2211003010004_Producer(RA2211003010004_Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            buffer.put(i);
            System.out.println("Producer produced: " + i);
            try {
                Thread.sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) { }
        }
    }
}

class RA2211003010004_Consumer implements Runnable {
    private RA2211003010004_Buffer buffer;

    public RA2211003010004_Consumer(RA2211003010004_Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Consumer consumed: " + buffer.get());
            try {
                Thread.sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) { }
        }
    }
}

public class RA2211003010004_Week_7_Question2{
    public static void main(String[] args) {
        RA2211003010004_Buffer buffer = new RA2211003010004_Buffer();
        Thread  RA2211003010004_producerThread = new Thread(new RA2211003010004_Producer(buffer));
        Thread  RA2211003010004_consumerThread = new Thread(new RA2211003010004_Consumer(buffer));
        RA2211003010004_producerThread.start();
        RA2211003010004_consumerThread.start();
    }
}