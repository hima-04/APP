import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class RA2211003010004_Week_8_Question1{
    public static void main(String[] args) {
        String RA2211003010004_url = "jdbc:mysql://localhost:3306/week_8";
        String RA2211003010004_username = "root";
        String RA2211003010004_password = "3101";
        System.out.println("Connecting to the database...");
        try (Connection connection = DriverManager.getConnection(RA2211003010004_url, RA2211003010004_username, RA2211003010004_password)) {
            System.out.println("Connected successfully!");
        } catch (SQLException e) {
            System.out.println("Unable to connect to the database.");
            e.printStackTrace();
        }
    }
}