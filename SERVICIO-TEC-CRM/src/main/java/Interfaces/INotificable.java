package Interfaces;

public interface INotificable {

    void notificar(String mensaje);

    void enviarAlerta(String asunto, String detalle);
}
