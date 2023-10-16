import java.util.Scanner;
import RA2211003010004.addition.RA2211003010004_Add;
import RA2211003010004.subtraction.RA2211003010004_Subtract;
import RA2211003010004.multiplication.RA2211003010004_Multiply;
import RA2211003010004.division.RA2211003010004_Divide;

public class RA2211003010004_Question9{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        RA2211003010004_Add addObj = new RA2211003010004_Add();
        RA2211003010004_Subtract subtractObj = new RA2211003010004_Subtract();
        RA2211003010004_Multiply multiplyObj = new RA2211003010004_Multiply();
        RA2211003010004_Divide divideObj = new RA2211003010004_Divide();
        System.out.print("Enter Number 1: ");
        int a=scan.nextInt();
        System.out.print("Enter Number 2: ");
        int b=scan.nextInt();
        System.out.println("Addition: " + addObj.add(a, b));
        System.out.println("Subtraction: " + subtractObj.subtract(a, b));
        System.out.println("Multiplication: " + multiplyObj.multiply(a, b));
        System.out.println("Division: " + divideObj.divide(a, b));
        scan.close();
    }
}