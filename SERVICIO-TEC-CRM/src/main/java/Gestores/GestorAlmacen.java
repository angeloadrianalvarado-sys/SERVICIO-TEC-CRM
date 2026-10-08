package Gestores;

/**
 * Superclase abstracta para gestores encargados del almacenamiento y control
 * de stock/proveedores de piezas y materiales.
 *
 * HERENCIA: extiende GestorBase.
 * HIJOS DIRECTOS: InventarioRepuestos, GestorProveedores
 */
public abstract class GestorAlmacen extends GestorBase {

    protected String ubicacionAlmacen;

    public GestorAlmacen(int capacidadMaxima, String ubicacionAlmacen) {
        super(capacidadMaxima);
    }

    /** Retorna el total de ítems con existencias disponibles. (POLIMORFISMO) */
    public abstract int contarItemsEnStock();

    /** Emite una alerta de existencias críticas según umbral mínimo. (POLIMORFISMO) */
    public abstract void emitirAlertaStockCritico(int umbral);

    public String getUbicacionAlmacen() { return null; }
}
