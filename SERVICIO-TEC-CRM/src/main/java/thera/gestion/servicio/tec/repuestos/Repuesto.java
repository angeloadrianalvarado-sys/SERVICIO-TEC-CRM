package thera.gestion.servicio.tec.repuestos;

import thera.gestion.servicio.tec.base.Elemento;

/**
 * Representa un repuesto o componente utilizado durante la reparación.
 *
 * HERENCIA: extiende Elemento.
 */
public class Repuesto extends Elemento {

    private double precioUnitario;
    private int cantidad;
    private String proveedor;

    public Repuesto(String codigo, String nombre, double precioUnitario, int cantidad) {
        super(codigo, nombre);
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    @Override
    public String getDetalle() { return null; }

    public double getSubTotal() { return 0; }

    public void reducirStock(int cant) { }

    public void aumentarStock(int cant) { }

    public boolean tieneStockSuficiente(int cantidadRequerida) { return false; }

    public double getPrecioUnitario() { return 0; }

    public int getCantidad() { return 0; }

    public String getProveedor() { return null; }
}
