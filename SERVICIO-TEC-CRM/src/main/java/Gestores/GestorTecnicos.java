package Gestores;

import Personas.Tecnico;

public class GestorTecnicos extends GestorPersonas {

    private Tecnico[] listaTecnicos;

    public GestorTecnicos(int capacidadMaxima) {
        super(capacidadMaxima);
    }

    @Override
    public Object buscarPorId(String id) { return null; }

    @Override
    public boolean registrar(Object entidad) { return false; }

    @Override
    public Object buscarPorNombre(String nombre) { return null; }

    @Override
    public Object[] listarActivos() { return null; }

    public Tecnico buscarTecnicoPorId(String id) { return null; }

    public Tecnico obtenerTecnicoDisponible() { return null; }

    public Tecnico[] getListaTecnicos() { return null; }
}
