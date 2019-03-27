import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransaccionReadSerializableYCommit {
	
	private static Connection con1 = null;
	private static Connection con2 = null;
	private static Statement stm1 = null;
	private static Statement stm2 = null;
	private static ResultSet rs;

	public static void main(String[] args)throws ClassNotFoundException {
		
		final String url = "jdbc:mysql://localhost:3306/universidad";
		final String user = "root";
		final String pass = "1234";	
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try {
			con1 = DriverManager.getConnection(url, user, pass);
			con2 = DriverManager.getConnection(url, user, pass);
			con1.setAutoCommit(false);
			con2.setAutoCommit(false);

			
			con1.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
			
			stm1 = con1.createStatement();
			rs = stm1.executeQuery("SELECT dni, nombre, apellido FROM  Persona");
			
			System.out.println("Primer select - Connection 1");
			while(rs.next()) {
				System.out.println("DNI " + rs.getString(1) + " Nombre " + rs.getString(2) + " Apellido " + rs.getString(3));
			}
			
			con2.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
			stm2 = con2.createStatement();
			rs = stm2.executeQuery("SELECT dni, nombre, apellido FROM  Persona");
			
			System.out.println("\nPrimer select - Connection 2");
			while(rs.next()) {
				System.out.println("DNI " + rs.getString(1) + " Nombre " + rs.getString(2) + " Apellido " + rs.getString(3));
			}

			stm2.executeUpdate("UPDATE Persona SET nombre = 'Prueba' WHERE dni = '4';");
			
			rs = stm1.executeQuery("SELECT dni, nombre, apellido FROM  Persona");
			
			System.out.println("\nSegundo select - Connection 1");
			while(rs.next()) {
				System.out.println("DNI " + rs.getString(1) + " Nombre " + rs.getString(2) + " Apellido " + rs.getString(3));
			}
			

			stm2.executeUpdate("INSERT INTO Persona (dni, nombre, apellido) VALUES ('6', 'Ultima', 'Prueba');");
			
			
			rs = stm1.executeQuery("SELECT dni, nombre, apellido FROM  Persona");
			
			System.out.println("\nTercero select - Connection 1");
			while(rs.next()) {
				System.out.println("DNI " + rs.getString(1) + " Nombre " + rs.getString(2) + " Apellido " + rs.getString(3));
			}
			con1.commit();
			
			stm1.close();
			stm2.close();
			con1.close();
			con2.close();
			rs.close();
		} catch (SQLException e) {
			System.out.println("Se ha producido un error."+e.getMessage());
		}
	}
}