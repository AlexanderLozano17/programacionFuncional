package programacionFuncional.v2_superfuncionesClases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import programacionFuncional.v2_superfuncionesClases.clases.AlCubo;
import programacionFuncional.v2_superfuncionesClases.clases.Aleatorio;
import programacionFuncional.v2_superfuncionesClases.clases.Impresor;
import programacionFuncional.v2_superfuncionesClases.clases.Multiplicador;
import programacionFuncional.v2_superfuncionesClases.clases.SoloImpares;

public class Main {

	public static void main(String[] args) {			

		programacionFuncional();

	}
	
	public static void programacionFuncional() {
		// 1. Crear una lista de numeros
		List<Integer> lista = SuperFunciones.proveer(10, new Aleatorio());
		// 2. Mostrar la lista de numeros
		System.out.println(lista);
		// 3. Quedarme con los pares
		List<Integer> listaPares = SuperFunciones.filtrar(lista, new SoloImpares());
		System.out.println(listaPares);
		// 4. Pasar cada número al cuadrado
		List<Integer> listaAlCuadrado = SuperFunciones.transformar(listaPares, new AlCubo());		
		// 5. Mostrar cada cuadrado en pantalla
		//SuperFunciones.actuar(listaAlCuadrado, new Impresor());
		SuperFunciones.consumir(listaAlCuadrado, new Impresor());
		// 6. Obtener la suma de los cuadrado
		//int total = SuperFunciones.reducir(listaAlCuadrado, 0, new Sumador());
		int total = SuperFunciones.reducir(listaAlCuadrado, 1, new Multiplicador());
		System.out.println("Reducción: " + total);
	}
}
