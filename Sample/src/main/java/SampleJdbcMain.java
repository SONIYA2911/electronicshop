import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SampleJdbcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

	} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	//	public int sum(int a1,int b1) {
			
			
		}

}}
