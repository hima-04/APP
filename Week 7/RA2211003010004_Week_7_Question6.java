class Printer {
    synchronized void printJob(int docCount) {
        for(int i = 1; i <= docCount; i++) {
            System.out.println("Printing document #" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class JobThread extends Thread {
    Printer RA2211003010004_printer;
    int RA2211003010004_docCount;

    JobThread(Printer p, int docCount) {
        this.RA2211003010004_printer = p;
        this.RA2211003010004_docCount = docCount;
    }

    @Override
    public void run() {
        RA2211003010004_printer.printJob(RA2211003010004_docCount);
    }
}

public class RA2211003010004_Week_7_Question6 {
    public static void main(String[] args) {
        Printer RA2211003010004_printer = new Printer();
        JobThread RA2211003010004_t1 = new JobThread(RA2211003010004_printer, 10);
        JobThread RA2211003010004_t2 = new JobThread(RA2211003010004_printer, 5);
        RA2211003010004_t1.start();
        RA2211003010004_t2.start();
    }
}