package Gestores;

import Personas.ClienteBase;

public class GestorClientes extends GestorPersonas {

    private ClienteBase[] listaClientes;

    public GestorClientes(int capacidadMaxima) {
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

    public ClienteBase buscarClientePorId(String id) { return null; }

    public ClienteBase[] getListaClientes() { return null; }
}
