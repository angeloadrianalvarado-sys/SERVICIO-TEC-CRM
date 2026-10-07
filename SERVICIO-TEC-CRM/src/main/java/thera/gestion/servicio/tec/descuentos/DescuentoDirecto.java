package thera.gestion.servicio.tec.descuentos;

/**
 * Superclase para descuentos que se aplican inmediatamente sin depender de fechas o cupones.
 *
 * HERENCIA: extiende Descuento.
 * HIJOS DIRECTOS: DescuentoFrecuencia, DescuentoManual
 */
public abstract class DescuentoDirecto extends Descuento {

    protected String motivoAplicacion;

    public DescuentoDirecto(String codigo, String descripcion, double porcentaje, String motivoAplicacion) {
        super(codigo, descripcion, porcentaje);
        this.motivoAplicacion = motivoAplicacion;
    }

    public String getMotivoAplicacion() { return motivoAplicacion; }
}
