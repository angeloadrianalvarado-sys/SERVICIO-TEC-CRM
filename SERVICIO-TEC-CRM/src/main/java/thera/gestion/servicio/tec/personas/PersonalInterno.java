package thera.gestion.servicio.tec.personas;

/**
 * Superclase abstracta para todo el personal interno del taller:
 * técnicos y administradores. Agrega credenciales y datos laborales.
 *
 * HERENCIA: extiende Persona.
 * HIJOS DIRECTOS: Tecnico, Administrador
 */
public abstract class PersonalInterno extends Persona {

    protected String usuario;
    protected boolean disponible;
    protected int tareasActivas;

    public PersonalInterno(String id, String nombre, String telefono,
                           String email, String usuario) {
        super(id, nombre, telefono, email);
    }

    public String getUsuario() { return null; }

    public boolean isDisponible() { return false; }

    public int getTareasActivas() { return 0; }

    public void setDisponible(boolean disponible) { }

    /** Retorna el área de trabajo del personal. (POLIMORFISMO) */
    public abstract String getAreaTrabajo();
}
