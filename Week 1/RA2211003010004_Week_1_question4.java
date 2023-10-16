import java.util.Scanner;

public class RA2211003010004_Week_1_question4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String inputWord = scanner.next();

        String reversedWord = "";
        for (int i = inputWord.length() - 1; i >= 0; i--) {
            reversedWord += inputWord.charAt(i);
        }

        System.out.println("Reverse word of " + inputWord + " is " + reversedWord);

        scanner.close();
    }
}