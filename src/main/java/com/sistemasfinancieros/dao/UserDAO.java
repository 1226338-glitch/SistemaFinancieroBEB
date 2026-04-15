import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    private String jdbcURL = "jdbc:mysql://localhost:3306/yourdatabase"; // Change to your database URL
    private String jdbcUsername = "yourusername"; // Change to your username
    private String jdbcPassword = "yourpassword"; // Change to your password

    public UserDAO() {
    }

    public boolean authenticateUser(String username, String password) {
        boolean status = false;
        String query = "SELECT * FROM users WHERE username = ? AND password = ?";

        try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            status = resultSet.next(); // If there is a record, authentication is successful
        } catch (SQLException e) {
            printSQLException(e);
        }
        return status;
    }

    public void createUser(String username, String password) {
        String query = "INSERT INTO users (username, password) VALUES (?, ?)";

        try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    private void printSQLException(SQLException ex) {
        for (Throwable t : ex) {
            if (t instanceof SQLException) {
                t.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) t).getSQLState());
                System.err.println("Error Code: " + ((SQLException) t).getErrorCode());
                System.err.println("Message: " + t.getMessage());
            }
        }
    }
}