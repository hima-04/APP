import java.sql.*;
public class RA2211003010004_Week_8_Question9{
    public static void main(String[] args) {
        String RA2211003010004_url = "jdbc:mysql://localhost:3306/week_8";
        String RA2211003010004_username = "root";
        String RA2211003010004_password = "3101";
        try {
            Connection RA2211003010004_conn = DriverManager.getConnection(RA2211003010004_url, RA2211003010004_username, RA2211003010004_password);
            Statement RA2211003010004_stmt = RA2211003010004_conn.createStatement();
            ResultSet RA2211003010004_rs = RA2211003010004_stmt.executeQuery("SELECT * FROM contact_details");
            if (!RA2211003010004_rs.isBeforeFirst() ) {    
                System.out.println("No data"); 
            }
            else{
                while(RA2211003010004_rs.next()) {
                System.out.println("\nPerson Name: " + RA2211003010004_rs.getString("personName"));
                System.out.println("Contact Number: " + RA2211003010004_rs.getString("contactNumber"));
                System.out.println("Email ID: " + RA2211003010004_rs.getString("emailId"));
                }
            }
            RA2211003010004_rs.close();
            RA2211003010004_stmt.close();
            RA2211003010004_conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}