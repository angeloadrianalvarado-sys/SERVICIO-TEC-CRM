package Enums;

/**
 * Enum que representa los posibles estados del flujo de trabajo
 * de una Orden de Servicio técnico.
 */
public enum EstadoOrden {
    RECIBIDO,
    EN_DIAGNOSTICO,
    ESPERA_REPUESTOS,
    EN_REPARACION,
    LISTO_ENTREGA,
    ENTREGADO,
    CANCELADO
}
