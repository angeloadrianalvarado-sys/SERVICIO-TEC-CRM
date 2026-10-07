package thera.gestion.servicio.tec.descuentos;

import thera.gestion.servicio.tec.personas.ClienteBase;
import thera.gestion.servicio.tec.ordenes.OrdenServicio;
import thera.gestion.servicio.tec.gestores.GestorServicioTecnico;

/**
 * Gestor encargado de evaluar y aplicar descuentos sobre las órdenes.
 *
 * HERENCIA: extiende GestorPromocionesBase.
 */
public class GestorPromociones extends GestorPromocionesBase {

    private Descuento[] descuentosDisponibles;
    private int contadorDescuentos;

    public GestorPromociones(int capacidadMaxima) {
        super(capacidadMaxima);
        this.descuentosDisponibles = new Descuento[capacidadMaxima];
        this.contadorDescuentos = 0;
    }

    @Override
    public Descuento determinarDescuentoAplicable(Object cliente, Object orden) { return null; }

    public boolean agregarDescuento(Descuento descuento) { return false; }

    public Descuento evaluarMejorDescuento(ClienteBase cliente, GestorServicioTecnico gestor) { return null; }

    public int obtenerFrecuenciaCliente(ClienteBase cliente, GestorServicioTecnico gestor) { return 0; }

    public double calcularTotalConDescuento(OrdenServicio orden, GestorServicioTecnico gestor) { return 0; }

    public void imprimirResumenDescuento(OrdenServicio orden, Descuento descuento) { }
}
