package ec.edu.ups.webapp.EvaluacionU2BedoyaSebastian.model;

import java.io.Serializable;

public class vehiculo implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int codigo;

	private String Placa;

	private String marca;

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
