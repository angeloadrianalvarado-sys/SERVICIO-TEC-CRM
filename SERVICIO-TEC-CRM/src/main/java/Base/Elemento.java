package Base;

/**
 * Superclase abstracta para todos los elementos físicos del sistema
 * (equipos y repuestos). Agrupa atributos comunes como código, descripción
 * y estado físico.
 *
 * HERENCIA: extiende EntidadBase.
 * HIJOS DIRECTOS: Equipo, Repuesto
 */
public abstract class Elemento extends EntidadBase {

    protected String codigo;
    protected String descripcion;
    protected boolean disponible;

    public Elemento(String codigo, String descripcion) {
        super(codigo, descripcion);
    }

    public String getCodigo() { return null; }

    public String getDescripcion() { return null; }

    public boolean isDisponible() { return false; }

    public void setDisponible(boolean disponible) { }

    /** Retorna la ficha técnica del elemento. (POLIMORFISMO) */
    public abstract String getDetalle();

    @Override
    public String obtenerDescripcion() { return null; }
}
