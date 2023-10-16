
import java.util.Scanner;

public class RA2211003010004_Week_1_question9{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        scanner.close();

        int result = addNumbers(firstNumber, secondNumber);
        System.out.println("Sum of two numbers: " + result);
    }

    public static int addNumbers(int num1, int num2) {
        int sum = num1 + num2;
        if (sum > 105 && sum < 200) {
            sum = 200;
            System.out.println("Sum is between 105 and 200");
        }
        return sum;
    }
}