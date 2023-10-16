
import java.util.Scanner;
public class RA2211003010004_Week_5_question8{
    public static void count_each_character(String RA2211003010004_text){
        int[] characterCounts = new int[255];
        for (int i = 0; i < RA2211003010004_text.length(); i++) {
            char c = RA2211003010004_text.charAt(i);
            characterCounts[c]++;
        }
        System.out.println("Count of each character for the given text/string");
        for (int i = 0; i < characterCounts.length; i++) {
            if (characterCounts[i] > 0) {
                System.out.println((char) i + ": " + characterCounts[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string/text to count the number of each character");
        String RA2211003010004_text=scanner.nextLine();
        count_each_character(RA2211003010004_text);
        scanner.close();
    }
}