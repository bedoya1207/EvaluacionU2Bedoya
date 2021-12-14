package ec.edu.ups.webapp.EvaluacionU2BedoyaSebastian.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class vehiculo implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id 
@Column(name="veh_codigo")
	private int codigo;
@Column(name="veh_Placa")	
	private String Placa;
@Column(name="veh_marca")
	private String marca;
@Column(name="veh_modelo")	
	private String modelo;
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getPlaca() {
	return Placa;
}
public void setPlaca(String placa) {
	Placa = placa;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}

}
