package Reportes;

import Interfaces.IReportable;

public abstract class DocumentoSalida implements IReportable {

    protected String encabezado;
    protected String fechaEmisionDocumento;

    public DocumentoSalida(String encabezado, String fechaEmisionDocumento) {
        this.encabezado = encabezado;
        this.fechaEmisionDocumento = fechaEmisionDocumento;
    }

    @Override
    public void imprimirDetalle() { }

    @Override
    public String generarReporte() { return null; }

    public abstract String obtenerPiePagina();

    public String getEncabezado() { return encabezado; }

    public String getFechaEmisionDocumento() { return fechaEmisionDocumento; }
}
