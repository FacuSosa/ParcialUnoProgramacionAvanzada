package ar.edu.unlam.pb2.ParcialUno;

public class ProductoLujoso extends Producto {

	public ProductoLujoso(String detalle, Double precio) {
		super(detalle, precio);
	}

	@Override
	public Double calcularImpuesto() {
		return this.getPrecio() * 1.21 * 1.15;
	}

}
