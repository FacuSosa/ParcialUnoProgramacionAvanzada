package ar.edu.unlam.pb2.ParcialUno;

public abstract class Producto {
	
	private String detalle;
	private Double precio;

	public Producto(String detalle, Double precio) {
		this.detalle = detalle;
		this.precio = precio;
	}

	public Double getPrecio() {
		return precio;
	}
	
	public String getDetalle() {
		return detalle;
	}
	
	public abstract Double calcularImpuesto();


	
}
