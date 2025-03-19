package programacionFuncional.v4_superfunciones_genericas.interfaces;

/**
 * Function<T, R> → Recibe un parámetro de tipo T y devuelve un valor de tipo R.
 */
public interface Funcion<T, R> {

	R aplicar(T valor);
}
