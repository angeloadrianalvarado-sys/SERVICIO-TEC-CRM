package Portal;

import Personas.ClienteBase;
import Enums.EstadoOrden;

/**
 * Notificación automática enviada al cliente cuando su equipo cambia de estado.
 *
 * HERENCIA: extiende Notificacion.
 */
public class NotificacionEstado extends Notificacion {

    private String codigoOrden;
    private EstadoOrden nuevoEstado;

    public NotificacionEstado(String id, ClienteBase destinatario, String codigoOrden, EstadoOrden nuevoEstado) {
        super(id, "Actualización de Orden " + codigoOrden, "Su equipo cambió a: " + nuevoEstado, destinatario);
        this.codigoOrden = codigoOrden;
        this.nuevoEstado = nuevoEstado;
    }

    @Override
    public String obtenerResumen() { return "[" + codigoOrden + "] -> " + nuevoEstado; }

    public String getCodigoOrden() { return codigoOrden; }

    public EstadoOrden getNuevoEstado() { return nuevoEstado; }
}
