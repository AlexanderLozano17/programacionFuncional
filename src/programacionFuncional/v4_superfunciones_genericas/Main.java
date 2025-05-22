package programacionFuncional.v4_superfunciones_genericas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import programacionFuncional.v4_superfunciones_genericas.interfaces.Consumidor;
import programacionFuncional.v4_superfunciones_genericas.interfaces.OperadorUnario;
import programacionFuncional.v4_superfunciones_genericas.interfaces.Predicado;
import programacionFuncional.v4_superfunciones_genericas.interfaces.Proveedor;


public class Main {

	public static void main(String[] args) {	 
		
		programacionFuncional();

	}
	
	public static <T> void programacionFuncional() {
		
		// 1. Crear una lista de numeros		
		Proveedor proveedor = new Proveedor<>() {
			Random random = new Random();
			
			@Override
			public Integer obtener() {
				// TODO Auto-generated method stub
				return random.nextInt(10);
			}
		};
		
		List<Integer> lista = SuperFunciones.proveer(10, proveedor);
		
		// 2. Mostrar la lista de numeros
		System.out.println(lista);
		
		// 3. Quedarme con los pares		
		Predicado<Integer> predicado = new Predicado<>() {

			@Override
			public boolean test(Integer numero) {
				// TODO Auto-generated method stub
				return numero % 2 == 0;
			}
		};
				
		
		List<Integer> listaPares = SuperFunciones.filtrar(lista, predicado);
		System.out.println(listaPares);
		
		// 4. Pasar cada número al cuadrado
		List<Integer> listaAlCuadrado = SuperFunciones.transformar(listaPares, new OperadorUnario<>() {
			
			@Override
			public Integer aplicar(Integer valor) {
				// TODO Auto-generated method stub
				return valor * valor;
			}
		});
		
		// 5. Mostrar cada cuadrado en pantalla
		SuperFunciones.consumir(listaAlCuadrado, new Consumidor<>() {

			@Override
			public void actuar(Integer valor) {
				// TODO Auto-generated method stub
				System.out.println(valor);
				
			}
		});
		
		// 6. Obtener la suma de los cuadrado
		Integer total = SuperFunciones.reducir(listaAlCuadrado, 1, new OperadorBinario<>() {
			
			@Override
			public Integer aplicar(Integer valor1, Integer valor2) {
				// TODO Auto-generated method stub
				return valor1 + valor2;
			}
		});
		System.out.println("Reducción: " + total);
	}
}
