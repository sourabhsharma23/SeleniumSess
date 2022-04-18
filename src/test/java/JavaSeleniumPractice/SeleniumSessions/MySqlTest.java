package JavaSeleniumPractice.SeleniumSessions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class MySqlTest {

	@Test
	public void sqlTesingFunction() throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sourabhDb","root","Qait@123");
		
		Statement stmt = con.createStatement();
		
		String query = "SELECT * FROM STUDENT";
		
		ResultSet rset = stmt.executeQuery(query);
		
		while(rset.next()) {
			
			int serialNum = rset.getInt("SNO");
			String name = rset.getString("SNAME");
			int marks = rset.getInt("MARKS");
			
			System.out.println(serialNum+"  "+name+"  "+marks );
		}
		
		
		con.close();
			
	}
}
