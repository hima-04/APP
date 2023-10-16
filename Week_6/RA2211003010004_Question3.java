import java.util.Scanner;
class ArithmeticOperations {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public double add(double a,double b) {
        return a + b;
    }
    public double subtract(double a,double b) {
        return a - b;
    }
    public double multiply(double a,double b) {
        return a * b;
    }
}
public class RA2211003010004_Question3{
    public static void main(String[] args) {
        ArithmeticOperations operations = new ArithmeticOperations();
        Scanner scan = new Scanner(System.in);        
        System.out.println("Enter two integers for addition:");
        int RA2211003010004_num1_add = scan.nextInt();
        int RA2211003010004_num2_add = scan.nextInt();
        System.out.println("Addition in Integer: " + operations.add(RA2211003010004_num1_add, RA2211003010004_num2_add));
        System.out.println("Enter two doubles for addition:");
        double RA2211003010004_doubleNum1_add = scan.nextDouble();
        double RA2211003010004_doubleNum2_add = scan.nextDouble();
        System.out.println("Addition in Double: " + operations.add(RA2211003010004_doubleNum1_add, RA2211003010004_doubleNum2_add));
        System.out.println("Enter two integers for subtraction:");
        int RA2211003010004_num1_sub = scan.nextInt();
        int RA2211003010004_num2_sub = scan.nextInt();
        System.out.println("Subtraction: " + operations.subtract(RA2211003010004_num1_sub, RA2211003010004_num2_sub));
        System.out.println("Enter two doubles for subtraction:");
        double RA2211003010004_doubleNum1_sub = scan.nextDouble();
        double RA2211003010004_doubleNum2_sub = scan.nextDouble();
        System.out.println("Subtraction in Double: " + operations.subtract(RA2211003010004_doubleNum1_sub, RA2211003010004_doubleNum2_sub));
        System.out.println("Enter two integers for multiplication:");
        int RA2211003010004_num1_mul = scan.nextInt();
        int RA2211003010004_num2_mul = scan.nextInt();
        System.out.println("Multiplication: " + operations.multiply(RA2211003010004_num1_mul, RA2211003010004_num2_mul));   
        System.out.println("Enter two doubles for multiplication:");
        double RA2211003010004_doubleNum1_mul = scan.nextDouble();
        double RA2211003010004_doubleNum2_mul = scan.nextDouble();
        System.out.println("Multiplication in Double: " + operations.multiply(RA2211003010004_doubleNum1_mul, RA2211003010004_doubleNum2_mul));     
        scan.close();
    }
}