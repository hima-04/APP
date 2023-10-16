import java.util.Scanner;
public class RA2211003010004_Week_5_question4 {
    public static void palindrome_checker(String RA2211003010004_palString) {
        String RA2211003010004_reversedWord = "";
        for (int i = RA2211003010004_palString.length() - 1; i >= 0; i--) {
            RA2211003010004_reversedWord += RA2211003010004_palString.charAt(i);
        }
        if (RA2211003010004_reversedWord.toLowerCase().equals(RA2211003010004_palString.toLowerCase())) {
            System.out.println(RA2211003010004_palString + " is palindrome");
        } else {
            System.out.println(RA2211003010004_palString + " is not palindrome");
        }
    }    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check whether is palindrome or not: ");
        String RA2211003010004_palString = scanner.nextLine();
        palindrome_checker(RA2211003010004_palString);
        scanner.close();
    }
}