package thera.gestion.servicio.tec.personas;

/**
 * Representa a un Técnico de soporte.
 *
 * HERENCIA: extiende PersonalInterno.
 */
public class Tecnico extends PersonalInterno {

    private String especialidad;
    private int ordenesAtendidas;

    public Tecnico(String id, String nombre, String telefono, String email, String especialidad) {
        super(id, nombre, telefono, email, "tec_" + id);
    }

    @Override
    public String obtenerRol() { return null; }

    @Override
    public String obtenerInformacionEspecifica() { return null; }

    @Override
    public String getAreaTrabajo() { return null; }

    public void marcarDisponible(boolean disponible) { }

    public void incrementarOrdenesAtendidas() { }

    public String getEspecialidad() { return null; }

    public int getOrdenesAtendidas() { return 0; }
}
