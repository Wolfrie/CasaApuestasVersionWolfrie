package casaapuestas.apuestas;

import casaapuestas.partidos.ResultadoQuiniela;



/**
 * @author iss002
 *
 */
public class Apuesta {
	
	private float cantidadApostada;
	private String login;
	private int idPartido;
	private tipoApuesta tipoApuesta;
	private ResultadoQuiniela rQuiniela;
	private String equipoLocal;
	private String equipoVisitante;
	
	
	/**
	 * @param cantidadApostada
	 * @param login usuario que realiza la apuesta
	 * @param tApuesta tipo de apuesta
	 * @param rQuiniela resultado del modo quiniela (en caso de ser modo quiniela)
	 * @param idPartido id del partido del que se realiza la apuesta
	 * @param equipoLocal 
	 * @param equipoVisitante
	 */
	public Apuesta(float cantidadApostada,String login,String tApuesta, String rQuiniela,int idPartido, String equipoLocal, String equipoVisitante){
		
		this.cantidadApostada= cantidadApostada;
		this.idPartido = idPartido;
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.tipoApuesta = tApuesta;
		this.rQuiniela = rQuiniela;
	}
	

}