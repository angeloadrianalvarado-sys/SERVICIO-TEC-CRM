package Descuentos;

import Interfaces.ICalculable;

/**
 * Superclase para gestores de beneficios y promociones.
 *
 * HIJOS DIRECTOS: GestorPromociones
 */
public abstract class GestorPromocionesBase {

    protected int capacidadDescuentos;
    protected int totalDescuentosConfigurados;

    public GestorPromocionesBase(int capacidadDescuentos) {
        this.capacidadDescuentos = capacidadDescuentos;
        this.totalDescuentosConfigurados = 0;
    }

    /** Busca el mejor descuento aplicable según el cliente y la orden. (POLIMORFISMO) */
    public abstract Descuento determinarDescuentoAplicable(Object cliente, Object orden);

    public int getCapacidadDescuentos() { return capacidadDescuentos; }

    public int getTotalDescuentosConfigurados() { return totalDescuentosConfigurados; }
}
