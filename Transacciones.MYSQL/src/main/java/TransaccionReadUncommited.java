import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransaccionReadUncommited {

	private static Connection con1 = null;
	private static Connection con2 = null;
	private static Statement stm;
	private static ResultSet rs;
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		final String url = "jdbc:mysql://localhost:3306/universidad";
		final String user = "admin";
		final String pass = "admin";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try {
			con1 = DriverManager.getConnection(url, user, pass);
			con2 = DriverManager.getConnection(url, user, pass);
			con1.setAutoCommit(false);
			con2.setAutoCommit(false);
			
			con1.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
			
			stm = con1.createStatement();
			stm.executeUpdate("INSERT INTO Persona (dni, nombre, apellido) VALUES ('4', 'Hola', 'Mundo');");
			
			con2.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
			stm = con2.createStatement();
			rs = stm.executeQuery("SELECT dni, nombre, apellido FROM  Persona");
			
			System.out.println("\nPrimer select");
			while(rs.next()) {
				System.out.println("DNI " + rs.getString(1) + " Nombre " + rs.getString(2) + " Apellido " + rs.getString(3));
			}
			
			stm = con1.createStatement();
			stm.executeUpdate("UPDATE Persona SET nombre = 'Prueba' WHERE dni = '4';");
			
			stm = con2.createStatement();
			rs = stm.executeQuery("SELECT dni, nombre, apellido FROM  Persona");
			
			System.out.println("\nSegundo select");
			while(rs.next()) {
				System.out.println("DNI " + rs.getString(1) + " Nombre " + rs.getString(2) + " Apellido " + rs.getString(3));
			}
			
			con1.rollback();
			
			stm = con2.createStatement();
			rs = stm.executeQuery("SELECT dni, nombre, apellido FROM  Persona");
			
			System.out.println("\nTercero select");
			while(rs.next()) {
				System.out.println("DNI " + rs.getString(1) + " Nombre " + rs.getString(2) + " Apellido " + rs.getString(3));
			}
			
			stm.close();
			con1.close();
			con2.close();
			rs.close();
		} catch (SQLException e) {
			System.out.println("Se ha producido un error.\n"+e.getMessage());
		}
	}

}
