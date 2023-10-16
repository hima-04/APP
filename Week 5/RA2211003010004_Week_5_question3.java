
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class RA2211003010004_Week_5_question3 {
    public static void even_number_print(List<Integer> RA2211003010004_even_number_checker_list){
        for (int i=0;i<RA2211003010004_even_number_checker_list.size();i++){
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter No of elements in the list:");
        int RA2211003010004_no_of_elements=scanner.nextInt();
        List<Integer> RA2211003010004_even_number_checker_list = new ArrayList<>();
        System.out.println("Enter the elements of the list: ");
        for (int i = 0; i < RA2211003010004_no_of_elements; i++) {
            RA2211003010004_even_number_checker_list.add(scanner.nextInt());
        }
        System.out.println("Original list: " + RA2211003010004_even_number_checker_list);
        System.out.print("Even numbers: "); 
        even_number_print(RA2211003010004_even_number_checker_list);
        scanner.close();
    }
}