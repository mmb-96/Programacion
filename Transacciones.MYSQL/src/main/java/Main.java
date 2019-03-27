import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	private static Connection con;
	private static Statement stm;
	private static PreparedStatement pstm;

	public static void main(String[] args) throws ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/transacciones";
		String user = "root";
		String pass = "1234";
		String sql = null;		
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try {
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("Conectado.");
			con.setAutoCommit(false);
			stm = con.createStatement();
			sql = "INSERT INTO alumno VALUES (1, 'Manuel', 'Melero');";
			stm.executeUpdate(sql);
			sql = "INSERT INTO alumno VALUES (?, ?, ?);";
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, 2);
			pstm.setString(2, "Pepe");
			pstm.setString(3, "Peréz");
			pstm.executeUpdate();
			sql = "INSERT INTO alumno VALUES (?, ?, ?);";
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, 3);
			pstm.setString(2, "Rafale");
			pstm.setString(3, "Melero");
			pstm.executeUpdate();
			sql = "UPDATE alumno SET nombre = 'Pueba' WHERE id = 3;";
			stm.executeUpdate(sql);
			sql = "UPDATE alumno SET apellido = ? WHERE id = ?;";
			pstm = con.prepareStatement(sql);
			pstm.setString(1, "Mulero");
			pstm.setInt(2, 1);
			pstm.executeUpdate();
			

			
			con.commit();
			pstm.close();
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Se ha producido un error.");
			if (con != null) {
				try {
					con.rollback();
					pstm.close();
					stm.close();
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}

	}

}
