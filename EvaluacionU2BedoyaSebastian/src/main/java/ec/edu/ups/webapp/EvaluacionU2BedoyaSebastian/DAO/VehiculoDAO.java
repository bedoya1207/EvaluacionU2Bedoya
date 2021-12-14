package ec.edu.ups.webapp.EvaluacionU2BedoyaSebastian.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;



import ec.edu.ups.webapp.EvaluacionU2BedoyaSebastian.model.vehiculo;
@Stateless
public class VehiculoDAO {

	@PersistenceContext
	private EntityManager em;
	
	public void insert(vehiculo ve) {
	em.persist(ve);	
	}
	public void update(vehiculo ve) {
		em.merge(ve);
	}
	
	public vehiculo read (int codigo) {
		vehiculo op = em.find( vehiculo.class, codigo);
		return op;
	}
}
