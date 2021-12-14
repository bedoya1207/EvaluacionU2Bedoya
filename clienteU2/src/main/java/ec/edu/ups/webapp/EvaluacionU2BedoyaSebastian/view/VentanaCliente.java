package ec.edu.ups.webapp.EvaluacionU2BedoyaSebastian.view;

import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;

import ec.edu.ups.webapp.EvalucacionU2BedoyaSebastian.bussines.VehiculoONRemote;





public class VentanaCliente {

  
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
            this.calcRemote = (VehiculoONRemote) context.lookup(lookupName);  
           
              
        } catch (Exception ex) {  
            ex.printStackTrace();  
            throw ex;  
        }  
	}

	public void sumar(double a, double b) {
		double d =this.calcRemote.suma(a, b);
		System.out.println("Suma"+ d);
	}
	
	public void mostrarOperaciones() {
		
		List<Operacion> operaciones = this.calcRemote.getSumas();
		for(Operacion op : operaciones) {
			System.out.println(op.getA()+" + "+op.getB()+" = "+op.getR());
		}
	}
	public void crearPersona() {
		Persona p = new Persona();
		p.setCedula("0106481914");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaCliente vtnCalc = new VentanaCliente();
		try {
			vtnCalc.conectar();
			System.out.println("entro");
			vtnCalc.sumar(9,8);
			vtnCalc.sumar(20,8);
			vtnCalc.sumar(19,88);
			vtnCalc.mostrarOperaciones();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
