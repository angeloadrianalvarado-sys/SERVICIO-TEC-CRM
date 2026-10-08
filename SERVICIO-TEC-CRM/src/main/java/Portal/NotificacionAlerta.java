package Portal;

import Personas.ClienteBase;

/**
 * Notificación urgente o de contingencia (ej. aprobación requerida de presupuesto, retraso de repuesto).
 *
 * HERENCIA: extiende Notificacion.
 */
public class NotificacionAlerta extends Notificacion {

    private String nivelUrgencia; // "ALTA", "CRITICA"
    private boolean requiereRespuestaCliente;

    public NotificacionAlerta(String id, String asunto, String mensaje,
                              ClienteBase destinatario, String nivelUrgencia) {
        super(id, asunto, mensaje, destinatario);
        this.nivelUrgencia = nivelUrgencia;
        this.requiereRespuestaCliente = true;
    }

    @Override
    public String obtenerResumen() { return "ALERTA URGENTE: " + asunto; }

    public String getNivelUrgencia() { return nivelUrgencia; }

    public boolean isRequiereRespuestaCliente() { return requiereRespuestaCliente; }
}
