package programacionFuncional.v2_superfuncionesClases.clases;

import programacionFuncional.v2_superfuncionesClases.interfaces.Predicado;

public class SoloPares implements Predicado {

	@Override
	public boolean test(int numero) {
		return numero % 2 == 0;
	}

}
