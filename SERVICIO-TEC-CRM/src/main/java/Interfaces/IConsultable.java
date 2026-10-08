package Interfaces;

public interface IConsultable {

    Object buscarPorId(String id);

    boolean existePorId(String id);

    int contarRegistros();
}
