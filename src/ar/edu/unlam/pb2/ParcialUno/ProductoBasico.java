package ar.edu.unlam.pb2.ParcialUno;

public class ProductoBasico extends Producto {
	
	public ProductoBasico(String detalle, Double precio) {
		super(detalle, precio);
	}

	@Override
	public Double calcularImpuesto() {
		return this.getPrecio() * 1.21;
	}
}
