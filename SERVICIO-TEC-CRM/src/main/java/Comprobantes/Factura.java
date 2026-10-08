package Comprobantes;

import Ordenes.OrdenServicio;
import Enums.TipoComprobante;
import Enums.MetodoPago;

public class Factura extends ComprobanteElectronico {

    private String rucEmpresa;
    private String razonSocial;
    private String direccionFiscal;

    public Factura(String serieNumero, OrdenServicio orden,
                   MetodoPago metodoPago, double montoTotal,
                   String rucEmpresa, String razonSocial, String direccionFiscal) {
        super(serieNumero, TipoComprobante.FACTURA, orden, metodoPago, montoTotal, "HASH-FAC-" + serieNumero);
        this.rucEmpresa = rucEmpresa;
        this.razonSocial = razonSocial;
        this.direccionFiscal = direccionFiscal;
    }

    @Override
    public void imprimirDetalle() { }

    @Override
    public String obtenerDatosFiscales() { return "RUC: " + rucEmpresa + " - " + razonSocial; }

    public boolean validarRuc() { return false; }

    public String getRucEmpresa() { return rucEmpresa; }

    public String getRazonSocial() { return razonSocial; }

    public String getDireccionFiscal() { return direccionFiscal; }
}
