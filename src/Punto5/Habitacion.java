package Punto5;

public class Habitacion {
    private int numeroHabitacion;
    private double precioPorNoche;
    private boolean disponibilidad;
    private String huespedesAlojados;

    // Constructor para inicializar todos los atributos
    public Habitacion(int numeroHabitacion, double precioPorNoche, boolean disponibilidad, String huespedesAlojados) {
        this.numeroHabitacion = numeroHabitacion;
        this.precioPorNoche = precioPorNoche;
        this.disponibilidad = disponibilidad;
        this.huespedesAlojados = huespedesAlojados;
    }

    // Getters
    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public String getHuespedesAlojados() {
        return huespedesAlojados;
    }

    // Setters
    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void setHuespedesAlojados(String huespedesAlojados) {
        this.huespedesAlojados = huespedesAlojados;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numeroHabitacion=" + numeroHabitacion +
                ", precioPorNoche=" + precioPorNoche +
                ", disponibilidad=" + disponibilidad +
                ", huespedesAlojados='" + huespedesAlojados + '\'' +
                '}';
    }
}

