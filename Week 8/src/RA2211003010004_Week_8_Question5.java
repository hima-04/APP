import java.sql.*;
import java.util.Scanner;
public class RA2211003010004_Week_8_Question5{
    public static void main(String[] args) {
        String RA22110030100002_url = "jdbc:mysql://localhost:3306/week_8";
        String RA22110030100002_username = "root";
        String RA22110030100002_password = "3101";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student Register No: ");
        String Register_no = scan.nextLine();
        System.out.print("Enter student name: ");
        String name = scan.nextLine();
        System.out.print("Enter student CGPA: ");
        float CGPA = scan.nextFloat();
        try {
            Connection RA22110030100002_conn = DriverManager.getConnection(RA22110030100002_url, RA22110030100002_username, RA22110030100002_password);
            Statement RA22110030100002_stmt = RA22110030100002_conn.createStatement();
            String sql = "INSERT INTO students (Register_no, name, CGPA) VALUES ('" + Register_no + "', '" + name + "', " + CGPA + ")";
            RA22110030100002_stmt.executeUpdate(sql);
            System.out.println("Record inserted successfully!");
            RA22110030100002_stmt.close();
            RA22110030100002_conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        scan.close();
    }
}