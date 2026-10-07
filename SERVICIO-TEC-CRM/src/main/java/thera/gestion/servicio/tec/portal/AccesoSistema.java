package thera.gestion.servicio.tec.portal;

import thera.gestion.servicio.tec.interfaces.IConsultable;

/**
 * Superclase para interfaces de acceso e interacción de usuarios con el sistema (Portal cliente o Panel admin).
 *
 * HIJOS DIRECTOS: PortalCRM, PanelAdmin
 */
public abstract class AccesoSistema implements IConsultable {

    protected String nombreModulo;
    protected boolean sesionIniciada;

    public AccesoSistema(String nombreModulo) {
        this.nombreModulo = nombreModulo;
        this.sesionIniciada = false;
    }

    @Override
    public Object buscarPorId(String id) { return null; }

    @Override
    public boolean existePorId(String id) { return false; }

    @Override
    public int contarRegistros() { return 0; }

    /** Muestra el menú principal de este módulo de acceso. (POLIMORFISMO) */
    public abstract void mostrarMenuPrincipal();

    public String getNombreModulo() { return nombreModulo; }

    public boolean isSesionIniciada() { return sesionIniciada; }
}
