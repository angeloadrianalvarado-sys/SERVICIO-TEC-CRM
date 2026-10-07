package thera.gestion.servicio.tec.reportes;

import thera.gestion.servicio.tec.ordenes.OrdenServicio;

/**
 * Genera la ficha técnica completa de una Orden de Servicio.
 *
 * HERENCIA: extiende ReporteOperativo.
 */
public class ReporteOrden extends ReporteOperativo {

    private OrdenServicio orden;

    public ReporteOrden(OrdenServicio orden, String responsable) {
        super("HOJA DE SERVICIO TECNICO", responsable, "GENERAL");
        this.orden = orden;
    }

    @Override
    public String generarContenido() { return null; }

    public void imprimirFicha() { }

    public void imprimirFichaConDescuento(double montoDescuento, double totalFinal) { }

    public OrdenServicio getOrden() { return orden; }
}
