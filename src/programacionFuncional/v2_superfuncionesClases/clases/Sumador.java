package programacionFuncional.v2_superfuncionesClases.clases;

import programacionFuncional.v2_superfuncionesClases.interfaces.FuncionBinaria;

public class Sumador implements FuncionBinaria {

	@Override
	public int aplicar(int valor1, int valor2) {
		return valor1 + valor2;
	}

}
