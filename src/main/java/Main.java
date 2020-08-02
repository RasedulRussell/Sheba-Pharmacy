
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author RasedulRussell
 *
 */
public class Main {

    public static void main(String[] args) {
        
        OracaleConnectionFactory dbConnection = new OracaleConnectionFactory();
        var connection = OracaleConnectionFactory.getConnectionOracle();
        LogInForm logInForm = new LogInForm();
        logInForm.setConnection(connection);
        logInForm.SetVisible(logInForm);
    }
}
