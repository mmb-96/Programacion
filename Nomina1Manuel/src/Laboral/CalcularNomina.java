/**
 * Clase principal del programa.
 */
/**
 * @author Manuel Melero
 */
package Laboral;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CalcularNomina {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		File archivo = new File("empleados.txt");
		Empleado emp1 = null;
		Empleado emp2 = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			String datosFichero = br.readLine();
			String empleado[] = datosFichero.split(",");
			char edad = empleado[2].charAt(0);
			int categoria = Integer.parseInt(empleado[3]);
			int anyos = Integer.parseInt(empleado[4]);	
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");;
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@172.16.8.133:1521:xe", "Manuel", "Manuel");
				String sql = "INSERT INTO Empleados values(?, ?, ?, ?, ?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, empleado[0]);
				pstmt.setString(2, empleado[1]);
				pstmt.setString(3, empleado[2]);
				pstmt.setInt(4, categoria);
				pstmt.setInt(5, anyos);
				pstmt.execute();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}  catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			try {
				emp1 = new Empleado(empleado[0], empleado[1], edad, categoria, anyos);
			} catch (DatosNoCorrectoException e) {
				e.printStackTrace();
			}
			String datosFichero2 = br.readLine();
			String empleado2[] = datosFichero2.split(",");
			char edad2 = empleado2[2].charAt(0);
			int categoria2 = 1;
			int anyos2 = 0;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");;
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@172.16.8.133:1521:xe", "Manuel", "Manuel");
				String sql = "INSERT INTO Empleados values(?, ?, ?, ?, ?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, empleado2[0]);
				pstmt.setString(2, empleado2[1]);
				pstmt.setString(3, empleado2[2]);
				pstmt.setInt(4, categoria2);
				pstmt.setInt(5, anyos2);
				pstmt.execute();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}  catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			try {
				emp2 = new Empleado(empleado2[0], empleado2[1], edad2, categoria2, anyos2);
			} catch (DatosNoCorrectoException e) {
				e.printStackTrace();
			}
			br.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(escribe(emp1, emp2));
		
		emp2.incAnyo();
		try {
			emp1.setCategoria(9);
		} catch (DatosNoCorrectoException e) {
			e.printStackTrace();
		}
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
			bw.write(escribeSinNomina(emp1, emp2));
			bw.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");;
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@172.16.8.133:1521:xe", "Manuel", "Manuel");
			String sql = "Update Empleados set categoria = ? where dni = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(2, emp1.nombre);
			pstmt.setInt(1, emp1.getCategoria());
			pstmt.execute();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}  catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(escribe(emp1, emp2));
		File sueldo = new File("salario.txt");
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(sueldo));
			bw.write(escribeDNISueldo(emp1, emp2));
			bw.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try {
			emp1.setCategoria(20);
		} catch (DatosNoCorrectoException e) {
			e.printStackTrace();
		}

	}
	
	private static String escribe(Empleado e1, Empleado e2) {
		String nominaEmple;
		String empleados = null;
		empleados = e1.imprime();
		nominaEmple = String.valueOf(Nomina.sueldo(e1));
		empleados += " " + nominaEmple+"\n";
		empleados += e2.imprime();
		nominaEmple = String.valueOf(Nomina.sueldo(e2));
		empleados += " " + nominaEmple+"\n";
		return empleados;
		
	}
	
	private static String escribeSinNomina(Empleado e1, Empleado e2) {
		String nominaEmple;
		String empleados = null;
		empleados = e1.imprime()+"\n";
		empleados += e2.imprime()+"\n";
		return empleados;
		
	}
	
	private static String escribeDNISueldo(Empleado e1, Empleado e2) {
		String nominaEmple;
		String empleados = null;
		empleados = e1.dni;
		nominaEmple = String.valueOf(Nomina.sueldo(e1));
		empleados += " " + nominaEmple+"\n";
		empleados += e2.dni;
		nominaEmple = String.valueOf(Nomina.sueldo(e2));
		empleados += " " + nominaEmple+"\n";
		return empleados;
	}

}
