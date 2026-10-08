package Base;

public abstract class EntidadBase {

    protected String id;
    protected String nombre;

    public EntidadBase(String id, String nombre) {
    }

    public String getId() { return null; }

    public String getNombre() { return null; }

    public abstract String obtenerDescripcion();

    @Override
    public String toString() { return null; }
}
