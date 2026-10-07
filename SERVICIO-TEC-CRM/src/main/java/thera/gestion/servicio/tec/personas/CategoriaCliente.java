package thera.gestion.servicio.tec.personas;

import thera.gestion.servicio.tec.enums.NivelCliente;

/**
 * Representa la categoría o nivel de fidelidad que tiene un Cliente
 * en el sistema. Define los beneficios y el porcentaje de descuento
 * asociado a su nivel.
 *
 * COMPOSICIÓN con Cliente: una CategoriaCliente existe porque existe un Cliente.
 * Si el Cliente es eliminado, su categoría también desaparece.
 */
public class CategoriaCliente {

    // Atributos
    private NivelCliente nivel;
    private double porcentajeDescuento;
    private String descripcionBeneficios;
    private int serviciosMinimosRequeridos;

    public CategoriaCliente(NivelCliente nivel) {
    }

    // ----- Métodos -----

    /**
     * Actualiza automáticamente la categoría basándose en la cantidad
     * de servicios que ha registrado el cliente.
     * @param cantidadServicios Número total de órdenes del cliente.
     */
    public void recalcularCategoria(int cantidadServicios) { }

    public String obtenerDescripcionNivel() { return null; }

    // ----- Getters -----

    public NivelCliente getNivel() { return null; }

    public double getPorcentajeDescuento() { return 0; }

    public String getDescripcionBeneficios() { return null; }

    public int getServiciosMinimosRequeridos() { return 0; }
}
