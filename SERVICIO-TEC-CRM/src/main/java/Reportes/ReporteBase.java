package Reportes;

public abstract class ReporteBase extends DocumentoSalida {

    protected String titulo;
    protected String responsable;

    public ReporteBase(String titulo, String responsable) {
        super("TALLER DE SERVICIO TECNICO", "HOY");
        this.titulo = titulo;
        this.responsable = responsable;
    }

    @Override
    public String obtenerPiePagina() { return "Generado por: " + responsable; }

    public abstract String generarContenido();

    public String getTitulo() { return titulo; }

    public String getResponsable() { return responsable; }
}
