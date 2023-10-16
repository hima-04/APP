import java.sql.*;
import java.util.Scanner;
public class RA2211003010004_Week_8_Question10 {
    static final String RA2211003010004_url = "jdbc:mysql://localhost/week_8";
    static final String RA2211003010004_user = "root";
    static final String RA2211003010004_password = "3101";
    public static void main(String[] args) {
        try (Connection RA2211003010004_conn = DriverManager.getConnection(RA2211003010004_url, RA2211003010004_user, RA2211003010004_password);
             Statement RA2211003010004_stmt = RA2211003010004_conn.createStatement()) {

            createFlightTable(RA2211003010004_stmt);
            Scanner scan = new Scanner(System.in);
            int RA2211003010004_choice;

            do {
                displayMenu();
                RA2211003010004_choice = scan.nextInt();

                switch (RA2211003010004_choice) {
                    case 1:
                        insertFlight(RA2211003010004_conn, scan);
                        break;
                    case 2:
                        viewFlights(RA2211003010004_stmt);
                        break;
                    case 3:
                        updateFlight(RA2211003010004_conn, scan);
                        break;
                    case 4:
                        deleteFlight(RA2211003010004_conn, scan);
                        break;
                    case 5:
                        System.out.println("Exiting the program. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (RA2211003010004_choice != 5);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static void createFlightTable(Statement stmt) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS flights (" +"flight_number VARCHAR(100) PRIMARY KEY, " +"origin VARCHAR(100), " +"destination VARCHAR(100), " +"departure_time TIME, " +"arrival_time TIME)";
        stmt.executeUpdate(createTableSQL);
    }
    private static void displayMenu() {
        System.out.println("===== Airline Library Maintenance System =====");
        System.out.println("1. Insert a flight");
        System.out.println("2. View flights");
        System.out.println("3. Update a flight");
        System.out.println("4. Delete a flight");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }
    private static void insertFlight(Connection conn, Scanner scan) throws SQLException {
        scan.nextLine();
        System.out.print("Enter flight number: ");
        String RA2211003010004_flightNumber = scan.nextLine();
        System.out.print("Enter origin: ");
        String RA2211003010004_origin = scan.nextLine();
        System.out.print("Enter destination: ");
        String RA2211003010004_destination = scan.nextLine();
        System.out.print("Enter departure time (HH:MM:SS): ");
        String RA2211003010004_departureTime = scan.nextLine();
        System.out.print("Enter arrival time (HH:MM:SS): ");
        String RA2211003010004_arrivalTime = scan.nextLine();
        String RA2211003010004_insertFlightSQL = "INSERT INTO flights (flight_number, origin, destination, departure_time, arrival_time) " + "VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = conn.prepareStatement(RA2211003010004_insertFlightSQL)) {
            preparedStatement.setString(1, RA2211003010004_flightNumber);
            preparedStatement.setString(2, RA2211003010004_origin);
            preparedStatement.setString(3, RA2211003010004_destination);
            preparedStatement.setString(4, RA2211003010004_departureTime);
            preparedStatement.setString(5, RA2211003010004_arrivalTime);
    
            int RA2211003010004_rowsAffected = preparedStatement.executeUpdate();
            if (RA2211003010004_rowsAffected > 0) {
                System.out.println("Data inserted sucessfully");
            } else {
                System.out.println("No data inserted.");
            }
        }
    }
    private static void viewFlights(Statement stmt) throws SQLException {
        String RA2211003010004_selectAllFlightsSQL = "SELECT * FROM flights";
        ResultSet RA2211003010004_resultSet = stmt.executeQuery(RA2211003010004_selectAllFlightsSQL);
        System.out.println("===== Flight Details =====");
        boolean RA2211003010004_dataFound = false;
    
        while (RA2211003010004_resultSet.next()) {
            String RA2211003010004_flightNumber = RA2211003010004_resultSet.getString("flight_number");
            String RA2211003010004_origin = RA2211003010004_resultSet.getString("origin");
            String RA2211003010004_destination = RA2211003010004_resultSet.getString("destination");
            String RA2211003010004_departureTime = RA2211003010004_resultSet.getString("departure_time");
            String RA2211003010004_arrivalTime = RA2211003010004_resultSet.getString("arrival_time");
    
            System.out.println("Flight No :" + RA2211003010004_flightNumber);
            System.out.println("From " + RA2211003010004_origin + " to " + RA2211003010004_destination);
            System.out.println("Departure Time: " + RA2211003010004_departureTime);
            System.out.println("Arrival Time: " + RA2211003010004_arrivalTime);
            System.out.println("\n");
            RA2211003010004_dataFound = true;
        }
    
        if (!RA2211003010004_dataFound) {
            System.out.println("No flight data available.\n");
        }
    }
    
    private static void updateFlight(Connection conn, Scanner scan) throws SQLException {
        scan.nextLine();
        System.out.print("Enter the flight number to update: ");
        String RA2211003010004_flightNumber = scan.nextLine();
        System.out.println("What would you like to update?");
        System.out.println("1. Update departure time");
        System.out.println("2. Update origin");
        System.out.println("3. Update destination");
        System.out.print("Enter your choice: ");
        int RA2211003010004_choice = scan.nextInt();
        String RA2211003010004_updateFlightSQL = null;
        String RA2211003010004_newValue = null;
        switch (RA2211003010004_choice) {
            case 1:
                scan.nextLine();
                System.out.print("Enter updated departure time (HH:MM:SS): ");
                RA2211003010004_newValue = scan.nextLine();
                RA2211003010004_updateFlightSQL = "UPDATE flights SET departure_time = ? WHERE flight_number = ?";
                break;
            case 2:
                scan.nextLine();
                System.out.print("Enter updated origin: ");
                RA2211003010004_newValue = scan.nextLine();
                RA2211003010004_updateFlightSQL = "UPDATE flights SET origin = ? WHERE flight_number = ?";
                break;
            case 3:
                scan.nextLine();
                System.out.print("Enter updated destination: ");
                RA2211003010004_newValue = scan.nextLine();
                RA2211003010004_updateFlightSQL = "UPDATE flights SET destination = ? WHERE flight_number = ?";
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        try (PreparedStatement preparedStatement = conn.prepareStatement(RA2211003010004_updateFlightSQL)) {
            preparedStatement.setString(1, RA2211003010004_newValue);
            preparedStatement.setString(2, RA2211003010004_flightNumber);
            int RA2211003010004_rowsAffected = preparedStatement.executeUpdate();
            if (RA2211003010004_rowsAffected > 0) {
                System.out.println("Data Updated successfully");
            } else {
                System.out.println("No data updated. Flight number not found.");
            }
        }
    }    
    private static void deleteFlight(Connection conn, Scanner scan) throws SQLException {
        scan.nextLine();
        System.out.print("Enter the flight number to delete: ");
        String RA2211003010004_flightNumber = scan.nextLine();
        String RA2211003010004_deleteFlightSQL = "DELETE FROM flights WHERE flight_number = ?";
        try (PreparedStatement preparedStatement = conn.prepareStatement(RA2211003010004_deleteFlightSQL)) {
            preparedStatement.setString(1, RA2211003010004_flightNumber);
    
            int RA2211003010004_rowsAffected = preparedStatement.executeUpdate();
            if (RA2211003010004_rowsAffected > 0) {
                System.out.println("Data deleted Successfully");
            } else {
                System.out.println("No data deleted. Flight number not found.");
            }
        }
    }    
}