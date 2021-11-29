import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

    public static void main(String[] args) {

        //auto close connection
        try (Connection conn = DriverManager.getConnection (
            "jdbc:mysql://localhost:5501/test/db", "light", "12345678")) {
                if (conn != null){
                    System.out.println("connected to the database");
                }else {
                    System.out.println("CONNECTION FAILED");
                }
            
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}