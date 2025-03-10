package programacionFuncional.v2_superfuncionesClases.clases;

import java.util.Random;

import programacionFuncional.v2_superfuncionesClases.interfaces.Proveedor;

public class Aleatorio implements Proveedor {

	@Override
	public Integer obtener() {
		Random random = new Random();
		return random.nextInt(10);
	}

}
