package Equipo;

import Base.Elemento;

/**
 * Representa el equipo o dispositivo ingresado para reparación.
 *
 * HERENCIA: extiende Elemento.
 */
public class Equipo extends Elemento {

    private String tipo;
    private String marca;
    private String modelo;
    private String serie;
    private String observaciones;
    private boolean enGarantia;

    public Equipo(String tipo, String marca, String modelo, String serie, String observaciones) {
        super(serie, tipo + " " + marca + " " + modelo);
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.serie = serie;
        this.observaciones = observaciones;
    }

    @Override
    public String getDetalle() { return null; }

    public String getObservaciones() { return null; }

    public void setEnGarantia(boolean enGarantia) { }

    public String getTipo() { return null; }

    public String getMarca() { return null; }

    public String getModelo() { return null; }

    public String getSerie() { return null; }

    public boolean isEnGarantia() { return false; }
}
