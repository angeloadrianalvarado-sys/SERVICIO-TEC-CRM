package Ordenes;

import Personas.ClienteBase;
import Equipo.Equipo;

/**
 * Orden orientada a mantenimiento preventivo, limpieza y optimización.
 *
 * HERENCIA: extiende OrdenServicio.
 */
public class OrdenMantenimiento extends OrdenServicio {

    private String tipoMantenimiento; // "PREVENTIVO", "LIMPIEZA_INTERNA", "OPTIMIZACION_SO"
    private boolean incluyeCambioPastaTermica;

    public OrdenMantenimiento(String codigo, ClienteBase cliente, Equipo equipo,
                              String fallaReportada, String tipoMantenimiento) {
        super(codigo, cliente, equipo, fallaReportada);
        this.tipoMantenimiento = tipoMantenimiento;
    }

    @Override
    public String getTipoServicio() { return "MANTENIMIENTO_PREVENTIVO"; }

    public String getTipoMantenimiento() { return tipoMantenimiento; }

    public boolean isIncluyeCambioPastaTermica() { return incluyeCambioPastaTermica; }

    public void setIncluyeCambioPastaTermica(boolean v) { this.incluyeCambioPastaTermica = v; }
}
