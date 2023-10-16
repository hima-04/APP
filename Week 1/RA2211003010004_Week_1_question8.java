import java.util.Scanner;

public class RA2211003010004_Week_1_question8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month: ");
        String userInputMonth = scanner.next();
        userInputMonth = userInputMonth.toLowerCase();
        scanner.close();

        String months[] = {"january", "february", "march", "april", "may", "june", "july", "august", "september",
                           "october", "november", "december"};
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int index = -1;
        for (int i = 0; i < 12; i++) {
            if (userInputMonth.equals(months[i])) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Enter a correct month");
        } else {
            System.out.println("Number of days in " + userInputMonth + ": " + days[index] + " days");
        }
    }
}