
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author RasedulRussell
 * 
 */

public class OracaleConnectionFactory {
    
    public static Connection getConnectionOracle() {
        Connection connection = null;
        try {
            if (connection == null) {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                String connectionUrl = "jdbc:oracle:thin:@//localhost:1521/XE";
                String userName = "NEWSPAPER";
                String pass = "12345678";
                connection = DriverManager.getConnection(connectionUrl, userName, pass);
            }
            System.out.println("connected");
            return connection;
        } catch (ClassNotFoundException | SQLException ex) {
            ///System.out.println("dc");
        }
        return null;
    }
}
