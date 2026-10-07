package thera.gestion.servicio.tec.comprobantes;

import thera.gestion.servicio.tec.ordenes.OrdenServicio;
import thera.gestion.servicio.tec.enums.TipoComprobante;
import thera.gestion.servicio.tec.enums.MetodoPago;

/**
 * Ticket de consumo interno o recibo de caja chica para taller.
 *
 * HERENCIA: extiende ComprobanteManual.
 */
public class TicketInterno extends ComprobanteManual {

    private String cajaDespacho;

    public TicketInterno(String serieNumero, OrdenServicio orden,
                         MetodoPago metodoPago, double montoTotal,
                         String talonarioFisico, String cajaDespacho) {
        super(serieNumero, TipoComprobante.NOTA_CREDITO, orden, metodoPago, montoTotal, talonarioFisico);
        this.cajaDespacho = cajaDespacho;
    }

    @Override
    public void imprimirDetalle() { }

    @Override
    public String obtenerDatosFiscales() { return "CONTROL_INTERNO - Caja: " + cajaDespacho; }

    public String getCajaDespacho() { return cajaDespacho; }
}
