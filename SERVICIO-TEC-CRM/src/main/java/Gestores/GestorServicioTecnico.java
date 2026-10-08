package Gestores;

import Ordenes.OrdenServicio;
import Personas.ClienteBase;
import Equipo.Equipo;
import Enums.EstadoOrden;

/**
 * Gestiona todas las órdenes de servicio activas en el taller.
 *
 * HERENCIA: extiende GestorOperaciones.
 */
public class GestorServicioTecnico extends GestorOperaciones {

    private OrdenServicio[] listaOrdenes;

    public GestorServicioTecnico(int capacidadMaxima) {
        super(capacidadMaxima, "ORD");
    }

    @Override
    public Object buscarPorId(String codigo) { return null; }

    @Override
    public boolean registrar(Object entidad) { return false; }

    @Override
    public Object[] filtrarPorEstado(Object estado) { return null; }

    @Override
    public Object[] listarOperacionesActivas() { return null; }

    public OrdenServicio registrarOrden(ClienteBase cliente, Equipo equipo, String falla) { return null; }

    public OrdenServicio buscarPorCodigo(String codigo) { return null; }

    public OrdenServicio[] filtrarPorEstado(EstadoOrden estado) { return null; }

    public OrdenServicio[] buscarOrdenesPorCliente(String idCliente) { return null; }

    public OrdenServicio[] getListaOrdenes() { return null; }

    public int getCantidadOrdenes() { return 0; }
}
