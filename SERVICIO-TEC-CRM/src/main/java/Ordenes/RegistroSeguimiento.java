package Ordenes;

import Base.RegistroAuditoria;
import Enums.EstadoOrden;

/**
 * Registra cada cambio de estado que ocurre sobre una orden de servicio.
 *
 * HERENCIA: extiende RegistroAuditoria.
 */
public class RegistroSeguimiento extends RegistroAuditoria {

    private EstadoOrden estado;
    private String observacion;

    public RegistroSeguimiento(EstadoOrden estado, String observacion, String responsable) {
        super(responsable, "CAMBIO_ESTADO");
        this.estado = estado;
        this.observacion = observacion;
    }

    @Override
    public String getTextoFormateado() { return null; }

    public EstadoOrden getEstado() { return estado; }

    public String getObservacion() { return observacion; }
}
