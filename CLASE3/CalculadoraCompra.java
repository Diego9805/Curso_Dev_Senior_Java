package CLASE3;

import java.util.Scanner;

public class CalculadoraCompra {
    public static void main(String[] args) {
        final double TASA_IMPUESTO = 0.15;
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique El precio unitario del artículo puede ser decimal");
        var precioUnitario = sc.nextDouble();
        System.out.println("Indique La cantidad de artículos comprados ");
        var cantidadArticulos = sc.nextInt();
        System.out.print("Ingrese la cantidad pagada por el cliente: ");
        var cantidadPagada = sc.nextDouble();
        sc.nextLine();
        var subtotal = precioUnitario * cantidadArticulos;
        var montoImpuesto = subtotal * TASA_IMPUESTO;
        var totalCompra = subtotal + montoImpuesto;
        var cambio = cantidadPagada - totalCompra;

        System.out.println("\n--- Resumen de la Compra ---");

        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Impuesto (%.0f%%): $%.2f%n", TASA_IMPUESTO * 100, montoImpuesto);
        System.out.printf("Total de la compra: $%.0f%n", totalCompra);
        System.out.printf("Cantidad Pagada: $%.2f%n", cantidadPagada);
        System.out.printf("Cambio: $%.2f%n", cambio);
        System.out.println("----------------------------");

        System.out.println("¡Gracias por su compra!");
        sc.close();
    }
}