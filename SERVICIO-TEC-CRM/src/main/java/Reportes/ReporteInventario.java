package Reportes;

import Repuestos.InventarioRepuestos;

public class ReporteInventario extends ReporteOperativo {

    private InventarioRepuestos inventario;
    private int umbralBajoStock;

    public ReporteInventario(InventarioRepuestos inventario, String responsable, int umbralBajoStock) {
        super("REPORTE DE INVENTARIO DE REPUESTOS", responsable, "GENERAL");
        this.inventario = inventario;
        this.umbralBajoStock = umbralBajoStock;
    }

    @Override
    public String generarContenido() { return null; }

    public void imprimirTablaStock() { }

    public void imprimirAlertasBajoStock() { }

    public InventarioRepuestos getInventario() { return inventario; }

    public int getUmbralBajoStock() { return umbralBajoStock; }
}
