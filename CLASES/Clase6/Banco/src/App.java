import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);
    static boolean next = false; // bandera
    static int cuentaReal = 12345;
    static int claveReal = 1234;
    static double saldo = 1_000_000d;

    public static void main(String[] args) throws Exception {
        login();
        if (next == true) {
            menu();
        }

    }

    public static void login() {
        boolean loginExitoso = false; // bandera
        int intentos = 0;
        int cuenta, clave;

        do {
            System.out.print("Escriba su número de cuenta: ");
            cuenta = sc.nextInt();

            System.out.print("Escriba su clave: ");
            clave = sc.nextInt();

            if (cuenta == cuentaReal && clave == claveReal) {
                System.out.println("Ingresando al sistema con la cuenta " + cuenta);
                loginExitoso = true;
                next = true;

            } else {
                System.out.println("Clave o usuario incorrecta");
                intentos++;
            }

        } while (loginExitoso == false && intentos < 3);

        if (intentos == 3) {
            System.out.println("Cuenta bloqueada");
        }

        sc.nextLine();

    }

    public static void transferencia() {

        // transferir dinero
        System.out.println("escriba el número de cuenta destino");
        String cuentaDestino = sc.nextLine();
        System.out.println("monto a transferir");
        double montoTransferir = sc.nextDouble();
        if (montoTransferir < 0 || montoTransferir > saldo) {
            System.out.println("el monto no puede ser menor o igual a 0 o superar el saldo actual");

        } else {
            saldo = saldo - montoTransferir;
            System.out.println("su saldo nuevo es: " + saldo);

        }
        sc.nextLine();

    }

    public static void retiro() {
        System.out.println("Digite el monto a retirar");
        double montoRetirar = sc.nextDouble();
        if (montoRetirar < 0 || montoRetirar > saldo) {
            System.out.println("el monto no puede ser menor o igual a 0 o superar el saldo actual");

        } else {
            saldo = saldo - montoRetirar;
            System.out.println("su saldo nuevo es: " + saldo);

        }
        sc.nextLine();

    }

    public static void menu() {

        String opcion;

        do {

            System.out.println("1. Consultar saldo");
            System.out.println("2. transferir dinero");
            System.out.println("3. retirar dinero");
            System.out.println("4. salir");

            System.out.println("Opción: ");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    // consultar saldo
                    System.out.println("su saldo actual es: " + saldo);

                    break;
                case "2":
                    transferencia();

                    break;

                case "3":
                    // retirar dinero
                    retiro();
                    break;

                case "4":
                    // salir
                    System.out.println("Saliendo del sistema bancario");
                    break;

                default:
                    System.out.println("opcion invalidad.eelija entre 1-4");
                    break;
            }

        } while (!opcion.equals("4"));

    }

}
