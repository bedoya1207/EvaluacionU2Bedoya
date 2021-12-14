package ec.edu.ups.webapp.EvaluacionU2BedoyaSebastian.bussines;

import javax.ejb.Remote;

import ec.edu.ups.webapp.EvaluacionBedoyaSebastian.view.VentanaVehiculo;
import ec.edu.ups.webapp.EvaluacionU2BedoyaSebastian.model.vehiculo;

@Remote
public interface VehiculoONRemote {
	public void insertar (vehiculo ve);
	public void actualizar(vehiculo ve);
	public void leer(int codigo);
}
