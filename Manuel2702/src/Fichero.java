import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Implementada desde la interfaz FichAndDB.
 * Esta clase trabaja con ficheros.
 * @author Manuel Melero
 *
 */

public class Fichero implements FichAndDB {
	File archivo = new File("Manuel2702.txt");
	
	@Override
	public void elinimar() {
		archivo.delete();
	}
	
	@Override
	public boolean guardar(String cadena) {
		boolean error = false;
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter(archivo,true));
	        bw.write(cadena);
	        bw.newLine();
	        bw.close(); 
		} catch (IOException e) {
			error = true;
		}
		return error;
			     
	}

	@Override
	public ListaCliente leer() {
		BufferedReader br;
		String linea = null;
		ListaCliente lc = new ListaCliente();
		try {
			br = new BufferedReader(new FileReader(archivo));
			while ((linea = br.readLine()) != null) {
	            String cosas [] = linea.split(",");
	            String nombreaux = cosas[0];
	            String apellidoaux = cosas[1];
	            int telfaux = Integer.parseInt(cosas[2]);
	            lc.anadir(new Cliente(nombreaux, apellidoaux, telfaux));
	         }
			br.close();
		} catch (IOException e) {
			e.getMessage();
		}
		return lc;
	}
}