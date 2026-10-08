package Descuentos;

import Interfaces.ICalculable;

public abstract class GestorPromocionesBase {

    protected int capacidadDescuentos;
    protected int totalDescuentosConfigurados;

    public GestorPromocionesBase(int capacidadDescuentos) {
        this.capacidadDescuentos = capacidadDescuentos;
        this.totalDescuentosConfigurados = 0;
    }

    public abstract Descuento determinarDescuentoAplicable(Object cliente, Object orden);

    public int getCapacidadDescuentos() { return capacidadDescuentos; }

    public int getTotalDescuentosConfigurados() { return totalDescuentosConfigurados; }
}
