package Gestores;

public abstract class GestorPersonas extends GestorBase {

    public GestorPersonas(int capacidadMaxima) {
        super(capacidadMaxima);
    }

    public abstract Object buscarPorNombre(String nombre);

    public abstract Object[] listarActivos();
}
