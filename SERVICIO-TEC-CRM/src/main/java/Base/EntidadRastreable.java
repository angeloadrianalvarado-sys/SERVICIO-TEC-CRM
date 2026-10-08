package Base;

/**
 * Superclase abstracta para entidades que tienen un ciclo de vida rastreable:
 * cambios de estado, historial de eventos y diagnósticos.
 *
 * HIJOS DIRECTOS: Cambios
 */
public abstract class EntidadRastreable {

    protected int totalCambiosEstado;
    protected String ultimoResponsable;

    public EntidadRastreable() {
    }

    /** Reinicia el historial de la entidad. */
    public void reiniciarHistorial() { }

    /** Retorna cuántos cambios de estado ha tenido la entidad. */
    public int getTotalCambiosEstado() { return 0; }

    /** Verifica si la entidad ya fue cerrada/finalizada. (POLIMORFISMO) */
    public abstract boolean estaFinalizada();

    /** Retorna el resumen del estado actual de la entidad. (POLIMORFISMO) */
    public abstract String obtenerResumenEstado();
}
