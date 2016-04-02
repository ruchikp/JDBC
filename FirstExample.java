import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstExample {

	
	public static void main(String args[]) throws ClassNotFoundException,Throwable{
		
		
		Class.forName("com.mysql.jdb.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","Password");
		Statement stm=conn.createStatement();
		ResultSet rs=stm.executeQuery("SELECT * FROM employee");
		
		
		while(rs.next()){
			
			int empid=rs.getInt("empid");
			System.out.println("employee id"+empid);
		}
		
	}
	{
		
	}
	
}