package Base;

public abstract class EntidadRastreable {

    protected int totalCambiosEstado;
    protected String ultimoResponsable;

    public EntidadRastreable() {
    }

    public void reiniciarHistorial() { }

    public int getTotalCambiosEstado() { return 0; }

    public abstract boolean estaFinalizada();

    public abstract String obtenerResumenEstado();
}
