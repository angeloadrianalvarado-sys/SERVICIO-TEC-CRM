package Personas;

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

    public abstract String getAreaTrabajo();
}
