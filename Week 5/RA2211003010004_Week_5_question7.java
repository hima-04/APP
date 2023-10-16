import java.util.Scanner;
public class RA2211003010004_Week_5_question7{
    public static boolean equal_sum_diff_5(int RA2211003010004_Integer_1,int RA2211003010004_Integer_2){
        if(RA2211003010004_Integer_1 + RA2211003010004_Integer_2 == 5 || RA2211003010004_Integer_1 - RA2211003010004_Integer_2== 5 || RA2211003010004_Integer_1==RA2211003010004_Integer_2){
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Integer 1:");
        int RA2211003010004_Integer_1=scanner.nextInt();
        System.out.println("Enter Integer 2:");
        int RA2211003010004_Integer_2=scanner.nextInt();
        boolean result=equal_sum_diff_5(RA2211003010004_Integer_1,RA2211003010004_Integer_2);
        System.out.println("Result: "+result);
        scanner.close();
    }
}