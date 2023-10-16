import java.util.Scanner;
public class RA2211003010004_Week_5_question10 {
    public static void unique_value_check(int [] RA2211003010004_arr)
    {
        int count=0;
        for (int i=0;i<RA2211003010004_arr.length;i++){
            boolean flag=true;
            for(int j=0;j<i;j++)
            {
                if(RA2211003010004_arr[i]==RA2211003010004_arr[j]){
                    flag=false;
                }
            }
            if(flag){
                count++;
            }
        }
        System.out.println("The number of unique values is "+count);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] RA2211003010004_arr=new int[15];
        System.out.println("Enter the number of your choice:");
        for (int i = 0;i < 15;i++) {
            RA2211003010004_arr[i]=scanner.nextInt();
        }
        unique_value_check(RA2211003010004_arr);
        scanner.close();
    }
}