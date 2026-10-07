package thera.gestion.servicio.tec.interfaces;

/**
 * Interfaz que define el contrato para enviar notificaciones
 * a clientes u otros actores del sistema.
 */
public interface INotificable {

    /**
     * Envía una notificación al destinatario con el mensaje indicado.
     * @param mensaje Contenido del mensaje a enviar.
     */
    void notificar(String mensaje);

    /**
     * Envía una alerta urgente al destinatario.
     * @param asunto Título o asunto de la alerta.
     * @param detalle Descripción detallada de la alerta.
     */
    void enviarAlerta(String asunto, String detalle);
}
