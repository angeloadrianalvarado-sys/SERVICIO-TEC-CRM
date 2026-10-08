package Gestores;

/**
 * Superclase abstracta para gestores que administran personas
 * (clientes y técnicos). Agrega operaciones comunes de búsqueda por nombre.
 *
 * HERENCIA: extiende GestorBase.
 * HIJOS DIRECTOS: GestorClientes, GestorTecnicos
 */
public abstract class GestorPersonas extends GestorBase {

    public GestorPersonas(int capacidadMaxima) {
        super(capacidadMaxima);
    }

    /** Busca una persona por su nombre (parcial o completo). */
    public abstract Object buscarPorNombre(String nombre);

    /** Lista todas las personas activas en el sistema. */
    public abstract Object[] listarActivos();
}
