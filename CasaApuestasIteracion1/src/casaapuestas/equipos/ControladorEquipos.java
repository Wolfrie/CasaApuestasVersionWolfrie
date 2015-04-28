package casaapuestas.equipos;

import casaapuestas.cuentas.*;
import casaapuestas.usuarios.*;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.text.DateFormat;
import java.util.Locale;


//Falta modificar (commit de ejemplo)

public class ControladorEquipos {
	
	private Map<String, Equipo> listaEquipos;
	
	public ControladorEquipos(){
		
		listaEquipos = new HashMap<String, Equipo>();
		
	}
	
	public List<String> listaEquipos() {
		
		List<String> listado = new ArrayList<String>();
		
		for (Equipo e : listaEquipos.values()) {
			String ficha = e.verInfoEquipo();
			listado.add(ficha);
		}

		return listado;
	}
	
	/**
	 * @param nombre nombre el equipo
	 * @return devuelve la información completa de dicho equipo
	 */
	public String mostrarEquipo(String nombre) {
		Equipo esteEquipo = listaEquipos.get(nombre);
		return esteEquipo.verInfoCompleta();
	}
}