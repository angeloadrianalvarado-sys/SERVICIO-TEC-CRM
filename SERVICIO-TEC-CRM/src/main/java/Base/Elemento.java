package Base;

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

    public abstract String getDetalle();

    @Override
    public String obtenerDescripcion() { return null; }
}
