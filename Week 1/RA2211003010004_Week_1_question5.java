import java.util.Scanner;

public class RA2211003010004_Week_1_question5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.next();

        int numLetters = 0;
        int numDigits = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                numLetters++;
            } else if (c >= '0' && c <= '9') {
                numDigits++;
            }
        }

        System.out.println("Letters = " + numLetters);
        System.out.println("Digits = " + numDigits);

        input.close();
    }
}