package casaapuestas.partidos;

import casaapuestas.cuentas.*;
import casaapuestas.usuarios.*;
import casaapuestas.equipos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class ControladorPartidos {
	
	private Map<Integer, Partido> listaPartidos;
	
	/**
	 * Constructor que inicializa las colecciones
	 */
	public ControladorPartidos(){

		listaPartidos = new HashMap<Integer, Partido>();
	
	}
	
	/**
	 * Crea un nuevo listado con los partidos
	 * 
	 * @return el listado
	 */
	public List<String> listarPartidos() {
		
		List<String> listado = new ArrayList<String>();
		
		for (Partido p : listaPartidos.values()) {
			String ficha = p.verInfoPartido();
			listado.add(ficha);
		}

		return listado;
	}
	
	/**
	 * Muestra la información del partido para el ID indicado
	 * 
	 * @param idPartido
	 * @return la información completa del partido
	 */
	public String mostrarPartido(int idPartido) {
		Partido estePartido = listaPartidos.get(idPartido);
		return estePartido.verInfoCompleta();
	}
	
	
	/**
	 * Modifica los parámetros del partido introducidos
	 * 
	 * @param idPartido El ID del partido
	 * @param equipoL Equipo local
	 * @param equipoV Equipo visitante
	 * @param resultadoL El resultado del equipo local
	 * @param resultadoV El resultado del equipo visitante
	 * @param resultadoQuin El resultado en modo quiniela
	 * @param fInicApuesta La fecha y hora de inicio de la apuesta
	 * @param fInicPart La fecha y hora de inicio del partido
	 */
	
//	public void modificarPartido(int idPartido, String equipoL, String equipoV, int resultadoL, int resultadoV, ResultadoQuiniela resultadoQuin, String fInicApuesta, String hInicApuesta, String fInicPart, String hInicPart, MetodoMensajeria metodo)
	public void modificarPartido(int idPartido, String equipoL, String equipoV, int resultadoL, int resultadoV, ResultadoQuiniela resultadoQuin, Calendar fInicApuesta, Calendar fInicPart){
		
		Partido estePartido = listaPartidos.get(idPartido);
		if (estePartido != null) {
			estePartido.setEquipoL(equipoL);
			estePartido.setEquipoV(equipoV);
			estePartido.setResultadoL(resultadoL);
			estePartido.setResultadoV(resultadoV);
			estePartido.setResultadoQuin(resultadoQuin);
			estePartido.setfInicApuesta(fInicApuesta);
			estePartido.setfInicPart(fInicPart);
			//estePartido.setMetodo(metodo);
		}
	}
	
	
	/**
	 * Añade un partido a la lista
	 * @param idPartido El ID del partido
	 * @param equipoL Equipo local
	 * @param equipoV Equipo visitante
	 * @param resultadoL El resultado del equipo local
	 * @param resultadoV El resultado del equipo visitante
	 * @param resultadoQuin El resultado en modo quiniela
	 * @param fInicApuesta La fecha de inicio de la apuesta
	 * @param fInicPart La fecha de inicio del partido
	 * @throws ExcepcionPartidos Envía una excepción si en la creación de partidos algo sale mal
	 */
	public void añadirPartido(int idPartido, String equipoL, String equipoV, int resultadoL, int resultadoV, ResultadoQuiniela resultadoQuin, String fInicApuesta, String hInicApuesta, String fInicPart, String hInicPart)
			throws ExcepcionPartidos {
		
		// Comprueba si ya existe un partido con ese ID
		if (!listaPartidos.containsKey(idPartido)) {
			// Si no existe, crea la instancia y además los resultados iniciales son 0 por defecto
			Partido p = new Partido(idPartido, equipoL, equipoV, 0, 0, resultadoQuin, fInicApuesta, fInicPart);
			// Y la colecciona
			listaPartidos.put(idPartido, p);
		} else {
			// Pero si ya existía lanza una excepción
			throw new ExcepcionPartidos(CausaExcepcionPartidos.YA_EXISTE_P, idPartido);
		}
	}
	
	/**
	 * Elimina un partido del listado según el ID
	 * 
	 * @param idPartido El ID del partido que vamos a eliminar
	 * @throws ExcepcionPartidos lanza una excepción si ha habido un error al eliminar el partido
	 */
	public void eliminarPartido(int idPartido) throws ExcepcionPartidos{
		
		Partido p = listaPartidos.get(idPartido);
		
		//Si existe el partido con ese ID, lo elimina de la lista
		 if (listaPartidos.containsKey(idPartido)){ 
			 listaPartidos.remove(idPartido,p);
	     }
		 else{
			 throw new ExcepcionPartidos(CausaExcepcionPartidos.ERROR_ELIMINAR, idPartido);
		 }
		 
	}
	
	/**
	 * Muestra partidos abiertos a apuestas
	 * @return lista de los partidos abiertos a apuestas
	 */
	public void verPartidosAbiertosAApuesta() throws ExcepcionPartidos{
		String cadenaPartidos;
		String temp;
		Calendar fecha = Calendar.getInstance();
		
		for(Partido p : listaPartidos.values()){
			if(fecha.before(p.getfInicPart()) && fecha.after(p.getfInicApuesta())){
				temp = Integer.toString(p.getIdPartido());
				cadenaPartidos.concat(temp+": "+p.getEquipoL()+" - "+p.getEquipoV()+"\n");
			}
		}
		if(cadenaPartidos == null){
			throw new ExcepcionPartidos(CausaExcepcionPartidos.NO_PART_ABIERTOS_APUESTAS,0);
		}
		System.out.println(cadenaPartidos);
	}

}