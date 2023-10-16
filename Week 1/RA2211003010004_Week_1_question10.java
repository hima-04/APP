
import java.util.Scanner;

public class RA2211003010004_Week_1_question10 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for creating the pattern: ");
        int patternNum = scanner.nextInt();
        scanner.close();

        System.out.println();
        for (int i = patternNum; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}