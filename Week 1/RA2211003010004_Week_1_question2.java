import java.util.*;


public class RA2211003010004_Week_1_question2{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int attempt = 0;
        int randomNumber = random.nextInt(9) + 1;

        while (true) {
            System.out.println("Guess a number between 1 and 9\n");
            System.out.print("Enter a number between 1 - 9 : ");
            int userGuess = scanner.nextInt();

            if (userGuess > 9) {
                System.out.println("Enter a number below 10.\n");
                continue;
            }

            if (userGuess == randomNumber) {
                System.out.println("Well guessed! in " + attempt + " attempts");
                break;
            } else {
                attempt++;
                System.out.println("Guessed Wrong\nTry Again\n\n");
            }
        }
        scanner.close();
    }
}