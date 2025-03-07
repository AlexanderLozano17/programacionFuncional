package programacionFuncional.v2_superfuncionesClases.clases;

import programacionFuncional.v2_superfuncionesClases.interfaces.Proveedor;

public class Naturales implements Proveedor {
	
	private static int next = 0;

	@Override
	public Integer obtener() { return next++; }
}
