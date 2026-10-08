package Personas;

import Base.EntidadBase;

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

    public abstract String obtenerRol();

    public abstract String obtenerInformacionEspecifica();

    @Override
    public String obtenerDescripcion() { return null; }
}
