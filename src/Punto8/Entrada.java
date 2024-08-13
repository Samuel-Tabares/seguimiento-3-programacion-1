package Punto8;

public class Entrada {
    private int numero;
    private String zona; // GENERAL o VIP
    private double valor;
    private boolean vendida;
    private boolean ingresada;

    // Constructor
    public Entrada(int numero, String zona, double valor) {
        this.numero = numero;
        this.zona = zona;
        this.valor = valor;
        this.vendida = false;
        this.ingresada = false;
    }

    // Marcar como vendida
    public void marcarComoVendida() {
        this.vendida = true;
    }

    // Marcar ingreso
    public void marcarIngreso() {
        if (vendida) {
            this.ingresada = true;
        } else {
            System.out.println("La entrada no ha sido vendida.");
        }
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public String getZona() {
        return zona;
    }

    public double getValor() {
        return valor;
    }

    public boolean isVendida() {
        return vendida;
    }

    public boolean isIngresada() {
        return ingresada;
    }

    @Override
    public String toString() {
        return "Entrada{" +
                "numero=" + numero +
                ", zona='" + zona + '\'' +
                ", valor=" + valor +
                ", vendida=" + vendida +
                ", ingresada=" + ingresada +
                '}';
    }
}

