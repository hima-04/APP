import java.sql.*;
public class RA2211003010004_Week_8_Question8{
    public static void main(String[] args) {
        String RA2211003010004_url = "jdbc:mysql://localhost:3306/week_8";
        String RA2211003010004_username = "root";
        String RA2211003010004_password = "3101";
        try {
            Connection RA2211003010004_conn = DriverManager.getConnection(RA2211003010004_url, RA2211003010004_username, RA2211003010004_password);
            Statement RA2211003010004_stmt = RA2211003010004_conn.createStatement();
            ResultSet RA2211003010004_rs = RA2211003010004_stmt.executeQuery("SELECT * FROM students");
            while(RA2211003010004_rs.next()) {
                System.out.println("\nRegister No: " + RA2211003010004_rs.getString("Register_no"));
                System.out.println("Name: " + RA2211003010004_rs.getString("name"));
                System.out.println("CGPA: " + RA2211003010004_rs.getFloat("CGPA"));
            }
            RA2211003010004_rs.close();
            RA2211003010004_stmt.close();
            RA2211003010004_conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}