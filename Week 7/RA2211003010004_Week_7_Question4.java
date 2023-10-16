public class RA2211003010004_Week_7_Question4{
    public static void main(String[] args) {
        Thread RA2211003010004_t = new Thread(() -> {
            try {
                for (int i = 5; i > 0; i--) {
                    System.out.println(i);
                    Thread.sleep(6000);
                }
                Thread.currentThread().setName("RA2211003010004_NewThreadName");
                System.out.println("New Thread Name: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "RA2211003010004_OriginalThreadName");

        RA2211003010004_t.start();
    }
}