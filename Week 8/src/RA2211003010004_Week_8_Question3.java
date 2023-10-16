import java.sql.*;
public class RA2211003010004_Week_8_Question3{
    public static void main(String[] args) {
        String RA22110030100002_url = "jdbc:mysql://localhost:3306/week_8";
        String RA22110030100002_username = "root";
        String RA22110030100002_password = "3101";
        try {
            Connection RA22110030100002_conn = DriverManager.getConnection(RA22110030100002_url, RA22110030100002_username, RA22110030100002_password);
            Statement RA22110030100002_stmt = RA22110030100002_conn.createStatement();
            ResultSet RA22110030100002_rs = RA22110030100002_stmt.executeQuery("SELECT * FROM students");
            
            if (!RA22110030100002_rs.isBeforeFirst() ) {    
                System.out.println("No data"); 
            } else {
                while(RA22110030100002_rs.next()) {
                    System.out.println("\nRegister No: " + RA22110030100002_rs.getString("Register_no"));
                    System.out.println("Name: " + RA22110030100002_rs.getString("name"));
                    System.out.println("Grade: " + RA22110030100002_rs.getFloat("CGPA"));
                }
            }
            RA22110030100002_rs.close();
            RA22110030100002_stmt.close();
            RA22110030100002_conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}