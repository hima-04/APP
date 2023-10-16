import java.sql.*;
import java.util.Scanner;
public class RA2211003010004_Week_8_Question6{
    public static void main(String[] args) {
        String RA22110030100002_url = "jdbc:mysql://localhost:3306/week_8";
        String RA22110030100002_username = "root";
        String RA22110030100002_password = "3101";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book ID: ");
        int book_id = scanner.nextInt();
        
        try {
            Connection RA22110030100002_conn = DriverManager.getConnection(RA22110030100002_url, RA22110030100002_username, RA22110030100002_password);
            Statement RA22110030100002_stmt = RA22110030100002_conn.createStatement();
            ResultSet RA22110030100002_rs = RA22110030100002_stmt.executeQuery("SELECT * FROM books WHERE book_id = " + book_id);
            if (RA22110030100002_rs.next()) {
                System.out.println("Book ID: " + RA22110030100002_rs.getInt("book_id"));
                System.out.println("Book Name: " + RA22110030100002_rs.getString("book_name"));
                System.out.println("Available Copies: " + RA22110030100002_rs.getInt("available_copies"));
                System.out.print("Do you want to increase or decrease the copies count? (increase/decrease): ");
                String action = scanner.next();
                if (action.equalsIgnoreCase("increase")) {
                    String sqlUpdate = "UPDATE books SET available_copies = available_copies + 1 WHERE book_id = " + book_id;
                    int rowsAffected = RA22110030100002_stmt.executeUpdate(sqlUpdate);
                    if (rowsAffected > 0) {
                        System.out.println("Record updated successfully!");
                    }
                } else if (action.equalsIgnoreCase("decrease")) {
                    String sqlUpdate = "UPDATE books SET available_copies = available_copies - 1 WHERE book_id = " + book_id;
                    int rowsAffected = RA22110030100002_stmt.executeUpdate(sqlUpdate);
                    if (rowsAffected > 0) {
                        System.out.println("Record updated successfully!");
                    }
                } else {
                    System.out.println("Invalid action. Please enter 'increase' or 'decrease'.");
                }
            } else {
                System.out.println("No record found with book_id " + book_id + ".");
            }
            RA22110030100002_stmt.close();
            RA22110030100002_conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}