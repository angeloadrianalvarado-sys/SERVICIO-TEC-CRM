package thera.gestion.servicio.tec.ordenes;

import thera.gestion.servicio.tec.personas.ClienteBase;
import thera.gestion.servicio.tec.equipo.Equipo;

/**
 * Orden orientada a reparación de fallas críticas y cambio de componentes.
 *
 * HERENCIA: extiende OrdenServicio.
 */
public class OrdenReparacion extends OrdenServicio {

    private String nivelGravedad;
    private boolean requierePiezasEspeciales;

    public OrdenReparacion(String codigo, ClienteBase cliente, Equipo equipo,
                           String fallaReportada, String nivelGravedad) {
        super(codigo, cliente, equipo, fallaReportada);
        this.nivelGravedad = nivelGravedad;
    }

    @Override
    public String getTipoServicio() { return "REPARACION_CORRECTIVA"; }

    public String getNivelGravedad() { return nivelGravedad; }

    public boolean isRequierePiezasEspeciales() { return requierePiezasEspeciales; }

    public void setRequierePiezasEspeciales(boolean r) { this.requierePiezasEspeciales = r; }
}
