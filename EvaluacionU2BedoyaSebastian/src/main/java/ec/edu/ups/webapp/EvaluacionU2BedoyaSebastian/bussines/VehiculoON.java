package ec.edu.ups.webapp.EvaluacionU2BedoyaSebastian.bussines;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.webapp.EvaluacionBedoyaSebastian.view.VentanaVehiculo;
import ec.edu.ups.webapp.EvaluacionU2BedoyaSebastian.DAO.VehiculoDAO;
import ec.edu.ups.webapp.EvaluacionU2BedoyaSebastian.model.vehiculo;

@Stateless
public class VehiculoON implements VehiculoONLocal,VehiculoONRemote{

	@Inject
	private VehiculoDAO vehiculodao;
	public void insertar (vehiculo ve) {
		vehiculodao.insert(ve);
	}
	public void actualizar(vehiculo ve) {
		vehiculodao.update(ve);
	}
	public vehiculo leer(int codigo) {
		
		return vehiculodao.read(codigo);
	}
	
}
