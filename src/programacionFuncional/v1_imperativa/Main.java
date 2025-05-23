package programacionFuncional.v1_imperativa;

import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// 1. Crear una lista de numeros
		List<Integer> lista = crearLista();
		// 2. Mostrar la lista de numeros
		System.out.println(lista);
		// 3. Quedarme con los pares
		System.out.println(filtrarPares(lista));
		// 4. Pasar cada número al cuadrado
		List<Integer> listaAlCuadrado = listaAlCuadrado(lista);		
		// 5. Mostrar cada cuadrado en pantalla
		System.out.println(listaAlCuadrado);
		// 6. Obtener la suma de los cuadrado
		System.out.println(sumaCuadrados(listaAlCuadrado));

	}
		
	public static List<Integer> crearLista() {
		return List.of(0, 1, 2, 3, 5, 8, 13, 23, 35, 55, 89, 144); 
	}

	public static List<Integer> filtrarPares(List<Integer> lista) {
		List<Integer> listaPares = new ArrayList<>();
		for (Integer numero : lista) {
			if (numero % 2 == 0) {
				listaPares.add(numero);
			}
		}
				
//		List<Integer> listaPares =  lista.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());	
		return listaPares;
	}
	
	public static List<Integer> listaAlCuadrado(List<Integer> lista) {
		List<Integer> listaAlCuadrado = new ArrayList<>();
		for (Integer numero : lista) {
			listaAlCuadrado.add(numero * numero);
		}
		
//		List<Integer> listaAlCuadrado = lista.stream().map(n -> n * n).collect(Collectors.toList());
		return listaAlCuadrado;
	}
	
	public static int sumaCuadrados(List<Integer> lista) {
		int suma = 0;
		for (Integer numero : lista) {
			suma += numero;
		}
		
//		suma = lista.stream().reduce(0, Integer::sum);
		return suma;
	}
	
}
