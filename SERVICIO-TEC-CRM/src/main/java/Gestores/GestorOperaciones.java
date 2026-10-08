package Gestores;

public abstract class GestorOperaciones extends GestorBase {

    protected String prefijoCodigo;

    public GestorOperaciones(int capacidadMaxima, String prefijoCodigo) {
        super(capacidadMaxima);
    }

    public abstract Object[] filtrarPorEstado(Object estado);

    public abstract Object[] listarOperacionesActivas();
}
