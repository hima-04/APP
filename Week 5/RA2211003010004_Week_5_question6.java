import java.util.Scanner;
public class RA2211003010004_Week_5_question6 {
    public static void phone_digit_missing(String RA2211003010004_number){
        boolean[] digits = new boolean[10];
        for (int i = 0;i<RA2211003010004_number.length();i++) {
            int digit=Character.getNumericValue(RA2211003010004_number.charAt(i));
            digits[digit] = true;
        }
        System.out.print("The missing digits are: ");
        for (int i = 0; i < digits.length; i++) {
            if (!digits[i]) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the 10 digit number to find the missing digit:");
        String RA2211003010004_number=scanner.nextLine();
        phone_digit_missing(RA2211003010004_number);
        scanner.close();
    }
}