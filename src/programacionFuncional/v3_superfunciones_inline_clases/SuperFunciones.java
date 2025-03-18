package programacionFuncional.v3_superfunciones_inline_clases;

import java.util.ArrayList;
import java.util.List;

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
	
	public static List<Integer> actuar(List<Integer> valores, Consumidor consumidor) {
		for (int valor : valores) {
			consumidor.actuar(valor);
		}
		return valores;
	}
	
	public static void consumir(List<Integer> valores, Consumidor consumidor) {
		for (int valor : valores) {
			consumidor.actuar(valor);
		}
	}
	
	public static void consumir(int valor, Consumidor consumidor) {
		consumidor.actuar(valor);
	}
	
	public static int reducir(List<Integer> valores, int identidad, FuncionBinaria funcionBinaria) {
		int total = identidad;
		for (int valor : valores) {
			total = funcionBinaria.aplicar(total, valor);
		}
		return total;
	}
}
