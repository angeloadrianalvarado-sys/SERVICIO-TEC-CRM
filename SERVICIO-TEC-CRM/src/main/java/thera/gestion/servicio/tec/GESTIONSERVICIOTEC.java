package thera.gestion.servicio.tec;

import thera.gestion.servicio.tec.gestores.*;
import thera.gestion.servicio.tec.personas.*;
import thera.gestion.servicio.tec.equipo.*;
import thera.gestion.servicio.tec.repuestos.*;
import thera.gestion.servicio.tec.ordenes.*;
import thera.gestion.servicio.tec.descuentos.*;
import thera.gestion.servicio.tec.comprobantes.*;
import thera.gestion.servicio.tec.reportes.*;
import thera.gestion.servicio.tec.portal.*;
import thera.gestion.servicio.tec.enums.*;

/**
 * Clase principal del sistema de Gestión de Servicio Técnico.
 * Punto de entrada de la aplicación (método main).
 *
 * Orquesta la instanciación de todos los gestores y demuestra
 * el flujo completo:
 *
 *  1. Registro de cliente, técnico y equipo.
 *  2. Creación de la orden de servicio.
 *  3. Diagnóstico y asignación de técnico.
 *  4. Despacho de repuestos desde inventario.
 *  5. Avance de estados y cierre técnico.
 *  6. Aplicación de descuento por frecuencia.
 *  7. Emisión de comprobante (Boleta o Factura).
 *  8. Emisión de garantía.
 *  9. Consulta del cliente desde el portal CRM.
 */
public class GESTIONSERVICIOTEC {

    public static void main(String[] args) {

        // -------------------------------------------------------
        // 1. INICIALIZAR GESTORES (infraestructura del sistema)
        // -------------------------------------------------------
        GestorServicioTecnico gestorOrdenes  = new GestorServicioTecnico(100);
        GestorClientes        gestorClientes = new GestorClientes(200);
        GestorTecnicos        gestorTecnicos = new GestorTecnicos(20);
        InventarioRepuestos   inventario     = new InventarioRepuestos(50);
        GestorPromociones     gestorPromos   = new GestorPromociones(10);
        PortalCRM             portal         = new PortalCRM(gestorOrdenes);

        // -------------------------------------------------------
        // 2. REGISTRAR PERSONAS Y EQUIPO
        // -------------------------------------------------------
        Cliente cli1 = new Cliente(
            "72938471", "Jorge Ramirez", "981234567", "jorge@gmail.com", "Calle Real 123");

        Tecnico tec1 = new Tecnico(
            "45678901", "Adrian Alvarado", "994567812", "azalva@taller.com", "Laptops y Placas Madre");

        Equipo eq1 = new Equipo(
            "Laptop", "ASUS", "TUF Gaming F15", "SN-998822", "Con cargador, sin caja");

        // -------------------------------------------------------
        // 3. CARGAR INVENTARIO DE REPUESTOS
        // -------------------------------------------------------
        // inventario.registrarRepuesto(new Repuesto(...));

        // -------------------------------------------------------
        // 4. REGISTRAR ORDEN Y PROCESAR SERVICIO
        // -------------------------------------------------------
        OrdenServicio ord = gestorOrdenes.registrarOrden(
            cli1, eq1, "No da imagen en pantalla y calienta en la base");

        // ord.asignarTecnico(tec1, "Admin");
        // ord.registrarDiagnostico("Falla integrado de video", 90.0, tec1.getNombre());

        // -------------------------------------------------------
        // 5. DESPACHAR REPUESTOS DESDE INVENTARIO
        // -------------------------------------------------------
        // Repuesto r1 = inventario.despacharRepuesto("REP-01", 1);
        // if (r1 != null) ord.agregarRepuesto(r1);

        // -------------------------------------------------------
        // 6. AVANZAR ESTADOS DE LA ORDEN
        // -------------------------------------------------------
        // ord.cambiarEstado(EstadoOrden.EN_REPARACION, "Trabajo en curso", tec1.getNombre());
        // ord.cambiarEstado(EstadoOrden.LISTO_ENTREGA, "Pruebas superadas", tec1.getNombre());

        // -------------------------------------------------------
        // 7. APLICAR DESCUENTO POR FRECUENCIA
        // -------------------------------------------------------
        // double totalFinal = gestorPromos.calcularTotalConDescuento(ord, gestorOrdenes);

        // -------------------------------------------------------
        // 8. EMITIR COMPROBANTE (POLIMORFISMO: Boleta o Factura)
        // -------------------------------------------------------
        // ComprobanteBase comprobante = new Boleta("B001-0001", ord, MetodoPago.YAPE, totalFinal, cli1.getId());
        // comprobante.imprimirDetalle();

        // -------------------------------------------------------
        // 9. EMITIR GARANTIA
        // -------------------------------------------------------
        // Garantia garantia = new Garantia("GAR-001", ord, 60, "No cubre daños por humedad");
        // garantia.imprimirCertificado();

        // -------------------------------------------------------
        // 10. PORTAL CLIENTE: SEGUIMIENTO DESDE CODIGO Y DNI
        // -------------------------------------------------------
        // portal.consultarSeguimientoCliente("ORD-1001", "72938471");

        // -------------------------------------------------------
        // 11. GENERAR REPORTES
        // -------------------------------------------------------
        // ReporteOrden rptOrden = new ReporteOrden(ord, tec1.getNombre());
        // rptOrden.imprimirDetalle();

        // ReporteInventario rptInv = new ReporteInventario(inventario, "Admin", 3);
        // rptInv.imprimirDetalle();
    }
}
