import java.util.Random;

class RA2211003010004_RandomIntegerGenerator implements Runnable {
    private int randomNum;

    @Override
    public void run() {
        Random random = new Random();
        randomNum = random.nextInt(100);
        System.out.println("Random Number: " + randomNum);
    }

    public int getRandomNum() {
        return randomNum;
    }
}

class RA2211003010004_Square implements Runnable {
    private RA2211003010004_RandomIntegerGenerator generator;

    public RA2211003010004_Square(RA2211003010004_RandomIntegerGenerator generator) {
        this.generator = generator;
    }

    @Override
    public void run() {
        if (generator.getRandomNum() % 2 == 0) {
            System.out.println("Square: " + Math.pow(generator.getRandomNum(), 2));
        }
    }
}

class RA2211003010004_Cube implements Runnable {
    private RA2211003010004_RandomIntegerGenerator generator;

    public RA2211003010004_Cube(RA2211003010004_RandomIntegerGenerator generator) {
        this.generator = generator;
    }

    @Override
    public void run() {
        if (generator.getRandomNum() % 2 != 0) {
            System.out.println("Cube: " + Math.pow(generator.getRandomNum(), 3));
        }
    }
}

public class RA2211003010004_Week_7_Question1{
    public static void main(String[] args) throws InterruptedException {
        RA2211003010004_RandomIntegerGenerator generator = new RA2211003010004_RandomIntegerGenerator();
        Thread RA2211003010004_t1 = new Thread(generator);
        Thread RA2211003010004_t2 = new Thread(new RA2211003010004_Square(generator));
        Thread RA2211003010004_t3 = new Thread(new RA2211003010004_Cube(generator));

        RA2211003010004_t1.start();
        RA2211003010004_t1.join();
        RA2211003010004_t2.start();
        RA2211003010004_t3.start();
    }
}