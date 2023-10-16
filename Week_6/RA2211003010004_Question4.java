import java.util.Scanner;
class RA2211003010004_Employee {
    private double RA2211003010004_salary;

    public void RA2211003010004_work() {
        System.out.println("Employee is working...");
    }

    public void RA2211003010004_setSalary(double salary) {
        this.RA2211003010004_salary = salary;
    }

    public double RA2211003010004_getSalary() {
        return this.RA2211003010004_salary;
    }
}
class RA2211003010004_HRManager extends RA2211003010004_Employee {
    @Override
    public void RA2211003010004_work() {
        System.out.println("HR Manager is working...");
    }

    public void RA2211003010004_addEmployee() {
        System.out.println("Adding an employee...");
    }
}

public class RA2211003010004_Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RA2211003010004_HRManager hrManager = new RA2211003010004_HRManager();
        System.out.println("Enter the HR Manager's salary:");
        double salary = scanner.nextDouble();
        hrManager.RA2211003010004_setSalary(salary);
        hrManager.RA2211003010004_work();
        System.out.println("Enter the number of employees to add:");
        int numEmployees = scanner.nextInt();
        for (int i = 0; i < numEmployees; i++) {
            hrManager.RA2211003010004_addEmployee();
        }
        System.out.println("Salary: " + hrManager.RA2211003010004_getSalary());
        scanner.close();
    }
}