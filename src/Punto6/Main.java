package Punto6;

public class Main {
    public static void main(String[] args) {
        // Crear array de Zapatos con 5 modelos distintos
        Zapato[] zapatos = new Zapato[5];
        zapatos[0] = new Zapato("Modelo 1", "Cuero", "Negro", 100.0, "Primavera 2024");
        zapatos[1] = new Zapato("Modelo 2", "Sintético", "Marrón", 80.0, "Otoño 2024");
        zapatos[2] = new Zapato("Modelo 3", "Gamuza", "Azul", 120.0, "Verano 2024");
        zapatos[3] = new Zapato("Modelo 4", "Tela", "Gris", 90.0, "Invierno 2024");
        zapatos[4] = new Zapato("Modelo 5", "Cuero", "Rojo", 110.0, "Primavera 2024");

        // Crear array de Inventario para los modelos
        Inventario[] inventarios = new Inventario[5];
        inventarios[0] = new Inventario(zapatos[0], new int[]{39, 40, 41, 42}, new int[]{10, 15, 20, 25});
        inventarios[1] = new Inventario(zapatos[1], new int[]{39, 40, 41, 42}, new int[]{12, 18, 25, 30});
        inventarios[2] = new Inventario(zapatos[2], new int[]{39, 40, 41, 42}, new int[]{8, 10, 12, 14});
        inventarios[3] = new Inventario(zapatos[3], new int[]{39, 40, 41, 42}, new int[]{20, 22, 24, 26});
        inventarios[4] = new Inventario(zapatos[4], new int[]{39, 40, 41, 42}, new int[]{14, 16, 18, 20});

        // Simular ventas de diferentes modelos/tallas
        Venta venta1 = new Venta(zapatos[0], 40, 2);
        inventarios[0].registrarSalida(40, 2);

        Venta venta2 = new Venta(zapatos[2], 42, 1);
        inventarios[2].registrarSalida(42, 1);

        Venta venta3 = new Venta(zapatos[4], 41, 3);
        inventarios[4].registrarSalida(41, 3);
    }
}