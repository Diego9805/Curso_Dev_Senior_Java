package CLASE3;

import java.util.Scanner;

public class PrecioCompra {
    public static void main(String[] args) {
        /*
         * En el mercado, podemos encontrar que el precio del producto Pernil Iberic
         * D'Engreix Llen. Azuaga en porción de 100 gramos cuesta 5,95€ y el vendedor
         * nos dice que el precio por kilo cuesta 29,75€. ¿Crees que es correcto el
         * precio?
         * 
         * En este reto tienes que hacer un programa que calcule correctamente el precio
         * por kilo del producto.
         */
        var precioProducto = 5.95f / 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique la cantidad en Kilos a comprar");
        var kilos = sc.nextDouble();

        var cantidadEnKilos = kilos * 1000;
        var total = precioProducto * cantidadEnKilos;
        System.out.printf("El precio total es: %.2f", total);

    }
}
