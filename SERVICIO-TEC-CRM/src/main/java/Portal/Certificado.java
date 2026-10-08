package Portal;

import Reportes.DocumentoSalida;
import Interfaces.IValidable;

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

    public abstract boolean comprobarValidez();

    public String getCodigoCertificado() { return codigoCertificado; }

    public String getFechaEmision() { return fechaEmision; }

    public boolean isVigente() { return vigente; }
}
