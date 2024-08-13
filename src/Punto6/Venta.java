package Punto6;

import java.time.LocalDate;

public class Venta {
    private LocalDate fecha;
    private Zapato modelo;
    private int talla;
    private int cantidad;
    private double valor;

    // Constructor
    public Venta(Zapato modelo, int talla, int cantidad) {
        this.fecha = LocalDate.now();
        this.modelo = modelo;
        this.talla = talla;
        this.cantidad = cantidad;
        this.valor = calcularTotal();
    }

    // Calcular total de la venta
    public double calcularTotal() {
        return modelo.getPrecio() * cantidad;
    }

    // Imprimir detalle de la venta
    public void imprimirDetalle() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Modelo: " + modelo.getNombre());
        System.out.println("Talla: " + talla);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Valor total: $" + valor);
    }

    public int getTalla() {
        return talla;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Zapato getModelo() {
        return modelo;
    }
}

