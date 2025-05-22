package programacionFuncional.v2_superfuncionesClases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import programacionFuncional.v2_superfuncionesClases.clases.AlCubo;
import programacionFuncional.v2_superfuncionesClases.clases.Aleatorio;
import programacionFuncional.v2_superfuncionesClases.clases.Impresor;
import programacionFuncional.v2_superfuncionesClases.clases.Multiplicador;
import programacionFuncional.v2_superfuncionesClases.clases.SoloImpares;

public class Main {

	public static void main(String[] args) {	
		/**
		🧩 Resumen visual
		Nombre	   ¿Recibe algo?	¿Devuelve algo?		¿Para qué sirve?
		Predicado	Sí	            Sí (true/false)		Para decidir algo
		Función		Sí				Sí (otro valor)		Para transformar cosas
		Consumidor	Sí				No					Para usar algo (como imprimir)
		Proveedor	No				Sí					Para dar algo sin pedir nada
		*/

		// Un predicado es una función que responde "sí" o "no" (true o false).
		Predicate<Integer> esMayorQueDiez = numero -> numero > 10;		
		System.out.println(esMayorQueDiez.test(5));
		
		// Una función toma algo y te devuelve otra cosa.
		Function<Integer, Integer> multiplicarPorDos = numero -> numero * 2;
		System.out.println(multiplicarPorDos.apply(5));
		
		// Un consumidor es una función que usa algo, pero no devuelve nada
		Consumer<Integer> imprimirNumero = numero -> System.out.println(numero);
		imprimirNumero.accept(24);
		
		//Un proveedor es una función que no necesita nada, pero te da algo.
		Supplier<Integer> dameCinco = () -> 25;
		System.out.println(dameCinco.get());
		
		
		
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
