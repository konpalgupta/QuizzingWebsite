import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersDAO {
	
	private String dbURL;
	private String dbUsername;
	private String dbPassword;	
	Connection con=null;
	public UsersDAO(String dbURL, String dbUsername, String dbPassword) {
		this.dbURL = dbURL;
		this.dbUsername = dbUsername;
		this.dbPassword = dbPassword;
	}
	void connect() throws SQLException{
	        if(con == null|| con.isClosed()) 
	        {
	            try
	            {
	                Class.forName("com.mysql.jdbc.Driver");
	            } 
	            catch(ClassNotFoundException e) 
	            {
	                throw new SQLException(e);
	            }	            
	            con = DriverManager.getConnection(dbURL, dbUsername,dbPassword);
	        }
	 }
	
	boolean registerUser(Users u) throws SQLException {
		String sql = "insert into users values (?,?,?)";
		connect();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, u.getName());
		ps.setString(2, u.getEmail());
		ps.setString(3, u.getPass());
		boolean rowInserted = ps.executeUpdate() > 0;
		ps.close();
		con.close();
		return rowInserted;		
	}
	
	boolean getUser(String email, String pass) throws SQLException {
		String sql = "select * from users where email = ? and pass = ?";
		connect();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, email);
		ps.setString(2, pass);
		ResultSet rs = ps.executeQuery();
		//System.out.println(rs.next());
		if(rs.next()) {
			return true;
		}
		rs.close();
		ps.close();
		con.close();
		return false;		
	}

}
