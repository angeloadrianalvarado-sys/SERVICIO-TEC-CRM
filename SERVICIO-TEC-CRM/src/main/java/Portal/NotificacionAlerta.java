package Portal;

import Personas.ClienteBase;

public class NotificacionAlerta extends Notificacion {

    private String nivelUrgencia;
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
