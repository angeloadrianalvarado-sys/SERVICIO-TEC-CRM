package Reportes;

public abstract class ReporteGerencial extends ReporteBase {

    protected String periodoAnalisis;

    public ReporteGerencial(String titulo, String responsable, String periodoAnalisis) {
        super(titulo, responsable);
        this.periodoAnalisis = periodoAnalisis;
    }

    public String getPeriodoAnalisis() { return periodoAnalisis; }
}
