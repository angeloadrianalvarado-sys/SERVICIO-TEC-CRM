package thera.gestion.servicio.tec.ordenes;

import thera.gestion.servicio.tec.base.EntidadRastreable;
import thera.gestion.servicio.tec.enums.EstadoOrden;

/**
 * Superclase que encapsula la gestión del ciclo de vida de una orden:
 * cambio de estados, registro de historial y diagnóstico técnico.
 *
 * HERENCIA: extiende EntidadRastreable.
 * HIJOS DIRECTOS: OrdenServicio
 */
public class Cambios extends EntidadRastreable {

    protected double costoManoObra;
    protected String diagnostico;
    protected EstadoOrden estadoActual;
    protected RegistroSeguimiento[] historial;
    protected int contadorHistorial;

    public Cambios() {
        super();
    }

    @Override
    public boolean estaFinalizada() { return false; }

    @Override
    public String obtenerResumenEstado() { return null; }

    public void agregarHistorial(EstadoOrden estado, String detalle, String usuario) { }

    public void cambiarEstado(EstadoOrden nuevoEstado, String motivo, String usuario) { }

    public void registrarDiagnostico(String diagnostico, double costoManoObra, String usuario) { }

    public double getCostoManoObra() { return 0; }

    public String getDiagnostico() { return null; }

    public EstadoOrden getEstadoActual() { return null; }

    public RegistroSeguimiento[] getHistorial() { return null; }

    public int getContadorHistorial() { return 0; }
}
