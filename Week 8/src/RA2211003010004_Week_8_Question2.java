import java.sql.*;
import java.util.Scanner;
class AirlineReservationSystem {
    private Connection connection;
    public AirlineReservationSystem() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/week_8", "root", "3101");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public int bookTicket(String flightNumber, String passengerName) {
        int reservationId = 1;
        try {
            String query = "INSERT INTO reservations (flight_number, passenger_name) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, flightNumber);
            preparedStatement.setString(2, passengerName);
            preparedStatement.executeUpdate();
            ResultSet rs = preparedStatement.getGeneratedKeys();
            if (rs.next()) {
                reservationId = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reservationId;
    }
    public void cancelTicket(int reservationId) {
        try {
            String query = "SELECT * FROM reservations WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, reservationId);
            ResultSet rs = preparedStatement.executeQuery();
            if (!rs.next()) {
                System.out.println("No reservation found with ID: " + reservationId);
            } else {
                query = "DELETE FROM reservations WHERE id = ?";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, reservationId);
                preparedStatement.executeUpdate();
                System.out.println("Successfully cancelled ticket with reservation ID: " + reservationId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void displayReservations() {
        try {
            String query = "SELECT * FROM reservations";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            if (!rs.next()) {
                System.out.println("No data");
            } else {
                do {
                    System.out.println("\nReservation Details:");
                    System.out.println("Reservation ID: " + rs.getInt("id"));
                    System.out.println("Flight Number: " + rs.getString("flight_number"));
                    System.out.println("Passenger Name: " + rs.getString("passenger_name"));
                    System.out.println("\n");
                } while (rs.next());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
public class RA2211003010004_Week_8_Question2 {
    public static void main(String[] args) {
        AirlineReservationSystem RA2211003010004_ars = new AirlineReservationSystem();
        Scanner scan = new Scanner(System.in);
        int RA2211003010004_option = 0;
        while (RA2211003010004_option != 4) {
            System.out.println("Airline Reservation");
            System.out.println("1 to book a ticket");
            System.out.println("2 to cancel a ticket");
            System.out.println("3 to display reservations");
            System.out.println("4 to quit");
            System.out.print("Enter Choice: ");
            RA2211003010004_option = scan.nextInt();
            scan.nextLine();
            switch (RA2211003010004_option) {
                case 1:
                    System.out.println("Enter flight number:");
                    String flightNumber = scan.nextLine();
                    System.out.println("Enter passenger name:");
                    String passengerName = scan.nextLine();
                    int reservationId = RA2211003010004_ars.bookTicket(flightNumber, passengerName);
                    System.out.println("Successfully booked ticket with reservation ID: " + reservationId);
                    break;
                case 2:
                    System.out.println("Enter reservation ID:");
                    reservationId = scan.nextInt();
                    RA2211003010004_ars.cancelTicket(reservationId);
                    break;
                case 3:
                    RA2211003010004_ars.displayReservations();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid RA2211003010004_option. Please enter a number between 1 and 4.");
                    break;
            }
        }
        scan.close();
    }
}