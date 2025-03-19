package programacionFuncional.v4_superfunciones_genericas.interfaces;

/**
 * Supplier<T> → No recibe parámetros, devuelve un valor de tipo T.
 */
public interface Proveedor<T> {

	T obtener();
}
