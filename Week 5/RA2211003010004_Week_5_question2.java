import java.util.Scanner;
public class RA2211003010004_Week_5_question2{
    public static boolean rotationally_equivalent(String RA2211003010004_inputString_1, String RA2211003010004_inputString_2){
        if (RA2211003010004_inputString_1.length() != RA2211003010004_inputString_2.length()) {
            return false;
        }
        String RA2211003010004_concatenatedString = RA2211003010004_inputString_1 + RA2211003010004_inputString_1;
        return RA2211003010004_concatenatedString.contains(RA2211003010004_inputString_2);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String RA2211003010004_inputString_1=scanner.nextLine();
        System.out.print("Enter String 2: ");
        String RA2211003010004_inputString_2=scanner.nextLine();
        System.out.println("String 1 is : " + RA2211003010004_inputString_1);
        System.out.println("String 2 is : " + RA2211003010004_inputString_2);
        System.out.println("Are Two Rotationally equal?: "+ rotationally_equivalent(RA2211003010004_inputString_1,RA2211003010004_inputString_2));
        scanner.close();
    }
}