package Base;

public abstract class RegistroAuditoria {

    protected String fechaHoraRegistro;
    protected String responsable;
    protected String tipoEvento;

    public RegistroAuditoria(String responsable, String tipoEvento) {
    }

    public String getFechaHoraRegistro() { return null; }

    public String getResponsable() { return null; }

    public String getTipoEvento() { return null; }

    public abstract String getTextoFormateado();
}
