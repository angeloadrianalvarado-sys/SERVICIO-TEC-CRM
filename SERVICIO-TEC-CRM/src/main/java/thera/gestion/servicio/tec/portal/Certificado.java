package thera.gestion.servicio.tec.portal;

import thera.gestion.servicio.tec.reportes.DocumentoSalida;
import thera.gestion.servicio.tec.interfaces.IValidable;

/**
 * Superclase para certificados oficiales emitidos por el taller al cliente.
 *
 * HERENCIA: extiende DocumentoSalida.
 * HIJOS DIRECTOS: Garantia, CertificadoCalidad
 */
public abstract class Certificado extends DocumentoSalida implements IValidable {

    protected String codigoCertificado;
    protected String fechaEmision;
    protected boolean vigente;

    public Certificado(String codigoCertificado, String fechaEmision) {
        super("CERTIFICACION OFICIAL", fechaEmision);
        this.codigoCertificado = codigoCertificado;
        this.fechaEmision = fechaEmision;
        this.vigente = true;
    }

    @Override
    public boolean estaActivo() { return vigente; }

    @Override
    public String obtenerPiePagina() { return "Certificado: " + codigoCertificado; }

    /** Valida los términos y condiciones de validez. (POLIMORFISMO) */
    public abstract boolean comprobarValidez();

    public String getCodigoCertificado() { return codigoCertificado; }

    public String getFechaEmision() { return fechaEmision; }

    public boolean isVigente() { return vigente; }
}
