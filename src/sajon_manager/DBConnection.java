package sajon_manager;
import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Sazon
 */
public class DBConnection {
    Connection con;
    
    public static Connection ConnectDB()
    {
        try
        {
            //Register
            Class.forName("org.sqlite.JDBC");
            
            //Create connection
            Connection con = DriverManager.getConnection("jdbc:sqlite:D:\\Harvert Shild\\LibraryManagementSystem\\LibraryManager.sqlite");
            return con;
        } 
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
