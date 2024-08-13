package Punto7;

import java.time.LocalDate;

public class Prestamo {
    private String ISBNLibro;
    private String identificacionUsuario;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    // Constructor
    public Prestamo(String ISBNLibro, String identificacionUsuario, LocalDate fechaPrestamo) {
        this.ISBNLibro = ISBNLibro;
        this.identificacionUsuario = identificacionUsuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = null;  // Inicialmente sin devolver
    }

    // Registrar devolución
    public void registrarDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    // Getters y Setters
    public String getISBNLibro() {
        return ISBNLibro;
    }

    public void setISBNLibro(String ISBNLibro) {
        this.ISBNLibro = ISBNLibro;
    }

    public String getIdentificacionUsuario() {
        return identificacionUsuario;
    }

    public void setIdentificacionUsuario(String identificacionUsuario) {
        this.identificacionUsuario = identificacionUsuario;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "ISBNLibro='" + ISBNLibro + '\'' +
                ", identificacionUsuario='" + identificacionUsuario + '\'' +
                ", fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucion=" + (fechaDevolucion != null ? fechaDevolucion : "No devuelto") +
                '}';
    }
}

