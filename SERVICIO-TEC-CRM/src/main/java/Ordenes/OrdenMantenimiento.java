package Ordenes;

import Personas.ClienteBase;
import Equipo.Equipo;

public class OrdenMantenimiento extends OrdenServicio {

    private String tipoMantenimiento;
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
