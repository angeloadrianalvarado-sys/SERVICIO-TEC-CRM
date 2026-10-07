package thera.gestion.servicio.tec.portal;

import thera.gestion.servicio.tec.ordenes.OrdenServicio;

/**
 * Póliza de garantía post-reparación emitida para el cliente.
 *
 * HERENCIA: extiende Certificado.
 */
public class Garantia extends Certificado {

    private OrdenServicio orden;
    private int diasValidez;
    private String condiciones;
    private boolean anulada;
    private String motivoAnulacion;

    public Garantia(String codigoGarantia, OrdenServicio orden, int diasValidez, String condiciones) {
        super(codigoGarantia, "HOY");
        this.orden = orden;
        this.diasValidez = diasValidez;
        this.condiciones = condiciones;
        this.anulada = false;
    }

    @Override
    public boolean comprobarValidez() { return !anulada && diasValidez > 0; }

    @Override
    public boolean validar() { return comprobarValidez(); }

    @Override
    public String obtenerMensajeValidacion() { return anulada ? "Garantía anulada" : "Garantía válida"; }

    public boolean validarReclamo(String descripcionProblema, boolean selloIntacto) { return false; }

    public void anularGarantia(String motivo) { }

    public void imprimirCertificado() { }

    public OrdenServicio getOrden() { return orden; }

    public int getDiasValidez() { return diasValidez; }

    public String getCondiciones() { return condiciones; }

    public boolean isAnulada() { return anulada; }
}
