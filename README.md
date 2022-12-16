# ParcialUnoProgramacionAvanzada

## Enunciado


Se necesita llevar adelante la impresión de facturas para un mercado
mayorista importador.
Cada factura necesita informar por cada línea el precio unitario y la
cantidad de unidades de cada artículo, el total por artículo.
Una vez terminado ese proceso, deberá calcular e informar los impuestos.
Existe un impuesto de 21% para cualquier artículo, y un 15% adicional para las bebidas
y perfumes.
Finalmente necesita informar el valor total de la factura.

Se Pide:

• Implementar las clases necesarias que den solución al
problema.

• Adicionalmente, se nos entrega la siguiente Interface:

```java
public interface Reportador {
public abstract String reportar(Factura factura);
}
```

A partir de la cual se deberá entregar un reportador básico que
genere el texto de la factura.

• Generen al menos CINCO (5) casos de prueba que verifiquen la
funcionalidad deseada

o queSePuedePedirImpuestoSobreArticulo()

o queSePuedePedirImpuestoSobreArticuloDeLujo()

o queSePuedeCalcularElTotalPorDetalle()

o queSePuedaCalcularElTotalDeFactura()

o quePuedaReportarseBasico()
