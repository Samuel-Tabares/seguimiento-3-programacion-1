package Punto8;

import java.util.ArrayList;
import java.util.List;

public class Concierto {
    private int maxEntradasGeneral;
    private int maxEntradasVIP;
    private List<Entrada> entradasVendidas;

    // Constructor
    public Concierto(int maxEntradasGeneral, int maxEntradasVIP) {
        this.maxEntradasGeneral = maxEntradasGeneral;
        this.maxEntradasVIP = maxEntradasVIP;
        this.entradasVendidas = new ArrayList<>();
    }

    // Verificar disponibilidad
    public boolean hayDisponibilidad(String zona) {
        long entradasVendidasZona = entradasVendidas.stream()
                .filter(e -> e.getZona().equalsIgnoreCase(zona))
                .count();

        if (zona.equalsIgnoreCase("GENERAL")) {
            return entradasVendidasZona < maxEntradasGeneral;
        } else if (zona.equalsIgnoreCase("VIP")) {
            return entradasVendidasZona < maxEntradasVIP;
        }
        return false;
    }

    // Vender entrada
    public void venderEntrada(String zona, double valor) {
        if (hayDisponibilidad(zona)) {
            int numeroEntrada = entradasVendidas.size() + 1;
            Entrada nuevaEntrada = new Entrada(numeroEntrada, zona, valor);
            nuevaEntrada.marcarComoVendida();
            entradasVendidas.add(nuevaEntrada);
            System.out.println("Entrada vendida: " + nuevaEntrada);
        } else {
            System.out.println("No hay disponibilidad en la zona " + zona);
        }
    }

    // Registrar ingreso
    public void registrarIngreso(int numeroEntrada) {
        for (Entrada entrada : entradasVendidas) {
            if (entrada.getNumero() == numeroEntrada) {
                entrada.marcarIngreso();
                System.out.println("Entrada registrada: " + entrada);
                return;
            }
        }
        System.out.println("Entrada no encontrada.");
    }

    // Obtener el total de entradas vendidas
    public int totalEntradasVendidas() {
        return entradasVendidas.size();
    }
}
