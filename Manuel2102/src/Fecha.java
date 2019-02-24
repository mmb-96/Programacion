/**
 * Ejercicio Torneo Ajedrez.
 * @author Manuel Melero
 *
 */
public class Fecha {
	private int dia;
	private String mes;
	private int ano;
	/**
	 * 
	 */
	/**
	 * @param dia Dia
	 * @param mes Mes
	 * @param ano Año
	 */
	public Fecha(int dia, String mes, int ano) {
		this.ano = ano;
		validar(mes, dia);
	}
	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}
	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}
	/**
	 * @return the mes
	 */
	public String getMes() {
		return mes;
	}
	/**
	 * @param mes the mes to set
	 */
	public void setMes(String mes) {
		this.mes = mes;
	}
	/**
	 * @return the ano
	 */
	public int getAno() {
		return ano;
	}
	/**
	 * @param ano the ano to set
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void validar(String mes, int dia) {
		if(mes.equalsIgnoreCase("enero") || mes.equalsIgnoreCase("marzo") || mes.equalsIgnoreCase("mayo") || mes.equalsIgnoreCase("julio") || mes.equalsIgnoreCase("agosto") || mes.equalsIgnoreCase("octubre") || mes.equalsIgnoreCase("diciembre")) {
			if (dia > 0 && dia <= 31) {
	           this.dia = dia;
	        }
	        this.mes = mes;   
        } else if (mes.equalsIgnoreCase("abril") || mes.equalsIgnoreCase("junio") || mes.equalsIgnoreCase("septiembre") || mes.equalsIgnoreCase("noviembre")){
           if (dia > 0 && dia <= 30) {
	          this.dia = dia;
	       }
	       this.mes = mes;
        } else if (mes.equalsIgnoreCase("febrero")) {
        	if (dia > 0 && dia <= 28) {
 	           this.dia = dia;
 	        }
 	        this.mes = mes; 
        }
	}
}