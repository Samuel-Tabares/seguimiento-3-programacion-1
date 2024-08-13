package Punto8;

public class Main {
    public static void main(String[] args) {
        // Crear un concierto con 3 entradas generales y 2 VIP disponibles
        Concierto concierto = new Concierto(3, 2);

        // Verificar disponibilidad y vender entradas
        System.out.println("Disponibilidad GENERAL: " + concierto.hayDisponibilidad("GENERAL"));
        concierto.venderEntrada("GENERAL", 50.0);
        concierto.venderEntrada("GENERAL", 50.0);
        concierto.venderEntrada("GENERAL", 50.0);
        concierto.venderEntrada("GENERAL", 50.0); // Esta no debería poder venderse

        System.out.println("\nDisponibilidad VIP: " + concierto.hayDisponibilidad("VIP"));
        concierto.venderEntrada("VIP", 100.0);
        concierto.venderEntrada("VIP", 100.0);
        concierto.venderEntrada("VIP", 100.0); // Esta no debería poder venderse

        // Simular ingreso de algunas entradas
        System.out.println("\nRegistro de ingreso:");
        concierto.registrarIngreso(1); // Debe funcionar
        concierto.registrarIngreso(4); // No debería encontrar la entrada

        // Imprimir total de entradas vendidas
        System.out.println("\nTotal de entradas vendidas: " + concierto.totalEntradasVendidas());
    }
}

