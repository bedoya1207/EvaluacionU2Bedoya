package ec.edu.ups.webapp.EvaluacionU2BedoyaSebastian.view;

import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;

import ec.edu.ups.webapp.EvaluacionU2BedoyaSebastian.bussines.VehiculoONRemote;
import ec.edu.ups.webapp.EvaluacionU2BedoyaSebastian.model.vehiculo;





public class VentanaCliente {
	private static VehiculoONRemote vehi;
  
	public void conectar() throws Exception {
		try {  
			
            final Hashtable<String, Comparable> jndiProperties =  
                    new Hashtable<String, Comparable>();  
            jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,  
                    "org.wildfly.naming.client.WildFlyInitialContextFactory");  
            jndiProperties.put("jboss.naming.client.ejb.context", true);  
              
            jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");  
            jndiProperties.put(Context.SECURITY_PRINCIPAL, "demmoapp59");  
            jndiProperties.put(Context.SECURITY_CREDENTIALS, "demmoapp59");  
              
            final Context context = new InitialContext(jndiProperties);  
              
            final String lookupName = "ejb:/EvaluacionU2BedoyaSebastian/VehiculoON!ec.edu.ups.webapp.EvaluacionU2BedoyaSebastian.bussines.VehiculoONRemote";    
            this.vehi = (VehiculoONRemote) context.lookup(lookupName);  
           
              
        } catch (Exception ex) {  
            ex.printStackTrace();  
            throw ex;  
        }  
	}

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaCliente vtnCalc = new VentanaCliente();
		try {
			vtnCalc.conectar();
			Pantalla p = new  Pantalla(vehi);
			p.setVisible(true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
