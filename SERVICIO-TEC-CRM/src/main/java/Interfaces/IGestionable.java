package Interfaces;

/**
 * Interfaz que define el contrato de operaciones CRUD básicas
 * para todos los gestores del sistema.
 */
public interface IGestionable {

    /**
     * Registra o agrega una nueva entidad en el gestor.
     * @param entidad Objeto a registrar.
     * @return true si el registro fue exitoso, false si no hubo espacio
     *         o si la entidad ya existía.
     */
    boolean registrar(Object entidad);

    /**
     * Actualiza los datos de una entidad ya existente en el gestor.
     * @param entidad Objeto con los datos actualizados.
     * @return true si la actualización fue exitosa.
     */
    boolean actualizar(Object entidad);

    /**
     * Elimina (lógicamente) una entidad del gestor por su id.
     * @param id Identificador de la entidad a eliminar.
     * @return true si fue eliminada correctamente.
     */
    boolean eliminar(String id);
}
