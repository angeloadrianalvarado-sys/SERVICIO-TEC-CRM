package thera.gestion.servicio.tec.gestores;

/**
 * Superclase abstracta para gestores que administran operaciones/órdenes.
 * Agrega métodos de filtrado por estado y generación de códigos operativos.
 *
 * HERENCIA: extiende GestorBase.
 * HIJOS DIRECTOS: GestorServicioTecnico
 */
public abstract class GestorOperaciones extends GestorBase {

    protected String prefijoCodigo;

    public GestorOperaciones(int capacidadMaxima, String prefijoCodigo) {
        super(capacidadMaxima);
    }

    /** Filtra operaciones según su estado actual. (POLIMORFISMO) */
    public abstract Object[] filtrarPorEstado(Object estado);

    /** Retorna todas las operaciones vigentes (no cerradas/canceladas). */
    public abstract Object[] listarOperacionesActivas();
}
