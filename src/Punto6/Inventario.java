package Punto6;

public class Inventario {
    private Zapato modelo;
    private int[] tallas; // Por simplicidad, supondremos que las tallas son índices del arreglo
    private int[] cantidades;

    // Constructor
    public Inventario(Zapato modelo, int[] tallas, int[] cantidades) {
        this.modelo = modelo;
        this.tallas = tallas;
        this.cantidades = cantidades;
    }

    // Registrar entrada de stock
    public void registrarEntrada(int talla, int cantidad) {
        for (int i = 0; i < tallas.length; i++) {
            if (tallas[i] == talla) {
                cantidades[i] += cantidad;
                break;
            }
        }
    }

    // Registrar salida de stock
    public void registrarSalida(int talla, int cantidad) {
        for (int i = 0; i < tallas.length; i++) {
            if (tallas[i] == talla) {
                if (cantidades[i] >= cantidad) {
                    cantidades[i] -= cantidad;
                } else {
                    System.out.println("No hay suficiente stock para la talla " + talla);
                }
                break;
            }
        }
    }

    // Obtener información del inventario
    public void imprimirInventario() {
        System.out.println("Inventario del modelo: " + modelo.getNombre());
        for (int i = 0; i < tallas.length; i++) {
            System.out.println("Talla " + tallas[i] + ": " + cantidades[i] + " unidades");
        }
    }
}
