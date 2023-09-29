package zoho.others;
import java.sql.*;
public class Databaseconnection {
static final String JDBC_driver="org.postgresql.Driver";
static final String DB_URL="jdbc:postgresql://localhost:8028/desktopcentral";
static final String Username="medc";
static final String Password="admin";
public static void main(String[] args) throws SQLException {
try {
	Class.forName(JDBC_driver); 
}catch (ClassNotFoundException e) {
	System.out.println("Error: Unable to load driver");
}
Connection conn = null;
Statement stmt = null;
System.out.println("Connecting to DB");
try {
conn = DriverManager.getConnection(DB_URL, Username, Password);
//creating stmt
stmt = conn.createStatement();
String sqlquery = "Select * from role";
ResultSet rs = stmt.executeQuery(sqlquery);
System.out.println("ID		role");
while(rs.next()) {
System.out.println(rs.getInt("role_id")+"     		"+rs.getString("role_name"));
}
}catch(SQLException e) {
	e.printStackTrace();
}
String updatequery = "Update role set role_id = 3 where role_name='admin'";
stmt.executeUpdate(updatequery);
//closing all opened connection
conn.close();
stmt.close();
}
}