package programacionFuncional.v4_superfunciones_genericas;

import java.util.ArrayList;
import java.util.List;

import programacionFuncional.v4_superfunciones_genericas.interfaces.Consumidor;
import programacionFuncional.v4_superfunciones_genericas.interfaces.Funcion;
import programacionFuncional.v4_superfunciones_genericas.interfaces.FuncionBinaria;
import programacionFuncional.v4_superfunciones_genericas.interfaces.Predicado;
import programacionFuncional.v4_superfunciones_genericas.interfaces.Proveedor;


public class SuperFunciones {

	public static <T> List<T> filtrar(List<T> valores, Predicado<T> predicado) {
		List<T> resultado = new ArrayList<>();
		for (T valor : valores) {
			if (predicado.test(valor)) {
				resultado.add(valor);
			}
		}
		return resultado; 
	}
	
	public static <T> List<T> proveer(int size, Proveedor<T> proveedor) {
		List<T> resultado = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			resultado.add(proveedor.obtener());
		}
		return resultado;
	}
	
	public static <T, R> List<R> transformar(List<T> valores, Funcion<T, R> funcion) {
		List<R> resultado = new ArrayList<>();
		for (T valor : valores) {
			resultado.add(funcion.aplicar(valor));
		}
		return resultado;
	}
	
	public static <T> List<T> actuar(List<T> valores, Consumidor<T> consumidor) {
		for (T valor : valores) {
			consumidor.actuar(valor);
		}
		return valores;
	}
	
	public static <T> void consumir(List<T> valores, Consumidor<T> consumidor) {
		for (T valor : valores) {
			consumidor.actuar(valor);
		}
	}
	
	public static <T> T reducir(List<T> valores, T identidad, OperadorBinario<T> funcionBinaria) {
		T total = identidad;
		for (T valor : valores) {
			total = funcionBinaria.aplicar(total, valor);
		}
		return total;
	}
}
