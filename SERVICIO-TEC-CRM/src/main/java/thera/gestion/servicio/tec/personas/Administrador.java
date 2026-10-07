package thera.gestion.servicio.tec.personas;

/**
 * Representa a un Administrador del sistema.
 *
 * HERENCIA: extiende PersonalInterno.
 */
public class Administrador extends PersonalInterno {

    private String contrasena;
    private String nivelAcceso;

    public Administrador(String id, String nombre, String telefono, String email,
                         String usuario, String contrasena, String nivelAcceso) {
        super(id, nombre, telefono, email, usuario);
    }

    @Override
    public String obtenerRol() { return null; }

    @Override
    public String obtenerInformacionEspecifica() { return null; }

    @Override
    public String getAreaTrabajo() { return null; }

    public boolean autenticar(String usuario, String contrasena) { return false; }

    public boolean tienePermiso(String accion) { return false; }

    public String getNivelAcceso() { return null; }
}
