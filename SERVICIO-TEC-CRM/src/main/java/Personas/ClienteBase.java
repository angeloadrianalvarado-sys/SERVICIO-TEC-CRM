package Personas;

import Enums.NivelCliente;
import Interfaces.INotificable;
import Interfaces.IValidable;

public abstract class ClienteBase extends Persona implements INotificable, IValidable {

    protected String direccion;
    protected NivelCliente nivel;
    protected int totalServiciosRegistrados;

    public ClienteBase(String id, String nombre, String telefono,
                       String email, String direccion) {
        super(id, nombre, telefono, email);
    }

    public String getDireccion() { return null; }

    public NivelCliente getNivel() { return null; }

    public int getTotalServiciosRegistrados() { return 0; }

    public void incrementarContadorServicios() { }

    public void actualizarNivel() { }

    public abstract String getTipoCliente();

    public abstract String getDocumentoPrincipal();

    @Override
    public String obtenerRol() { return null; }
}
