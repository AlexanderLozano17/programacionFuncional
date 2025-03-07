package programacionFuncional.v2_superfuncionesClases;

import java.util.ArrayList;
import java.util.List;

import programacionFuncional.v2_superfuncionesClases.interfaces.Funcion;
import programacionFuncional.v2_superfuncionesClases.interfaces.Predicado;
import programacionFuncional.v2_superfuncionesClases.interfaces.Proveedor;

public class SuperFunciones {

	public static List<Integer> filtrar(List<Integer> valores, Predicado predicado) {
		List<Integer> resultado = new ArrayList<>();
		for (Integer valor : valores) {
			if (predicado.test(valor)) {
				resultado.add(valor);
			}
		}
		return resultado;
	}
	
	public static List<Integer> proveer(int size, Proveedor proveedor) {
		List<Integer> resultado = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			resultado.add(proveedor.obtener());
		}
		return resultado;
	}
	
	public static List<Integer> transformar(List<Integer> valores, Funcion funcion) {
		List<Integer> resultado = new ArrayList<>();
		for (int valor : valores) {
			resultado.add(funcion.aplicar(valor));
		}
		return resultado;
	}
}
