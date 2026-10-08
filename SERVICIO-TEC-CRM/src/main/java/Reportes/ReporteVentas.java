package Reportes;

/**
 * Reporte financiero de facturación acumulada, ingresos por mano de obra y repuestos.
 *
 * HERENCIA: extiende ReporteGerencial.
 */
public class ReporteVentas extends ReporteGerencial {

    private double totalIngresosManoObra;
    private double totalIngresosRepuestos;
    private int totalComprobantesEmitidos;

    public ReporteVentas(String responsable, String periodoAnalisis) {
        super("REPORTE FINANCIERO DE VENTAS Y SERVICIOS", responsable, periodoAnalisis);
    }

    @Override
    public String generarContenido() { return null; }

    public double getTotalFacturacion() { return totalIngresosManoObra + totalIngresosRepuestos; }

    public double getTotalIngresosManoObra() { return totalIngresosManoObra; }

    public double getTotalIngresosRepuestos() { return totalIngresosRepuestos; }

    public int getTotalComprobantesEmitidos() { return totalComprobantesEmitidos; }
}
