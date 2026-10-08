package Enums;

/**
 * Enum que clasifica a los clientes según su nivel de fidelidad
 * basado en la cantidad de servicios registrados.
 *
 * REGULAR    -> 1 visita         (0% descuento)
 * FRECUENTE  -> 2 a 3 visitas    (10% descuento)
 * VIP        -> 4 o más visitas  (20% descuento)
 */
public enum NivelCliente {
    REGULAR,
    FRECUENTE,
    VIP
}
