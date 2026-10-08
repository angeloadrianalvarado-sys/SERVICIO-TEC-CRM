package Comprobantes;

import Ordenes.OrdenServicio;
import Enums.TipoComprobante;
import Enums.MetodoPago;

/**
 * Superclase para comprobantes de control interno o talonarios manuales sin validez fiscal SUNAT.
 *
 * HERENCIA: extiende ComprobanteBase.
 * HIJOS DIRECTOS: TicketInterno
 */
public abstract class ComprobanteManual extends ComprobanteBase {

    protected String talonarioFisico;

    public ComprobanteManual(String serieNumero, TipoComprobante tipo,
                             OrdenServicio orden, MetodoPago metodoPago,
                             double montoTotal, String talonarioFisico) {
        super(serieNumero, tipo, orden, metodoPago, montoTotal);
        this.talonarioFisico = talonarioFisico;
    }

    public String getTalonarioFisico() { return talonarioFisico; }
}
