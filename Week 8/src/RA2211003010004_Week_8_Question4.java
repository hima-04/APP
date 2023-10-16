import java.sql.*;
public class RA2211003010004_Week_8_Question4{
    public static void main(String[] args) {
        String RA2211003010004_url = "jdbc:mysql://localhost:3306/week_8";
        String RA2211003010004_username = "root";
        String RA2211003010004_password = "3101";

        try {
            Connection RA22110030100002_conn = DriverManager.getConnection(RA2211003010004_url, RA2211003010004_username, RA2211003010004_password);
            Statement RA22110030100002_stmt = RA22110030100002_conn.createStatement();
            ResultSet RA22110030100002_rs = RA22110030100002_stmt.executeQuery("SELECT * FROM contact_details");
            if (!RA22110030100002_rs.isBeforeFirst() ) {    
                System.out.println("No data"); 
            }
            else{
                while(RA22110030100002_rs.next()) {
                System.out.println("\nPerson Name: " + RA22110030100002_rs.getString("personName"));
                System.out.println("Contact Number: " + RA22110030100002_rs.getString("contactNumber"));
                System.out.println("Email ID: " + RA22110030100002_rs.getString("emailId"));
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