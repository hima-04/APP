import java.util.Scanner;
import RA2211003010002.BubbleSort.BubbleSort;
import RA2211003010002.SelectionSort.SelectionSort;

public class RA2211003010002_Question10{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int RA2211003010002_n = scan.nextInt();
        int[] arr = new int[RA2211003010002_n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < RA2211003010002_n; i++) {
            arr[i] = scan.nextInt();
        }
        int[] arrBubbleSort = arr.clone();
        BubbleSort.bubbleSort(arrBubbleSort);
        System.out.println("Array sorted using bubble sort:");
        for (int RA2211003010002_elements : arrBubbleSort) {
            System.out.print(RA2211003010002_elements + " ");
        }
        System.out.println();
        int[] arrSelectionSort = arr.clone();        
        SelectionSort.selectionSort(arrSelectionSort);
        System.out.println("Array sorted using selection sort:");
        for (int RA2211003010002_elements : arrSelectionSort) {
            System.out.print(RA2211003010002_elements + " ");
        }
        scan.close();
    }
}