public class RA2211003010004_Week_7_Question3 {
    public static void main(String[] args) {
        Thread RA2211003010004_t = new Thread(() -> {
            try {
                System.out.println("Current Thread Name: " + Thread.currentThread().getName());
                Thread.sleep(5000);
                Thread.currentThread().setName("RA2211003010004_NewThreadName");
                System.out.println("New Thread Name: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "RA2211003010004_OriginalThreadName");
        RA2211003010004_t.start();
    }
}