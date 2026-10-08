package Ordenes;

import Base.RegistroAuditoria;

/**
 * Registra accesos y consultas al sistema (auditoría de inicio de sesión o consulta web).
 *
 * HERENCIA: extiende RegistroAuditoria.
 */
public class RegistroAcceso extends RegistroAuditoria {

    private String direccionIp;
    private boolean accesoExitoso;

    public RegistroAcceso(String responsable, String direccionIp, boolean accesoExitoso) {
        super(responsable, "ACCESO_SISTEMA");
        this.direccionIp = direccionIp;
        this.accesoExitoso = accesoExitoso;
    }

    @Override
    public String getTextoFormateado() { return null; }

    public String getDireccionIp() { return direccionIp; }

    public boolean isAccesoExitoso() { return accesoExitoso; }
}
