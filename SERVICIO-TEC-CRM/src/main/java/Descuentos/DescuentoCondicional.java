package Descuentos;

import java.time.LocalDate;

/**
 * Superclase para descuentos sujetos a vigencia temporal, campañas o condiciones especiales.
 *
 * HERENCIA: extiende Descuento.
 * HIJOS DIRECTOS: DescuentoPromocion, DescuentoTemporada
 */
public abstract class DescuentoCondicional extends Descuento {

    protected LocalDate fechaInicio;
    protected LocalDate fechaFin;

    public DescuentoCondicional(String codigo, String descripcion, double porcentaje,
                                LocalDate fechaInicio, LocalDate fechaFin) {
        super(codigo, descripcion, porcentaje);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public boolean estaEnRangoDeFechas() { return false; }

    public LocalDate getFechaInicio() { return fechaInicio; }

    public LocalDate getFechaFin() { return fechaFin; }
}
