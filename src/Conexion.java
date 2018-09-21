import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	private String USERNAME = "root";
	private String PASSWORD = "caracoles";
	private String HOST = "locahost";
	private String PORT = "3306";
	private String DATABASE = "login";
	private String CLASSNAME = "com.mysql.jdbc.Driver";
	private String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
	private Connection con;
	
	public Conexion(){
		try{
			Class.forName(CLASSNAME);
			con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		
			}catch(ClassNotFoundException e){
				System.out.println("Error"+e);
			}catch(SQLException e){
				System.out.println("Error"+e);
			}
		
	
		
	}
	public Connection getConexion(){
		return con;
		
}
	public static void main(String[] args) {
		Conexion con =new Conexion();
}
}