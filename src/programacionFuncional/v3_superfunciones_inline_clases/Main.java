package programacionFuncional.v3_superfunciones_inline_clases;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import programacionFuncional.v3_superfunciones_inline_clases.interfaces.Consumidor;
import programacionFuncional.v3_superfunciones_inline_clases.interfaces.Funcion;
import programacionFuncional.v3_superfunciones_inline_clases.interfaces.FuncionBinaria;
import programacionFuncional.v3_superfunciones_inline_clases.interfaces.Predicado;
import programacionFuncional.v3_superfunciones_inline_clases.interfaces.Proveedor;

public class Main {

	public static void main(String[] args) {	
		
		// Ejecución de una lamda
		List<String> listaNombres = Arrays.asList("Carlos", "Ana", "Pedro", "María", "Andrés");
		List<String> resultado = SuperFunciones.filtarConFunctionArrow(listaNombres, nombre -> nombre.startsWith("M"));
		System.out.println(resultado);
		
		
		
		programacionFuncional();

	}
	
	public static void programacionFuncional() {
		
		// 1. Crear una lista de numeros		
		Proveedor proveedor = new Proveedor() {
			
			@Override
			public Integer obtener() {
				// TODO Auto-generated method stub
				Random random = new Random();
				return random.nextInt(10);
			}
		};
		
		List<Integer> lista = SuperFunciones.proveer(10, proveedor);
		
		// 2. Mostrar la lista de numeros
		System.out.println(lista);
		
		// 3. Quedarme con los pares		
		Predicado predicado = new Predicado() {
			
			@Override
			public boolean test(int numero) {
				// TODO Auto-generated method stub
				return numero % 2 != 0;
			}
		};
		
		List<Integer> listaPares = SuperFunciones.filtrar(lista, predicado);
		System.out.println(listaPares);
		
		// 4. Pasar cada número al cuadrado
		List<Integer> listaAlCuadrado = SuperFunciones.transformar(listaPares, new Funcion() {
			
			@Override
			public Integer aplicar(Integer valor) {
				// TODO Auto-generated method stub
				return valor * valor;
			}
		});
		
		// 5. Mostrar cada cuadrado en pantalla
		SuperFunciones.consumir(listaAlCuadrado, new Consumidor() {
			
			@Override
			public void actuar(int valor) {
				// TODO Auto-generated method stub
				System.out.println(valor);
				
			}
		});
		
		// 6. Obtener la suma de los cuadrado
		int total = SuperFunciones.reducir(listaAlCuadrado, 1, new FuncionBinaria() {
			
			@Override
			public int aplicar(int valor1, int valor2) {
				// TODO Auto-generated method stub
				return valor1 + valor2;
			}
		});
		System.out.println("Reducción: " + total);
	}
}
