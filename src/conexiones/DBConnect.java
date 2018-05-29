import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.informix.*;
public class DBConnect {
    static String url="jdbc:informix-sqli://host_name:port/database_name:INFORMIXSERVER=server;user=username;password=password";

    public static void main(String [] args){
        try {
            Class.forName("com.informix.jdbc.IfxDriver");
        }catch (Exception e){
            System.out.println("ERROR: failed to load Informix JDBC driver.");
            e.printStackTrace();
            return;
        }
        try{

            DriverManager.registerDriver((com.informix.jdbc.IfxDriver)Class.forName("com.informix.jdbc.IfxDriver").newInstance());

        }catch(Exception ex){
            System.out.println("Driver is not Registered");
        }
        try{

            Connection conn = DriverManager.getConnection(url);
            System.out.println("Connection Successful");
        }catch (SQLException e){
            System.out.println("ERROR: failed to connect!");
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
            return;
        }
        }
}