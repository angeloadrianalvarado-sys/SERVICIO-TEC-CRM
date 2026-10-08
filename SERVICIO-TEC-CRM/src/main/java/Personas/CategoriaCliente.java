package Personas;

import Enums.NivelCliente;

public class CategoriaCliente {

    private NivelCliente nivel;
    private double porcentajeDescuento;
    private String descripcionBeneficios;
    private int serviciosMinimosRequeridos;

    public CategoriaCliente(NivelCliente nivel) {
    }

    public void recalcularCategoria(int cantidadServicios) { }

    public String obtenerDescripcionNivel() { return null; }

    public NivelCliente getNivel() { return null; }

    public double getPorcentajeDescuento() { return 0; }

    public String getDescripcionBeneficios() { return null; }

    public int getServiciosMinimosRequeridos() { return 0; }
}
