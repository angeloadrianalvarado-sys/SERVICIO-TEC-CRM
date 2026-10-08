package Ordenes;

import Personas.ClienteBase;
import Personas.Tecnico;
import Equipo.Equipo;
import Repuestos.Repuesto;
import Interfaces.ICalculable;
import Interfaces.IReportable;

/**
 * Superclase para órdenes de trabajo técnico.
 *
 * HERENCIA: extiende Cambios.
 * HIJOS DIRECTOS: OrdenReparacion, OrdenMantenimiento
 */
public class OrdenServicio extends Cambios implements ICalculable, IReportable {

    protected String codigo;
    protected String fallaReportada;
    protected ClienteBase cliente;
    protected Equipo equipo;
    protected Tecnico tecnicoAsignado;
    protected Repuesto[] repuesto;
    protected int contadorRepuestos;

    public OrdenServicio(String codigo, ClienteBase cliente, Equipo equipo, String fallaReportada) {
        super();
        this.codigo = codigo;
        this.cliente = cliente;
        this.equipo = equipo;
        this.fallaReportada = fallaReportada;
    }

    @Override
    public double calcularTotal() { return 0; }

    @Override
    public double calcularSubtotal() { return 0; }

    @Override
    public double aplicarDescuento(double porcentaje) { return 0; }

    @Override
    public void imprimirDetalle() { }

    @Override
    public String generarReporte() { return null; }

    public void asignarTecnico(Tecnico tecnico, String usuario) { }

    public boolean agregarRepuesto(Repuesto r) { return false; }

    /** Tipo de servicio técnico específico. (POLIMORFISMO) */
    public String getTipoServicio() { return "SERVICIO_GENERAL"; }

    public String getCodigo() { return codigo; }

    public String getFallaReportada() { return fallaReportada; }

    public ClienteBase getCliente() { return cliente; }

    public Equipo getEquipo() { return equipo; }

    public Tecnico getTecnicoAsignado() { return tecnicoAsignado; }

    public Repuesto[] getRepuesto() { return repuesto; }

    public int getContadorRepuestos() { return contadorRepuestos; }
}
