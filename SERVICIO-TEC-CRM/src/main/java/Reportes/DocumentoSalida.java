package Reportes;

import Interfaces.IReportable;

/**
 * Superclase raíz para cualquier documento generado para impresión, visualización o entrega.
 *
 * HIJOS DIRECTOS: ReporteBase, Certificado
 */
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

    /** Retorna el formato de pie de página para impresión. (POLIMORFISMO) */
    public abstract String obtenerPiePagina();

    public String getEncabezado() { return encabezado; }

    public String getFechaEmisionDocumento() { return fechaEmisionDocumento; }
}
