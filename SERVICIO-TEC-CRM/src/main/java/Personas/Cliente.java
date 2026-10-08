package Personas;

public class Cliente extends ClienteBase {

    private String dni;
    private CategoriaCliente categoria;

    public Cliente(String id, String nombre, String telefono, String email, String direccion) {
        super(id, nombre, telefono, email, direccion);
        this.dni = id;
    }

    @Override
    public String getTipoCliente() { return "PERSONA_NATURAL"; }

    @Override
    public String getDocumentoPrincipal() { return dni; }

    @Override
    public String obtenerInformacionEspecifica() { return null; }

    @Override
    public boolean validar() { return false; }

    @Override
    public boolean estaActivo() { return false; }

    @Override
    public String obtenerMensajeValidacion() { return null; }

    @Override
    public void notificar(String mensaje) { }

    @Override
    public void enviarAlerta(String asunto, String detalle) { }

    public String getDni() { return dni; }

    public CategoriaCliente getCategoria() { return categoria; }
}
