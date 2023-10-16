class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class RA2211003010004_Week_7_Question10{
    public static void main(String[] args) {
        MyThread RA2211003010004_thread1 = new MyThread("Thread1");
        MyThread RA2211003010004_thread2 = new MyThread("Thread2");
        MyThread RA2211003010004_thread3 = new MyThread("Thread3");
        MyThread RA2211003010004_thread4 = new MyThread("Thread4");
        MyThread RA2211003010004_thread5 = new MyThread("Thread5");

        RA2211003010004_thread1.setPriority(Thread.MIN_PRIORITY);
        RA2211003010004_thread2.setPriority(3);
        RA2211003010004_thread3.setPriority(Thread.NORM_PRIORITY);
        RA2211003010004_thread4.setPriority(7);
        RA2211003010004_thread5.setPriority(Thread.MAX_PRIORITY);

        RA2211003010004_thread1.start();
        RA2211003010004_thread2.start();
        RA2211003010004_thread3.start();
        RA2211003010004_thread4.start();
        RA2211003010004_thread5.start();
    }
}