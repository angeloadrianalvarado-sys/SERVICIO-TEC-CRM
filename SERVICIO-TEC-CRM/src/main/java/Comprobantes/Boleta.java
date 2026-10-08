package Comprobantes;

import Ordenes.OrdenServicio;
import Enums.TipoComprobante;
import Enums.MetodoPago;

/**
 * Representa una Boleta de Venta Electrónica emitida a consumidor final.
 *
 * HERENCIA: extiende ComprobanteElectronico.
 */
public class Boleta extends ComprobanteElectronico {

    private String dniCliente;

    public Boleta(String serieNumero, OrdenServicio orden,
                  MetodoPago metodoPago, double montoTotal, String dniCliente) {
        super(serieNumero, TipoComprobante.BOLETA, orden, metodoPago, montoTotal, "HASH-BOL-" + serieNumero);
        this.dniCliente = dniCliente;
    }

    @Override
    public void imprimirDetalle() { }

    @Override
    public String obtenerDatosFiscales() { return "DNI: " + dniCliente; }

    public String getDniCliente() { return dniCliente; }
}
