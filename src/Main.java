import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.locks.StampedLock;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends JDBC{

    Connection connection;
    public Main() throws SQLException {
        super();
        this.connection = super.getConnection();
    }

    public static void main(String[] args) {

        Statement

    }
}