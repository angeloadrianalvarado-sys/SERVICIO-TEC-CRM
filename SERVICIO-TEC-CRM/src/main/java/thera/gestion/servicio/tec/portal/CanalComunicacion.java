package thera.gestion.servicio.tec.portal;

import thera.gestion.servicio.tec.interfaces.INotificable;

/**
 * Superclase raíz para canales de transmisión de mensajes (SMS, Email, WhatsApp).
 *
 * HIJOS DIRECTOS: Notificacion
 */
public abstract class CanalComunicacion implements INotificable {

    protected String tipoCanal; // "EMAIL", "SMS", "WHATSAPP", "SISTEMA_INTERNO"
    protected boolean canalHabilitado;

    public CanalComunicacion(String tipoCanal) {
        this.tipoCanal = tipoCanal;
        this.canalHabilitado = true;
    }

    @Override
    public void notificar(String mensaje) { }

    @Override
    public void enviarAlerta(String asunto, String detalle) { }

    /** Envía el paquete por la red o servicio correspondiente. (POLIMORFISMO) */
    public abstract boolean despacharMensaje(String destinatario, String contenido);

    public String getTipoCanal() { return tipoCanal; }

    public boolean isCanalHabilitado() { return canalHabilitado; }
}
