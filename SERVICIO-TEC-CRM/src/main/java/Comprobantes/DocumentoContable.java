package Comprobantes;

import Interfaces.ICalculable;
import Interfaces.IReportable;

/**
 * Superclase raíz para cualquier documento con validez contable o tributaria.
 *
 * HIJOS DIRECTOS: ComprobanteBase
 */
public abstract class DocumentoContable implements ICalculable, IReportable {

    protected String numeroRegistroContable;
    protected String fechaEmision;

    public DocumentoContable(String numeroRegistroContable, String fechaEmision) {
        this.numeroRegistroContable = numeroRegistroContable;
        this.fechaEmision = fechaEmision;
    }

    @Override
    public double calcularTotal() { return 0; }

    @Override
    public double calcularSubtotal() { return 0; }

    @Override
    public double aplicarDescuento(double porcentaje) { return 0; }

    @Override
    public String generarReporte() { return null; }

    /** Valida los requisitos contables básicos del documento. (POLIMORFISMO) */
    public abstract boolean esValidoContablemente();

    public String getNumeroRegistroContable() { return numeroRegistroContable; }

    public String getFechaEmision() { return fechaEmision; }
}
