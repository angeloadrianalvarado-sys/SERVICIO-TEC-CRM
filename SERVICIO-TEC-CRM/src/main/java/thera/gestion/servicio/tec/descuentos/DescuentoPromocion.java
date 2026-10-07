package thera.gestion.servicio.tec.descuentos;

import java.time.LocalDate;

/**
 * Descuento por campaña o código de cupón promocional.
 *
 * HERENCIA: extiende DescuentoCondicional.
 */
public class DescuentoPromocion extends DescuentoCondicional {

    private String codigoPromocion;
    private int usosMaximos;
    private int usosActuales;

    public DescuentoPromocion(String codigo, String descripcion, double porcentaje,
                              String codigoPromocion, LocalDate fechaInicio, LocalDate fechaFin,
                              int usosMaximos) {
        super(codigo, descripcion, porcentaje, fechaInicio, fechaFin);
        this.codigoPromocion = codigoPromocion;
        this.usosMaximos = usosMaximos;
        this.usosActuales = 0;
    }

    @Override
    public double calcularMontoDescuento(double montoBase) { return 0; }

    @Override
    public boolean esAplicable() { return false; }

    @Override
    public String obtenerTipoDescuento() { return "DESCUENTO_PROMOCION"; }

    public boolean validarCodigo(String codigoIngresado) { return false; }

    public void registrarUso() { }

    public boolean estaVigente() { return false; }

    public String getCodigoPromocion() { return codigoPromocion; }

    public int getUsosRestantes() { return 0; }
}
