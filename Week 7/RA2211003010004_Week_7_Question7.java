import java.util.Scanner;
class ThreadA extends Thread {
    String RA2211003010004_k;
    ThreadA(String k) {
        this.RA2211003010004_k = k;
    }

    @Override
    public void run() {
        int RA2211003010004_dc = 0;
        for (char c : RA2211003010004_k.toCharArray()) {
            if (Character.isDigit(c)) {
                RA2211003010004_dc++;
            }
        }
        System.out.println("ThreadA: " + RA2211003010004_dc);
    }
}

class ThreadB extends Thread {
    String RA2211003010004_k;
    ThreadB(String k) {
        this.RA2211003010004_k = k;
    }

    @Override
    public void run() {
        int RA2211003010004_cc = 0;
        for (char c : RA2211003010004_k.toCharArray()) {
            if (Character.isLetter(c)) {
                RA2211003010004_cc++;
            }
        }
        System.out.println("ThreadB: " + RA2211003010004_cc);
    }
}
public class RA2211003010004_Week_7_Question7 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a String: ");
        String RA2211003010004_k = scan.next();
        ThreadA RA2211003010004_t1 = new ThreadA(RA2211003010004_k);
        ThreadB RA2211003010004_t2 = new ThreadB(RA2211003010004_k);
        RA2211003010004_t1.start();
        RA2211003010004_t2.start();
        scan.close();
    }
}