package ar.edu.unlam.pb2.ParcialUno;

import java.util.ArrayList;
import java.util.List;

public class Factura implements Reportador{
	
	private List<LineaProducto> productos;

	public Factura() {
		this.productos = new ArrayList<LineaProducto>();
	}

	public void agregarProducto(Producto producto) {

		for (LineaProducto linea : productos) {
			if (linea.getProducto().getDetalle() == producto.getDetalle()) {
				linea.agregarCantidad();
				return;
			}
		}

		this.productos.add(new LineaProducto(producto));
	}

	public Double calcularTotal(String detalle) {
		Double valor = 0.0;
		
		for(LineaProducto linea : productos) {
			if(linea.getProducto().getDetalle() == detalle) {
				valor += linea.getCantidad() * linea.getProducto().calcularImpuesto();
			}
		}
		
		return valor;
	}
	
	public Double calcularTotal() {
		Double total = 0.0;
		
		for(LineaProducto linea : productos) {
				total += linea.getCantidad() * linea.getProducto().calcularImpuesto();
			}
		
		return total;
		}

	@Override
	public String reportar(Factura factura) {
		Integer cantidad = 0;
		Double total = 0.0;
		
		for(LineaProducto linea : productos) {
			cantidad += linea.getCantidad();
		}
		
		total = this.calcularTotal();
		
		return "Hay " + this.productos.size() + " Articulos, con un total de: " + this.calcularTotal();
	}

	
	}

