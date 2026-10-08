package Personas;

import Base.EntidadBase;

/**
 * Superclase abstracta para toda persona del sistema.
 * Extiende EntidadBase (hereda id y nombre) y agrega datos de contacto.
 *
 * HERENCIA: extiende EntidadBase.
 * HIJOS DIRECTOS: PersonalInterno, ClienteBase
 */
public abstract class Persona extends EntidadBase {

    protected String telefono;
    protected String email;
    protected boolean activo;

    public Persona(String id, String nombre, String telefono, String email) {
        super(id, nombre);
    }

    public String getTelefono() { return null; }

    public String getEmail() { return null; }

    public boolean isActivo() { return false; }

    public void setActivo(boolean activo) { }

    /** Define el rol de la persona en el sistema. (POLIMORFISMO) */
    public abstract String obtenerRol();

    /** Retorna información específica del subtipo. (POLIMORFISMO) */
    public abstract String obtenerInformacionEspecifica();

    @Override
    public String obtenerDescripcion() { return null; }
}
