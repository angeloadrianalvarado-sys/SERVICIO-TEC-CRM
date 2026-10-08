package Descuentos;

/**
 * Descuento aplicado manualmente por un administrador o supervisor.
 *
 * HERENCIA: extiende DescuentoDirecto.
 */
public class DescuentoManual extends DescuentoDirecto {

    private String usuarioAutoriza;

    public DescuentoManual(String codigo, String descripcion, double porcentaje,
                           String motivoAplicacion, String usuarioAutoriza) {
        super(codigo, descripcion, porcentaje, motivoAplicacion);
        this.usuarioAutoriza = usuarioAutoriza;
    }

    @Override
    public double calcularMontoDescuento(double montoBase) { return 0; }

    @Override
    public boolean esAplicable() { return false; }

    @Override
    public String obtenerTipoDescuento() { return "DESCUENTO_MANUAL"; }

    public String getUsuarioAutoriza() { return usuarioAutoriza; }
}
