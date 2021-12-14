package ec.edu.ups.webapp.EvalucacionU2BedoyaSebastian.bussines;

import ec.edu.ups.webapp.EvaluacionU2BedoyaSebastian.model.vehiculo;

public interface VehiculoONRemote {
	public void insertar (vehiculo ve);
	public void actualizar(vehiculo ve);
	public void leer(int codigo);
}
