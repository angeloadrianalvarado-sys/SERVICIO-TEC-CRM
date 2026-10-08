package Reportes;

public abstract class ReporteOperativo extends ReporteBase {

    protected String turnoTrabajo;

    public ReporteOperativo(String titulo, String responsable, String turnoTrabajo) {
        super(titulo, responsable);
        this.turnoTrabajo = turnoTrabajo;
    }

    public String getTurnoTrabajo() { return turnoTrabajo; }
}
