package Reportes;

/**
 * Superclase para reportes de las operaciones diarias del taller.
 *
 * HERENCIA: extiende ReporteBase.
 * HIJOS DIRECTOS: ReporteOrden, ReporteInventario
 */
public abstract class ReporteOperativo extends ReporteBase {

    protected String turnoTrabajo;

    public ReporteOperativo(String titulo, String responsable, String turnoTrabajo) {
        super(titulo, responsable);
        this.turnoTrabajo = turnoTrabajo;
    }

    public String getTurnoTrabajo() { return turnoTrabajo; }
}
