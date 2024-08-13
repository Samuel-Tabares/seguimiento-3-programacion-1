package Punto7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear algunos libros
        Libro libro1 = new Libro("978-3-16-148410-0", "El Quijote", "Miguel de Cervantes", 1605, "Editorial X", 900, new String[]{"Literatura", "Clásico"});
        Libro libro2 = new Libro("978-0-13-468599-1", "Clean Code", "Robert C. Martin", 2008, "Pearson", 464, new String[]{"Programación", "Software"});
        Libro libro3 = new Libro("978-1-4842-4237-0", "Java Performance", "Scott Oaks", 2020, "O'Reilly", 448, new String[]{"Java", "Optimización"});

        // Crear algunos usuarios
        Usuario usuario1 = new Usuario("Juan Pérez", "12345678", "555-1234");
        Usuario usuario2 = new Usuario("María López", "87654321", "555-4321");

        // Lista de préstamos
        List<Prestamo> prestamos = new ArrayList<>();

        // Simular un préstamo
        Prestamo prestamo1 = new Prestamo(libro1.getISBN(), usuario1.getIdentificacion(), LocalDate.now());
        prestamos.add(prestamo1);

        // Simular devolución
        prestamo1.registrarDevolucion(LocalDate.now().plusDays(14));

        // Simular otro préstamo sin devolución
        Prestamo prestamo2 = new Prestamo(libro2.getISBN(), usuario2.getIdentificacion(), LocalDate.now());
        prestamos.add(prestamo2);

        // Imprimir detalles de los libros
        System.out.println("Detalles de los libros:");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);

        // Imprimir detalles de los usuarios
        System.out.println("\nDetalles de los usuarios:");
        System.out.println(usuario1);
        System.out.println(usuario2);

        // Imprimir detalles de los préstamos
        System.out.println("\nDetalles de los préstamos:");
        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo);
        }
    }
}

