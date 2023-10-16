class RA2211003010004_UserThread implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("User Thread started");
            Thread.sleep(1000);
            System.out.println("User Thread ended");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class RA2211003010004_Week_7_Question5 {
    public static void main(String[] args) {
        Thread RA2211003010004_userThread = new Thread(new RA2211003010004_UserThread());
        RA2211003010004_userThread.start();
        try {
            System.out.println("Main Thread started");
            Thread.sleep(1000);
            System.out.println("Main Thread ended");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}