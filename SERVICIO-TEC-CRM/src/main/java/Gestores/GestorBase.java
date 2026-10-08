package Gestores;

import Interfaces.IConsultable;
import Interfaces.IGestionable;

public abstract class GestorBase implements IConsultable, IGestionable {

    protected int capacidadMaxima;
    protected int cantidad;
    protected int correlativo;

    public GestorBase(int capacidadMaxima) {
    }

    @Override
    public abstract Object buscarPorId(String id);

    @Override
    public boolean existePorId(String id) { return false; }

    @Override
    public int contarRegistros() { return 0; }

    @Override
    public abstract boolean registrar(Object entidad);

    @Override
    public boolean actualizar(Object entidad) { return false; }

    @Override
    public boolean eliminar(String id) { return false; }

    protected boolean hayEspacio() { return false; }

    protected String generarCodigo(String prefijo) { return null; }

    public int getCantidad() { return 0; }

    public int getCapacidadMaxima() { return 0; }
}
