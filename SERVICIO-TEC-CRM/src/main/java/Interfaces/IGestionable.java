package Interfaces;

public interface IGestionable {

    boolean registrar(Object entidad);

    boolean actualizar(Object entidad);

    boolean eliminar(String id);
}
