import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTestProg {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select * from test");
		
		while(rs.next())
		{
			System.out.println(rs.getString(1) + "  " + rs.getString(2)+ "  " + rs.getString(3));
		}
		
		st.close();
		rs.close();
		con.close();

	}

}
