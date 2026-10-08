package Portal;

import Gestores.GestorServicioTecnico;
import Repuestos.InventarioRepuestos;

public class PanelAdmin extends AccesoSistema {

    private GestorServicioTecnico gestorOrdenes;
    private InventarioRepuestos inventario;

    public PanelAdmin(GestorServicioTecnico gestorOrdenes, InventarioRepuestos inventario) {
        super("PANEL_ADMINISTRATIVO_TALLER");
        this.gestorOrdenes = gestorOrdenes;
        this.inventario = inventario;
    }

    @Override
    public void mostrarMenuPrincipal() { }

    public void mostrarResumenGeneral() { }

    public void cerrarOrdenYFacturar(String codigoOrden, String metodoPago, String tipoComprobante) { }

    public GestorServicioTecnico getGestorOrdenes() { return gestorOrdenes; }

    public InventarioRepuestos getInventario() { return inventario; }
}
