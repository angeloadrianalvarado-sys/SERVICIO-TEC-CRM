package Interfaces;

/**
 * Interfaz que define el contrato para generar y mostrar reportes
 * en distintos formatos dentro del sistema.
 */
public interface IReportable {

    /**
     * Imprime un resumen detallado de la entidad en consola.
     */
    void imprimirDetalle();

    /**
     * Genera y retorna un String con el reporte completo de la entidad.
     * @return Texto del reporte formateado.
     */
    String generarReporte();
}
