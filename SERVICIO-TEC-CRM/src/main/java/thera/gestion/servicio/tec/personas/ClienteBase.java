package thera.gestion.servicio.tec.personas;

import thera.gestion.servicio.tec.enums.NivelCliente;
import thera.gestion.servicio.tec.interfaces.INotificable;
import thera.gestion.servicio.tec.interfaces.IValidable;

/**
 * Superclase abstracta para todos los tipos de cliente del taller.
 * Agrupa atributos comunes: dirección, nivel y contador de servicios.
 *
 * HERENCIA: extiende Persona.
 * HIJOS DIRECTOS: Cliente, ClienteEmpresarial
 */
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

    /** Retorna el tipo de cliente (natural o empresarial). (POLIMORFISMO) */
    public abstract String getTipoCliente();

    /** Retorna el documento principal de identificación. (POLIMORFISMO) */
    public abstract String getDocumentoPrincipal();

    @Override
    public String obtenerRol() { return null; }
}
