import java.util.Scanner;

public class RA2211003010004_Week_1_question1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = 1000;
        int end = 2000;

        System.out.print("Enter a number between 1000 and 2000: ");
        int userInput = scanner.nextInt();

        if (userInput < start || userInput > end) {
            System.out.println("Invalid input! Please enter a number between 1000 and 2000.");
        } else if (userInput % 8 == 0 && userInput % 5 == 0) {
            System.out.println(userInput + " is divisible by 8 and a multiple of 5.");
        } else {
            System.out.println(userInput + " is not divisible by 8 and a multiple of 5.");
        }

        scanner.close();
    }
}
