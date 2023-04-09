import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection(
				"jdbc:sqlserver://localhost:1433;user=SA;password=<YourStrong@Passw0rd>;database=msdb;encrypt=true;trustServerCertificate=true");
		System.out.println("Connected");
		con.close();
	}
}

