package Comprobantes;

import Ordenes.OrdenServicio;
import Enums.TipoComprobante;
import Enums.MetodoPago;

public abstract class ComprobanteBase extends DocumentoContable {

    protected String serieNumero;
    protected TipoComprobante tipo;
    protected OrdenServicio orden;
    protected MetodoPago metodoPago;
    protected double montoTotal;
    protected double igv;
    protected double subtotalNeto;

    public ComprobanteBase(String serieNumero, TipoComprobante tipo,
                           OrdenServicio orden, MetodoPago metodoPago, double montoTotal) {
        super(serieNumero, "HOY");
        this.serieNumero = serieNumero;
        this.tipo = tipo;
        this.orden = orden;
        this.metodoPago = metodoPago;
        this.montoTotal = montoTotal;
    }

    @Override
    public boolean esValidoContablemente() { return montoTotal > 0; }

    protected void calcularImpuestos() { }

    @Override
    public abstract void imprimirDetalle();

    public abstract String obtenerDatosFiscales();

    public String getSerieNumero() { return serieNumero; }

    public TipoComprobante getTipo() { return tipo; }

    public MetodoPago getMetodoPago() { return metodoPago; }

    public double getMontoTotal() { return montoTotal; }

    public double getIgv() { return igv; }

    public double getSubtotalNeto() { return subtotalNeto; }
}
