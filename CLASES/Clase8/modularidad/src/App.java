import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    static String nombre="";
    static int edad;
    public static void main(String[] args) throws Exception {
        
        nombre = leerNombre(sc);
        edad = leerEdad(sc);
        permitirAcceso(nombre, edad);
    }

    public static String leerNombre(Scanner lector) {
        System.out.println("Ingrese su nombre ");
        String nombre = lector.nextLine();
        return nombre;
    }

    public static int leerEdad(Scanner lector) {
        System.out.println("Ingrese su edad");
        int edad = lector.nextInt();
        return edad;

    }

    public static void permitirAcceso( String nombre, int edad) {
        if (edad >= 18) {
            System.out.println("Hola " + nombre + ", acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}
