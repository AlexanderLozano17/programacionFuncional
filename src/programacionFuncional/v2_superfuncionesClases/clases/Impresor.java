package programacionFuncional.v2_superfuncionesClases.clases;

import programacionFuncional.v2_superfuncionesClases.interfaces.Consumidor;

public class Impresor implements Consumidor {

	@Override
	public void actuar(int valor) {
		System.out.println(valor);
	}

}
