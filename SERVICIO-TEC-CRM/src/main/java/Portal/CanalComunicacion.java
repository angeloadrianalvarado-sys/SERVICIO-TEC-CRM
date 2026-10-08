package Portal;

import Interfaces.INotificable;

public abstract class CanalComunicacion implements INotificable {

    protected String tipoCanal;
    protected boolean canalHabilitado;

    public CanalComunicacion(String tipoCanal) {
        this.tipoCanal = tipoCanal;
        this.canalHabilitado = true;
    }

    @Override
    public void notificar(String mensaje) { }

    @Override
    public void enviarAlerta(String asunto, String detalle) { }

    public abstract boolean despacharMensaje(String destinatario, String contenido);

    public String getTipoCanal() { return tipoCanal; }

    public boolean isCanalHabilitado() { return canalHabilitado; }
}
