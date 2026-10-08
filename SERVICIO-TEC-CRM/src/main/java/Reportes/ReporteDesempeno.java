package Reportes;

public class ReporteDesempeno extends ReporteGerencial {

    private int ordenesExitosas;
    private int ordenesGarantiaReclamadas;
    private double promedioHorasPorServicio;

    public ReporteDesempeno(String responsable, String periodoAnalisis) {
        super("REPORTE DE PRODUCTIVIDAD Y CALIDAD TECNICA", responsable, periodoAnalisis);
    }

    @Override
    public String generarContenido() { return null; }

    public double calcularTasaEfectividad() { return 0.0; }

    public int getOrdenesExitosas() { return ordenesExitosas; }

    public int getOrdenesGarantiaReclamadas() { return ordenesGarantiaReclamadas; }

    public double getPromedioHorasPorServicio() { return promedioHorasPorServicio; }
}
