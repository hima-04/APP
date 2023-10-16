import java.util.Scanner;
public class RA2211003010004_Week_5_question1{
    public static void mirror_image(String RA2211003010004_inputWord){
        String RA2211003010004_reversedWord = "";
        for (int i = RA2211003010004_inputWord.length() - 1; i >= 0; i--) {
            RA2211003010004_reversedWord += RA2211003010004_inputWord.charAt(i);
        }
        System.out.println("Mirror Image of " + RA2211003010004_inputWord + " is " + RA2211003010004_reversedWord);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string to mirror image: ");
        String RA2211003010004_inputWord=scanner.nextLine();
        mirror_image(RA2211003010004_inputWord);
        scanner.close();
    }
}