package programacionFuncional.v4_superfunciones_genericas.interfaces;

/**
 * Predicate<T> → Recibe un parámetro de tipo T y devuelve true o false (función booleana).
 */
public interface Predicado <T> {

	boolean test(T numero);
	
	
}
