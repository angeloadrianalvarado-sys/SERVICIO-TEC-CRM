package Descuentos;

public abstract class DescuentoDirecto extends Descuento {

    protected String motivoAplicacion;

    public DescuentoDirecto(String codigo, String descripcion, double porcentaje, String motivoAplicacion) {
        super(codigo, descripcion, porcentaje);
        this.motivoAplicacion = motivoAplicacion;
    }

    public String getMotivoAplicacion() { return motivoAplicacion; }
}
