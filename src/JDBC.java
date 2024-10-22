import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {

    public Connection conn;
    private String url = "jdbc:mysql://localhost:3306/ATM";
    private String user = "root";
    private String password = "user";

    public JDBC() throws SQLException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conn = DriverManager.getConnection(url, user, password);
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }

    public Connection getConnection(){
        return this.conn;
    }
}
