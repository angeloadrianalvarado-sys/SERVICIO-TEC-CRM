package thera.gestion.servicio.tec.gestores;

/**
 * Gestor encargado del catálogo y contacto de proveedores de repuestos.
 *
 * HERENCIA: extiende GestorAlmacen.
 */
public class GestorProveedores extends GestorAlmacen {

    private String[] listaProveedores;

    public GestorProveedores(int capacidadMaxima, String ubicacionAlmacen) {
        super(capacidadMaxima, ubicacionAlmacen);
    }

    @Override
    public Object buscarPorId(String id) { return null; }

    @Override
    public boolean registrar(Object entidad) { return false; }

    @Override
    public int contarItemsEnStock() { return 0; }

    @Override
    public void emitirAlertaStockCritico(int umbral) { }

    public String[] getListaProveedores() { return null; }
}
