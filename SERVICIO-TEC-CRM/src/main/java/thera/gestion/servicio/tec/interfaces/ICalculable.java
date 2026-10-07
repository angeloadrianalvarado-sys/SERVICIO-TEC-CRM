package thera.gestion.servicio.tec.interfaces;

/**
 * Interfaz que define el contrato de cálculo financiero
 * para órdenes, comprobantes y descuentos.
 */
public interface ICalculable {

    /**
     * Calcula y retorna el monto total (incluyendo todos los componentes).
     * @return Total calculado.
     */
    double calcularTotal();

    /**
     * Calcula y retorna el subtotal antes de impuestos o descuentos.
     * @return Subtotal calculado.
     */
    double calcularSubtotal();

    /**
     * Aplica un descuento al monto y retorna el resultado final.
     * @param porcentaje Porcentaje de descuento a aplicar (0.0 a 1.0).
     * @return Monto con descuento aplicado.
     */
    double aplicarDescuento(double porcentaje);
}
