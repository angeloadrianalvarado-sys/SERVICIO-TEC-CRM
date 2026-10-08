package Portal;

import Personas.ClienteBase;

public abstract class Notificacion extends CanalComunicacion {

    protected String id;
    protected String asunto;
    protected String mensaje;
    protected String fechaEnvio;
    protected boolean leida;
    protected ClienteBase destinatario;

    public Notificacion(String id, String asunto, String mensaje, ClienteBase destinatario) {
        super("EMAIL");
        this.id = id;
        this.asunto = asunto;
        this.mensaje = mensaje;
        this.destinatario = destinatario;
        this.leida = false;
        this.fechaEnvio = "HOY";
    }

    @Override
    public boolean despacharMensaje(String destinatario, String contenido) { return true; }

    public void marcarComoLeida() { this.leida = true; }

    public abstract String obtenerResumen();

    public String getId() { return id; }

    public String getAsunto() { return asunto; }

    public String getMensaje() { return mensaje; }

    public boolean isLeida() { return leida; }

    public ClienteBase getDestinatario() { return destinatario; }
}
