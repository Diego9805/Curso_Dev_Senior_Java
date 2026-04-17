import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    static String nombre = "";
    static int edad;

    public static void main(String[] args) throws Exception {
        String nombre = leerNombre(sc);
        int edad = leerEdad(sc);
        boolean esMayor = esMayorA18(edad);
        imprimirRespuesta(esMayor, nombre);
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

    public static boolean esMayorA18(int edad) {

        return edad > 18;
    }

    public static void imprimirRespuesta(boolean esMayor, String nombre) {
        if (esMayor) {
            System.out.println("Bienvenido " + nombre + ", acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}
