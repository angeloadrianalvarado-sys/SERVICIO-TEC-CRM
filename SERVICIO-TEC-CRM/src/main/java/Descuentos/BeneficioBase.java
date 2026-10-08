package Descuentos;

import Interfaces.ICalculable;

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

    public abstract double obtenerValorBeneficio();

    public String getIdBeneficio() { return idBeneficio; }

    public String getNombreBeneficio() { return nombreBeneficio; }

    public boolean isActivo() { return activo; }
}
