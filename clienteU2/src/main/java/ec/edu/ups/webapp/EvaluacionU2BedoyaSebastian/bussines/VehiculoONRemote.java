package ec.edu.ups.webapp.EvaluacionU2BedoyaSebastian.bussines;

import ec.edu.ups.webapp.EvaluacionU2BedoyaSebastian.model.vehiculo;

public interface VehiculoONRemote {
	public void insertar (vehiculo ve);
	public void actualizar(vehiculo ve);
	public vehiculo leer(int codigo);
}
