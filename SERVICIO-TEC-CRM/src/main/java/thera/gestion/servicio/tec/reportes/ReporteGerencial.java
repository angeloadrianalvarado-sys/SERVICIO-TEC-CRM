package thera.gestion.servicio.tec.reportes;

/**
 * Superclase para reportes financieros y directivos del negocio.
 *
 * HERENCIA: extiende ReporteBase.
 * HIJOS DIRECTOS: ReporteVentas, ReporteDesempeno
 */
public abstract class ReporteGerencial extends ReporteBase {

    protected String periodoAnalisis; // "MENSUAL", "TRIMESTRAL", "ANUAL"

    public ReporteGerencial(String titulo, String responsable, String periodoAnalisis) {
        super(titulo, responsable);
        this.periodoAnalisis = periodoAnalisis;
    }

    public String getPeriodoAnalisis() { return periodoAnalisis; }
}
