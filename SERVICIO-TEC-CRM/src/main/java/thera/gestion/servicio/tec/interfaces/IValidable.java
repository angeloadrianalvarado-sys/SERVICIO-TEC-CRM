package thera.gestion.servicio.tec.interfaces;

/**
 * Interfaz que define el contrato para validar el estado
 * y la integridad de una entidad del sistema.
 */
public interface IValidable {

    /**
     * Verifica si la entidad cumple con todas las reglas de negocio
     * para ser considerada válida.
     * @return true si la entidad es válida, false en caso contrario.
     */
    boolean validar();

    /**
     * Indica si la entidad se encuentra activa/habilitada en el sistema.
     * @return true si está activa, false si fue deshabilitada.
     */
    boolean estaActivo();

    /**
     * Devuelve un mensaje descriptivo sobre el motivo de invalidez,
     * útil para mostrar errores al usuario o al log.
     * @return Mensaje de error o "OK" si es válida.
     */
    String obtenerMensajeValidacion();
}
