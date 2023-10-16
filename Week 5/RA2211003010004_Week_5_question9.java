import java.util.Scanner;
public class RA2211003010004_Week_5_question9 {
    public static void Possible_combinations(int RA2211003010004_digit_1,int RA2211003010004_digit_2,int RA2211003010004_digit_3){
        System.out.println("Possible Combinations for the given three digits:");
        int[] digits = {RA2211003010004_digit_1, RA2211003010004_digit_2, RA2211003010004_digit_3};
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    if(i!=j && i!=k && j!=k)
                        System.out.println(digits[i]+""+digits[j]+""+digits[k]);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter any three number digits: ");
        int RA2211003010004_digit_1 =scanner.nextInt();
        int RA2211003010004_digit_2 =scanner.nextInt();
        int RA2211003010004_digit_3 =scanner.nextInt();
        Possible_combinations(RA2211003010004_digit_1,RA2211003010004_digit_2,RA2211003010004_digit_3);
        scanner.close();
    }
}