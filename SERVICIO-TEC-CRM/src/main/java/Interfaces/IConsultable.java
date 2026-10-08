package Interfaces;

/**
 * Interfaz que define el contrato para buscar y consultar entidades
 * dentro de los distintos gestores del sistema.
 */
public interface IConsultable {

    /**
     * Busca y retorna una entidad a partir de su identificador único.
     * @param id Identificador o código de la entidad.
     * @return El objeto encontrado, o null si no existe.
     */
    Object buscarPorId(String id);

    /**
     * Verifica si una entidad con el id dado existe en el sistema.
     * @param id Identificador a buscar.
     * @return true si existe, false en caso contrario.
     */
    boolean existePorId(String id);

    /**
     * Retorna el número total de entidades registradas.
     * @return Cantidad de registros.
     */
    int contarRegistros();
}
