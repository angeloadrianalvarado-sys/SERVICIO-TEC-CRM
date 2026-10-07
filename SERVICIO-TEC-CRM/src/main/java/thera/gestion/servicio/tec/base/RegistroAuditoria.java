package thera.gestion.servicio.tec.base;

/**
 * Superclase abstracta para todos los registros de auditoría del sistema.
 * Centraliza fecha/hora y responsable de cada evento registrado.
 *
 * HIJOS DIRECTOS: RegistroSeguimiento, RegistroAcceso
 */
public abstract class RegistroAuditoria {

    protected String fechaHoraRegistro;
    protected String responsable;
    protected String tipoEvento;

    public RegistroAuditoria(String responsable, String tipoEvento) {
    }

    public String getFechaHoraRegistro() { return null; }

    public String getResponsable() { return null; }

    public String getTipoEvento() { return null; }

    /** Retorna el registro formateado para mostrar en consola. (POLIMORFISMO) */
    public abstract String getTextoFormateado();
}
