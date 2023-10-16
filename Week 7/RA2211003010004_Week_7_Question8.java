import java.util.Scanner;

class UserThreadPriority extends Thread {
    String RA2211003010004_k;
    char RA2211003010004_c;

    UserThreadPriority(String k, char c) {
        this.RA2211003010004_k = k;
        this.RA2211003010004_c = c;
    }

    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i < RA2211003010004_k.length(); i++) {
            if (RA2211003010004_k.charAt(i) == RA2211003010004_c) {
                count++;
            }
        }
        System.out.println(Thread.currentThread().getName() + ": " + count);
    }
}

public class RA2211003010004_Week_7_Question8{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String RA2211003010004_k = scan.next();
        System.out.print("Enter a character: ");
        char RA2211003010004_c = scan.next().charAt(0);

        UserThreadPriority RA2211003010004_threadobj1 = new UserThreadPriority(RA2211003010004_k, RA2211003010004_c);
        UserThreadPriority RA2211003010004_threadobj2 = new UserThreadPriority(RA2211003010004_k, RA2211003010004_c);

        RA2211003010004_threadobj1.setName("ThreadA");
        RA2211003010004_threadobj2.setName("ThreadB");

        RA2211003010004_threadobj1.start();
        RA2211003010004_threadobj2.start();

        scan.close();
    }
}