package Portal;

import Ordenes.OrdenServicio;

/**
 * Certificado de control de calidad y pruebas técnicas superadas (benchmarks, estrés, voltaje).
 *
 * HERENCIA: extiende Certificado.
 */
public class CertificadoCalidad extends Certificado {

    private OrdenServicio orden;
    private String tecnicoControlCalidad;
    private int puntajePruebas; // 0 a 100

    public CertificadoCalidad(String codigoCertificado, OrdenServicio orden,
                              String tecnicoControlCalidad, int puntajePruebas) {
        super(codigoCertificado, "HOY");
        this.orden = orden;
        this.tecnicoControlCalidad = tecnicoControlCalidad;
        this.puntajePruebas = puntajePruebas;
    }

    @Override
    public boolean comprobarValidez() { return puntajePruebas >= 80; }

    @Override
    public boolean validar() { return comprobarValidez(); }

    @Override
    public String obtenerMensajeValidacion() { return puntajePruebas >= 80 ? "Control de calidad aprobado" : "Pruebas no superadas"; }

    public OrdenServicio getOrden() { return orden; }

    public String getTecnicoControlCalidad() { return tecnicoControlCalidad; }

    public int getPuntajePruebas() { return puntajePruebas; }
}
