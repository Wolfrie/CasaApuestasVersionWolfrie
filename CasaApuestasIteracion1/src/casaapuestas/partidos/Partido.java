package casaapuestas.partidos;

import casaapuestas.cuentas.*;
import casaapuestas.usuarios.*;
import casaapuestas.equipos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author iss002
 *
 */


public class Partido {
	
	private String nombre;
	
	private int idPartido;
	private String equipoL;
	private String equipoV;
	private int resultadoL;
	private int resultadoV;
	private ResultadoQuiniela resultadoQuin;
	private Date fInicApuesta;
	private Date fInicPart;
	
	/**
	 * Constructor que inicializa el partido con todos los parámetros
	 * 
	 * @param idPartido El ID del partido
	 * @param equipoL Equipo local
	 * @param equipoV Equipo visitante
	 * @param resultadoL El resultado del equipo local
	 * @param resultadoV El resultado del equipo visitante
	 * @param resultadoQuin El resultado en modo quiniela
	 * @param fInicApuesta La fecha de inicio de la apuesta
	 */
	
	public Partido(int idPartido, String equipoL, String equipoV, int resultadoL, int resultadoV, ResultadoQuiniela resultadoQuin, Date fInicApuesta, Date fInicPart){
		
		this.idPartido = idPartido;
		this.equipoL = equipoL;
		this.equipoV = equipoV;
		this.resultadoL = resultadoL;
		this.resultadoV = resultadoV;
		this.resultadoQuin = resultadoQuin;
		this.fInicApuesta = fInicApuesta;
		this.fInicPart = fInicPart;
		
	}
	
	
	/**
	 * Muestra la info resumida del partido
	 * @return la ficha
	 */
	public String verInfoPartido() {
		String ficha = idPartido + ": " + equipoL + " - " + equipoV;
		return ficha;
	}

	/**
	 * Muestra toda la información del partido
	 * @return la ficha completa
	 */
	public String verInfoCompleta() {
		String ficha = idPartido + ": " + equipoL + " - " + equipoV + " - " + resultadoL + " - " + resultadoV + " - " + resultadoQuin + " - " + fInicApuesta.toString() + " - " + fInicPart.toString();
		return ficha;
	}


	/**
	 * 
	 * @return nombre del equipo
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return
	 */
	public int getIdPartido() {
		return idPartido;
	}


	/**
	 * @param idPartido
	 */
	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}


	/**
	 * @return
	 */
	public String getEquipoL() {
		return equipoL;
	}


	/**
	 * @param equipoL
	 */
	public void setEquipoL(String equipoL) {
		this.equipoL = equipoL;
	}


	/**
	 * @return
	 */
	public String getEquipoV() {
		return equipoV;
	}


	/**
	 * @param equipoV
	 */
	public void setEquipoV(String equipoV) {
		this.equipoV = equipoV;
	}


	/**
	 * @return
	 */
	public int getResultadoL() {
		return resultadoL;
	}


	/**
	 * @param resultadoL
	 */
	public void setResultadoL(int resultadoL) {
		this.resultadoL = resultadoL;
	}


	/**
	 * @return
	 */
	public int getResultadoV() {
		return resultadoV;
	}


	/**
	 * @param resultadoV
	 */
	public void setResultadoV(int resultadoV) {
		this.resultadoV = resultadoV;
	}


	/**
	 * @return
	 */
	public ResultadoQuiniela getResultadoQuin() {
		return resultadoQuin;
	}


	/**
	 * @param resultadoQuin
	 */
	public void setResultadoQuin(ResultadoQuiniela resultadoQuin) {
		this.resultadoQuin = resultadoQuin;
	}


	/**
	 * @return
	 */
	public Date getfInicApuesta() {
		return fInicApuesta;
	}


	/**
	 * @param fInicApuesta
	 */
	public void setfInicApuesta(String fInicApuesta) {
		this.fInicApuesta = fInicApuesta;
	}


	/**
	 * @return
	 */
	public Date getfInicPart() {
		return fInicPart;
	}


	/**
	 * @param fInicPart
	 */
	public void setfInicPart(String fInicPart) {
		this.fInicPart = fInicPart;
	}

}