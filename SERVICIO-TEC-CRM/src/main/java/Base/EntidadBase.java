package Base;

/**
 * Superclase raíz de toda la jerarquía de entidades del sistema.
 * Cualquier objeto que pueda ser identificado por un código o ID
 * desciende de esta clase.
 *
 * HIJOS DIRECTOS: Persona, Elemento
 */
public abstract class EntidadBase {

    protected String id;
    protected String nombre;

    public EntidadBase(String id, String nombre) {
    }

    public String getId() { return null; }

    public String getNombre() { return null; }

    /** Retorna una descripción textual de la entidad. (POLIMORFISMO) */
    public abstract String obtenerDescripcion();

    @Override
    public String toString() { return null; }
}
