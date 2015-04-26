package casaapuestas.apuestas;


import casaapuestas.apuestas.CausaExcepcionApuestas;
import casaapuestas.apuestas.Apuesta;
import casaapuestas.partidos.CausaExcepcionPartidos;
import casaapuestas.partidos.ExcepcionPartidos;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


/**
 * @author iss002
 *
 */
public class ControladorApuestas {
	
	/**
	 * @param tipoApuesta RESULTADO o QUINIELA
	 * @param cantidadApostada
	 * @param login
	 * @param idPartido id del partido elegido tras ejecutar el comando verPartidosAbiertosAApuestas
	 */
	public void darDatosApuesta(int tipoApuesta, float cantidadApostada, String login,int idPartido){
		Scanner user_input = new Scanner( System.in );
		String opcion;
		String rQuiniela;
		Integer RLocal;
		Integer RVisitante;
		System.out.println("Elige el tipo de apuesta:\n  1 Para apuesta tipo quiniela\n  2 Para apuesta tipo resultado\n");
		opcion = user_input.next();
		//trows ExcepcionApuestas{
		if(opcion.contentEquals("1")){
			System.out.println("Introduce 1,x o 2:\n");
			rQuiniela = user_input.next();
			if(!rQuiniela.contentEquals("1")&&!rQuiniela.contentEquals("x")&&!rQuiniela.contentEquals("2")){
				//throw new ExcepcionApuestas(CausaExcepcionApuestas.INTRODUCE_ALGO_VALIDO,0);
			}
		}
		else if(opcion.contentEquals("2")){
			System.out.println("Introduce el resultado del equipo local:\n");
			RLocal = Integer.parseInt(user_input.next());
			System.out.println("\nIntroduce el resultado del equipo visitante:\n");
			RVisitante = Integer.parseInt(user_input.next());
		}
		else{
			
		}
		//}
		
		return;
	}
	
	
}