package Main;

import Repuestos.InventarioRepuestos;
import Portal.PortalCRM;
import Personas.Cliente;
import Personas.Tecnico;
import Ordenes.OrdenServicio;
import Gestores.GestorClientes;
import Gestores.GestorServicioTecnico;
import Gestores.GestorTecnicos;
import Equipo.Equipo;
import Descuentos.GestorPromociones;

public class GESTIONSERVICIOTEC {

    public static void main(String[] args) {

        GestorServicioTecnico gestorOrdenes  = new GestorServicioTecnico(100);
        GestorClientes        gestorClientes = new GestorClientes(200);
        GestorTecnicos        gestorTecnicos = new GestorTecnicos(20);
        InventarioRepuestos   inventario     = new InventarioRepuestos(50);
        GestorPromociones     gestorPromos   = new GestorPromociones(10);
        PortalCRM             portal         = new PortalCRM(gestorOrdenes);

        Cliente cli1 = new Cliente(
            "72938471", "Jorge Ramirez", "981234567", "jorge@gmail.com", "Calle Real 123");

        Tecnico tec1 = new Tecnico(
            "45678901", "Adrian Alvarado", "994567812", "azalva@taller.com", "Laptops y Placas Madre");

        Equipo eq1 = new Equipo(
            "Laptop", "ASUS", "TUF Gaming F15", "SN-998822", "Con cargador, sin caja");

        OrdenServicio ord = gestorOrdenes.registrarOrden(
            cli1, eq1, "No da imagen en pantalla y calienta en la base");

    }
}
