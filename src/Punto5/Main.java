package Punto5;

public class Main {
    public static void main(String[] args) {
        // Crear un arreglo de habitaciones
        Habitacion[] habitaciones = new Habitacion[5];

        // Inicializar 5 habitaciones con datos de ejemplo usando el constructor
        habitaciones[0] = new Habitacion(101, 100.0, true, "Ninguno");
        habitaciones[1] = new Habitacion(102, 120.0, true, "Ninguno");
        habitaciones[2] = new Habitacion(103, 150.0, false, "Juan Perez");
        habitaciones[3] = new Habitacion(104, 200.0, true, "Ninguno");
        habitaciones[4] = new Habitacion(105, 250.0, false, "Maria Lopez");

        // Recorrer el arreglo y ejecutar los métodos get para imprimir los datos de cada habitación
        System.out.println("Datos de las habitaciones:");
        for (Habitacion habitacion : habitaciones) {
            System.out.println(habitacion);
        }

        // Modificar el precio y la disponibilidad de alguna habitación
        habitaciones[1].setPrecioPorNoche(130.0);
        habitaciones[1].setDisponibilidad(false);

        // Volver a imprimir los datos después de las modificaciones
        System.out.println("\nDatos después de las modificaciones:");
        for (Habitacion habitacion : habitaciones) {
            System.out.println(habitacion);
        }
    }
}
