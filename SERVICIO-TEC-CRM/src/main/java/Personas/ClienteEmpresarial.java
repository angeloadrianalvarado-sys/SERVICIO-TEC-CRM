package Personas;

public class ClienteEmpresarial extends ClienteBase {

    private String ruc;
    private String razonSocial;
    private String contactoEmpresa;

    public ClienteEmpresarial(String id, String nombre, String telefono, String email,
                              String direccion, String ruc, String razonSocial, String contactoEmpresa) {
        super(id, nombre, telefono, email, direccion);
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.contactoEmpresa = contactoEmpresa;
    }

    @Override
    public String getTipoCliente() { return "PERSONA_JURIDICA"; }

    @Override
    public String getDocumentoPrincipal() { return ruc; }

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

    public String getRuc() { return ruc; }

    public String getRazonSocial() { return razonSocial; }

    public String getContactoEmpresa() { return contactoEmpresa; }
}
