import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Implementada desde la interfaz FichAndDB.
 * Esta clase trabaja con la base de datos.
 * @author Manuel Melero
 *
 */

public class BD implements FichAndDB {
	
	@Override
	public boolean guardar(String cadena) {
		boolean error = false;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    Connection connection;
	    try {
	        String url = "jdbc:oracle:thin:@192.168.1.46:1521:xe";
	        connection = DriverManager.getConnection(url, "cafeteria", "cafeteria");

	        String query = "insert into clientes values(?, ?, ?, ?)";
	        try(PreparedStatement st = connection.prepareStatement(query)){
	        	String cosas [] = cadena.split(",");
	            st.setInt(1, Integer.parseInt(cosas[0]));
	            st.setString(2, cosas[1]);
	            st.setString(3, cosas[2]);
	            st.setInt(4, Integer.parseInt(cosas[3]));
	            st.executeQuery();
	        }
	        connection.close();
	    } catch(SQLException e) {
	    	error = true;
	        connection = null;
	    }
		return error;
	}

	@Override
	public ListaCliente leer() {
		ListaCliente lc = new ListaCliente();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Connection connection;
        try {
            String url = "jdbc:oracle:thin:@192.168.1.46:1521:xe";
            connection = DriverManager.getConnection(url, "cafeteria", "cafeteria");

            String query = "select nombre, apellidos, telefono from clientes";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()) {
                String nombre = rs.getString(1);
                String apellidos = rs.getString(2);
                int telefono = rs.getInt(3);
                
                lc.anadir(new Cliente(nombre, apellidos, telefono));
            }
            connection.close();
        } catch(SQLException e) {
            connection = null;
        }
		return lc;
	}

	@Override
	public void elinimar() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    Connection connection;
	    try {
	        String url = "jdbc:oracle:thin:@192.168.1.46:1521:xe";
	        connection = DriverManager.getConnection(url, "cafeteria", "cafeteria");

	        String query = "delete from clientes";
	        try(PreparedStatement st = connection.prepareStatement(query)){
	            st.executeQuery();
	        }
	        connection.close();
	    } catch(SQLException e) {
	        connection = null;

	    }
		
	}
}