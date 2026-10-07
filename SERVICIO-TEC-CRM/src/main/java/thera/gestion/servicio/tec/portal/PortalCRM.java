package thera.gestion.servicio.tec.portal;

import thera.gestion.servicio.tec.gestores.GestorServicioTecnico;
import thera.gestion.servicio.tec.ordenes.OrdenServicio;
import thera.gestion.servicio.tec.enums.EstadoOrden;

/**
 * Portal web o móvil de consulta y seguimiento orientado al Cliente final.
 *
 * HERENCIA: extiende AccesoSistema.
 */
public class PortalCRM extends AccesoSistema {

    private GestorServicioTecnico gestorOrdenes;

    public PortalCRM(GestorServicioTecnico gestorOrdenes) {
        super("PORTAL_CLIENTE_CRM");
        this.gestorOrdenes = gestorOrdenes;
    }

    @Override
    public void mostrarMenuPrincipal() { }

    public void consultarSeguimientoCliente(String codigoOrden, String idCliente) { }

    private void mostrarPantallaCliente(OrdenServicio orden) { }

    private String traducirEstadoParaCliente(EstadoOrden estado) { return null; }

    public GestorServicioTecnico getGestorOrdenes() { return gestorOrdenes; }
}
