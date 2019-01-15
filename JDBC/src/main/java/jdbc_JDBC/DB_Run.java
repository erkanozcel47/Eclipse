package jdbc_JDBC;

 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Run {
	
	
	public static void main(String[] args) throws SQLException {
		
		String url= "jdbc:oracle:thin:@ec2-35-182-231-233.ca-central-1.compute.amazonaws.com:1521:xe";
		String user="HR";
		String password="hr";
		
		Connection conn = DriverManager.getConnection(url,user,password);
		Statement st =conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=st.executeQuery("Select*from job_history") ;
		System.out.println(rs.next());
		System.out.println(rs.getObject(1));
		System.out.println("Connected ");
		
		
	}
	
	
	
	
	
	

}
