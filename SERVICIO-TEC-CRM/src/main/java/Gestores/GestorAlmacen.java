package Gestores;

public abstract class GestorAlmacen extends GestorBase {

    protected String ubicacionAlmacen;

    public GestorAlmacen(int capacidadMaxima, String ubicacionAlmacen) {
        super(capacidadMaxima);
    }

    public abstract int contarItemsEnStock();

    public abstract void emitirAlertaStockCritico(int umbral);

    public String getUbicacionAlmacen() { return null; }
}
