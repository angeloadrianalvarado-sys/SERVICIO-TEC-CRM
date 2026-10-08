package Portal;

import Interfaces.IConsultable;

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

    public abstract void mostrarMenuPrincipal();

    public String getNombreModulo() { return nombreModulo; }

    public boolean isSesionIniciada() { return sesionIniciada; }
}
