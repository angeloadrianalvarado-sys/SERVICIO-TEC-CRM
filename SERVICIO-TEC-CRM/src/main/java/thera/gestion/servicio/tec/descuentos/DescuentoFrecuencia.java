package thera.gestion.servicio.tec.descuentos;

import thera.gestion.servicio.tec.personas.ClienteBase;

/**
 * Descuento por fidelidad y visitas acumuladas del cliente.
 *
 * HERENCIA: extiende DescuentoDirecto.
 */
public class DescuentoFrecuencia extends DescuentoDirecto {

    private ClienteBase cliente;
    private int frecuenciaDelCliente;

    public DescuentoFrecuencia(ClienteBase cliente, int frecuenciaDelCliente) {
        super("DESC-FREC", "Descuento por fidelidad", 0.0, "Frecuencia de servicios");
        this.cliente = cliente;
        this.frecuenciaDelCliente = frecuenciaDelCliente;
    }

    @Override
    public double calcularMontoDescuento(double montoBase) { return 0; }

    @Override
    public boolean esAplicable() { return false; }

    @Override
    public String obtenerTipoDescuento() { return "DESCUENTO_FRECUENCIA"; }

    public double determinarPorcentajePorFrecuencia() { return 0; }

    public int getFrecuenciaDelCliente() { return frecuenciaDelCliente; }

    public ClienteBase getCliente() { return cliente; }
}
