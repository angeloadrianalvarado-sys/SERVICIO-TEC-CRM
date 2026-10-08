package Descuentos;

import java.time.LocalDate;

/**
 * Descuento automático por temporada del año (Navidad, Fiestas Patrias, Cyber).
 *
 * HERENCIA: extiende DescuentoCondicional.
 */
public class DescuentoTemporada extends DescuentoCondicional {

    private String nombreTemporada;

    public DescuentoTemporada(String codigo, String descripcion, double porcentaje,
                              LocalDate fechaInicio, LocalDate fechaFin, String nombreTemporada) {
        super(codigo, descripcion, porcentaje, fechaInicio, fechaFin);
        this.nombreTemporada = nombreTemporada;
    }

    @Override
    public double calcularMontoDescuento(double montoBase) { return 0; }

    @Override
    public boolean esAplicable() { return false; }

    @Override
    public String obtenerTipoDescuento() { return "DESCUENTO_TEMPORADA"; }

    public String getNombreTemporada() { return nombreTemporada; }
}
