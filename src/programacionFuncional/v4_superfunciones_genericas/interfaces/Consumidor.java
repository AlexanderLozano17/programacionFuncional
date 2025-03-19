package programacionFuncional.v4_superfunciones_genericas.interfaces;

/**
 * Consumer<T> → Recibe un parámetro de tipo T, pero no devuelve nada.
 */
public interface Consumidor<T> {

	void actuar(T valor);
}
