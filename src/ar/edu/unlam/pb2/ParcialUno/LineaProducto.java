package ar.edu.unlam.pb2.ParcialUno;

public class LineaProducto {
	
	private Producto producto;
	private Integer cantidad;
	
	public LineaProducto(Producto producto) {
		this.producto = producto;
		this.cantidad = 1;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void agregarCantidad() {
		this.cantidad += 1;
	}

	public Integer getCantidad() {
		return this.cantidad;
	}
	
	
}
