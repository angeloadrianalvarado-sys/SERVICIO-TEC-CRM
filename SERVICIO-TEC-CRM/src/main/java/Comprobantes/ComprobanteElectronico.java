package Comprobantes;

import Ordenes.OrdenServicio;
import Enums.TipoComprobante;
import Enums.MetodoPago;

/**
 * Superclase para comprobantes con emisión digital y firma/hash de SUNAT.
 *
 * HERENCIA: extiende ComprobanteBase.
 * HIJOS DIRECTOS: Boleta, Factura
 */
public abstract class ComprobanteElectronico extends ComprobanteBase {

    protected String codigoHashSunat;
    protected String urlConsultaWeb;

    public ComprobanteElectronico(String serieNumero, TipoComprobante tipo,
                                  OrdenServicio orden, MetodoPago metodoPago,
                                  double montoTotal, String codigoHashSunat) {
        super(serieNumero, tipo, orden, metodoPago, montoTotal);
        this.codigoHashSunat = codigoHashSunat;
        this.urlConsultaWeb = "https://sunat.gob.pe/consultas/" + serieNumero;
    }

    public String getCodigoHashSunat() { return codigoHashSunat; }

    public String getUrlConsultaWeb() { return urlConsultaWeb; }
}
