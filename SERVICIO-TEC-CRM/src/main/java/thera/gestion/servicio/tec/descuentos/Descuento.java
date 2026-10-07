package thera.gestion.servicio.tec.descuentos;

/**
 * Superclase abstracta para deducciones monetarias sobre el costo del servicio.
 *
 * HERENCIA: extiende BeneficioBase.
 * HIJOS DIRECTOS: DescuentoDirecto, DescuentoCondicional
 */
public abstract class Descuento extends BeneficioBase {

    protected String codigo;
    protected String descripcion;
    protected double porcentaje;

    public Descuento(String codigo, String descripcion, double porcentaje) {
        super(codigo, descripcion);
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.porcentaje = porcentaje;
    }

    @Override
    public double obtenerValorBeneficio() { return porcentaje; }

    public abstract double calcularMontoDescuento(double montoBase);

    public abstract boolean esAplicable();

    public abstract String obtenerTipoDescuento();

    public String getCodigo() { return codigo; }

    public String getDescripcion() { return descripcion; }

    public double getPorcentaje() { return porcentaje; }
}
