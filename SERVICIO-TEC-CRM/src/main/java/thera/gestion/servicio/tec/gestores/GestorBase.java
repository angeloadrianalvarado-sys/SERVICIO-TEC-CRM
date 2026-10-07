package thera.gestion.servicio.tec.gestores;

import thera.gestion.servicio.tec.interfaces.IConsultable;
import thera.gestion.servicio.tec.interfaces.IGestionable;

/**
 * Superclase abstracta para todos los gestores del sistema.
 * Define el comportamiento común: capacidad máxima, contador y correlativo.
 *
 * HERENCIA: todos los gestores concretos extienden esta clase.
 *   -> GestorServicioTecnico extends GestorBase
 *   -> GestorClientes        extends GestorBase
 *   -> GestorTecnicos        extends GestorBase
 *
 * IMPLEMENTA: IConsultable e IGestionable como contrato común.
 */
public abstract class GestorBase implements IConsultable, IGestionable {

    // Atributos comunes a todos los gestores
    protected int capacidadMaxima;
    protected int cantidad;
    protected int correlativo;

    public GestorBase(int capacidadMaxima) {
    }

    // ----- Implementación de IConsultable -----

    @Override
    public abstract Object buscarPorId(String id);

    @Override
    public boolean existePorId(String id) { return false; }

    @Override
    public int contarRegistros() { return 0; }

    // ----- Implementación de IGestionable -----

    @Override
    public abstract boolean registrar(Object entidad);

    @Override
    public boolean actualizar(Object entidad) { return false; }

    @Override
    public boolean eliminar(String id) { return false; }

    // ----- Métodos propios compartidos entre gestores -----

    /** Verifica si el arreglo interno tiene espacio para un nuevo registro. */
    protected boolean hayEspacio() { return false; }

    /** Genera un código único correlativo para la próxima entidad. */
    protected String generarCodigo(String prefijo) { return null; }

    // ----- Getters -----

    public int getCantidad() { return 0; }

    public int getCapacidadMaxima() { return 0; }
}
