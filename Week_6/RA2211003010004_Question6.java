import java.util.Scanner;

interface Sortable {
    void sort(int[] arr);
}

class BubbleSort implements Sortable {
    public void sort(int[] RA2211003010004_arr) {
        int n = RA2211003010004_arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (RA2211003010004_arr[j] > RA2211003010004_arr[j+1]) {
                    int temp = RA2211003010004_arr[j];
                    RA2211003010004_arr[j] = RA2211003010004_arr[j+1];
                    RA2211003010004_arr[j+1] = temp;
                }
            }
        }
    }
}

class SelectionSort implements Sortable {
    public void sort(int[] RA2211003010004_arr) {
        int n = RA2211003010004_arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++){
                if (RA2211003010004_arr[j] < RA2211003010004_arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = RA2211003010004_arr[min_idx];
            RA2211003010004_arr[min_idx] = RA2211003010004_arr[i];
            RA2211003010004_arr[i] = temp;
        }
    }
}

public class RA2211003010004_Question6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<size; i++){
            arr[i] = scan.nextInt();
        }
        BubbleSort bs = new BubbleSort();
        bs.sort(arr);
        System.out.println("Array after bubble sort:");
        for(int num : arr){
            System.out.print(num + " ");
        }
        SelectionSort ss = new SelectionSort();
        ss.sort(arr);
        System.out.println("\nArray after selection sort:");
        for(int num : arr){
            System.out.print(num + " ");
        }
        scan.close();
    }
}