package Descuentos;

import Interfaces.ICalculable;

/**
 * Superclase raíz para cualquier beneficio comercial otorgado a clientes.
 *
 * HIJOS DIRECTOS: Descuento
 */
public abstract class BeneficioBase implements ICalculable {

    protected String idBeneficio;
    protected String nombreBeneficio;
    protected boolean activo;

    public BeneficioBase(String idBeneficio, String nombreBeneficio) {
        this.idBeneficio = idBeneficio;
        this.nombreBeneficio = nombreBeneficio;
        this.activo = true;
    }

    @Override
    public double calcularTotal() { return 0; }

    @Override
    public double calcularSubtotal() { return 0; }

    @Override
    public double aplicarDescuento(double porcentaje) { return 0; }

    /** Retorna el valor nominal o porcentaje del beneficio. (POLIMORFISMO) */
    public abstract double obtenerValorBeneficio();

    public String getIdBeneficio() { return idBeneficio; }

    public String getNombreBeneficio() { return nombreBeneficio; }

    public boolean isActivo() { return activo; }
}
