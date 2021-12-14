package ec.edu.ups.webapp.EvaluacionU2BedoyaSebastian.bussines;

import javax.ejb.Local;

import ec.edu.ups.webapp.EvaluacionBedoyaSebastian.view.VentanaVehiculo;
import ec.edu.ups.webapp.EvaluacionU2BedoyaSebastian.model.vehiculo;

@Local
public interface VehiculoONLocal {

	public void insertar (vehiculo ve);
	public void actualizar(vehiculo ve);
	public void leer(int codigo);
}
