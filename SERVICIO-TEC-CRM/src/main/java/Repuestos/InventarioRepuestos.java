package Repuestos;

import Gestores.GestorAlmacen;
import Interfaces.IReportable;

public class InventarioRepuestos extends GestorAlmacen implements IReportable {

    private Repuesto[] listaRepuestos;
    private int contador;

    public InventarioRepuestos(int capacidadMaxima) {
        super(capacidadMaxima, "Almacen Principal Central");
    }

    @Override
    public Object buscarPorId(String codigo) { return null; }

    @Override
    public boolean registrar(Object entidad) { return false; }

    @Override
    public int contarItemsEnStock() { return 0; }

    @Override
    public void emitirAlertaStockCritico(int umbral) { }

    @Override
    public void imprimirDetalle() { }

    @Override
    public String generarReporte() { return null; }

    public boolean registrarRepuesto(Repuesto nuevo) { return false; }

    public Repuesto buscarRepuesto(String codigo) { return null; }

    public Repuesto despacharRepuesto(String codigo, int cantidadRequerida) { return null; }

    public void reportarBajoStock(int limiteMinimo) { }

    public void mostrarInventario() { }

    public Repuesto[] getListaRepuestos() { return null; }
}
