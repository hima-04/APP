class MyThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                if (i == 0) {
                    Thread.sleep(10);
                } else if (i == 1) {
                    Thread.sleep(20);
                } else if (i == 2) {
                    Thread.sleep(50);
                } else if (i == 3) {
                    Thread.sleep(70);
                } else if (i == 4) {
                    Thread.sleep(100);
                }
                System.out.println("Thread: " + i);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}

public class RA2211003010004_Week_7_Question9{
    public static void main(String[] args) {
        MyThread RA2211003010004_t = new MyThread();
        RA2211003010004_t.start();
    }
}