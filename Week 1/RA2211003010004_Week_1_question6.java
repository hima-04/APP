import java.util.Scanner;

public class RA2211003010004_Week_1_question6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a strong password (6 - 16 characters): ");
        String password = input.next();

        if (password.length() < 6) {
            System.out.println("Enter the password with at least 6 characters");
            System.exit(0);
        } else if (password.length() > 16) {
            System.out.println("Enter the password with at most 16 characters");
            System.exit(0);
        }

        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int symbolCount = 0;
        int digitCount = 0;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c >= 'a' && c <= 'z') {
                lowercaseCount++;
            } else if (c >= 'A' && c <= 'Z') {
                uppercaseCount++;
            } else if (c >= '0' && c <= '9') {
                digitCount++;
            } else if (c == '@' || c == '#' || c == '$') {
                symbolCount++;
            }
        }

        if (lowercaseCount > 0 && uppercaseCount > 0 && symbolCount > 0 && digitCount > 0) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
            if (lowercaseCount == 0) {
                System.out.println("At least 1 lowercase character required");
            }
            if (uppercaseCount == 0) {
                System.out.println("At least 1 uppercase character required");
            }
            if (digitCount == 0) {
                System.out.println("At least 1 digit required");
            }
            if (symbolCount == 0) {
                System.out.println("At least 1 symbol (@ / # / $) required");
            }
        }

        input.close();
    }
}