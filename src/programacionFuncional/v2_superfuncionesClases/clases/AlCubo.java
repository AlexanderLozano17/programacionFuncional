package programacionFuncional.v2_superfuncionesClases.clases;

import programacionFuncional.v2_superfuncionesClases.interfaces.Funcion;

public class AlCubo implements Funcion {

	@Override
	public Integer aplicar(Integer valor) {
		return (int) Math.pow(valor, 3);
	}

}
