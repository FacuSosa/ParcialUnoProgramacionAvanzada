package ar.edu.unlam.pb2.ParcialUno;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.pb2.ParcialUno.Factura;
import ar.edu.unlam.pb2.ParcialUno.Producto;
import ar.edu.unlam.pb2.ParcialUno.ProductoBasico;
import ar.edu.unlam.pb2.ParcialUno.ProductoLujoso;

public class FacturaTest {

	private static final Double IMPUESTO_BASICO = 1.21;
	private static final Double IMPUESTO_LUJOSO = 1.15;
	private static final Double TOTAL_CALCULADO = (10.50 * 2 + 2300.60 * 1.15) * 1.21;

	@Test
	public void queSePuedePedirImpuestoSobreArticulo() {
		Producto producto = new ProductoBasico("shampoo", 10.50);

		Double valor = producto.calcularImpuesto();

		Assert.assertEquals(valor, (Double) (producto.getPrecio() * IMPUESTO_BASICO));
	}

	@Test
	public void queSePuedePedirImpuestoSobreArticuloDeLujo() {
		Producto producto = new ProductoLujoso("Perfume Paco", 2300.60);

		Double valor = producto.calcularImpuesto();

		Assert.assertEquals(valor, (Double) (producto.getPrecio() * IMPUESTO_BASICO * IMPUESTO_LUJOSO));
	}

	@Test
	public void queSePuedeCalcularElTotalPorDetalle() {
		Producto producto = new ProductoBasico("shampoo", 10.50);
		Factura factura = new Factura();
		
		factura.agregarProducto(producto);
		factura.agregarProducto(producto);
		
		Double total = factura.calcularTotal("shampoo");
		
		Assert.assertEquals(total, (Double)(10.50 * 2 * IMPUESTO_BASICO));
	}
	
	@Test
	public void queSePuedaCalcularElTotalDeFactura() {
		Producto producto = new ProductoBasico("shampoo", 10.50);
		Producto producto2 = new ProductoLujoso("Perfume Paco", 2300.60);
		Factura factura = new Factura();
		
		factura.agregarProducto(producto);
		factura.agregarProducto(producto);
		factura.agregarProducto(producto2);
		
		Double total = factura.calcularTotal();
		
		Assert.assertEquals(Math.round(total), Math.round(TOTAL_CALCULADO));
	}
	
	@Test
	public void quePuedaReportarseBasico() {
		Producto producto = new ProductoBasico("shampoo", 10.50);
		Factura factura = new Factura();
		
		factura.agregarProducto(producto);
		
		String valorObtenido = factura.reportar(factura);
		String valorEsperado = "Hay 1 Articulos, con un total de: 12.705";
		
		Assert.assertEquals(valorObtenido, valorEsperado);
		
	}
}
