import java.util.Scanner;

public class App {
    static Scanner sc= new Scanner(System.in);
    static int numeroCuenta=1234;
    static int clave= 2026;
    static double saldo=1000;
    static boolean bandera= false;
    public static void main(String[] args) throws Exception {
        
        login();
        if (bandera) {
            menu();
        }
        
        
        
}
public static void login() {
       
        int intentos=0;
        System.out.println("Bienvenido al cajero automático");
        System.out.println("Ingrese su número de cuenta: ");
        
        int numeroCuentaIngresado= sc.nextInt();
        System.out.println("Ingrese su clave: ");
        int claveIngresada= sc.nextInt();
        
        do {
            if (numeroCuentaIngresado==numeroCuenta && claveIngresada==clave) {
                System.out.println("Acceso concedido. Bienvenido al sistema.");
                bandera= true;
                break;

            } else {
                intentos++;
               if (intentos<3) {
                    System.out.println("Número de cuenta o clave incorrectos. Le quedan " + (3 - intentos) + " intentos.");
                    System.out.println("Ingrese su número de cuenta: ");
                    numeroCuentaIngresado= sc.nextInt();
                    System.out.println("Ingrese su clave: ");
                    claveIngresada= sc.nextInt();
                    
                }
                   
            }
             
        } while (!bandera && intentos<3);
        if (intentos==3) {
            System.out.println("Ha excedido el número máximo de intentos. Su cuenta ha sido bloqueada.");

        
                
            
        }

    }

public static void menu() {
    String opcion
;    do {
    System.out.println("Seleccione una opción:");
    System.out.println("1. Consultar saldo");
    System.out.println("2. Retirar dinero");
    System.out.println("3. Salir");
    opcion= sc.nextLine();
    switch (opcion) {
        case "1":
            consultarSaldo();
            break;
        case "2":
            retirarDinero();
            break;
        case "3":
            salir();
            break;
        default:
            System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            break;
    }
    } while (!opcion.equals("3"));


    
}
public static void consultarSaldo() {
    // Lógica para consultar el saldo
    System.out.println("Su saldo actual es: $" + saldo);
}
public static void retirarDinero() {
    // Lógica para retirar dinero
    System.out.println("Ingrese la cantidad a retirar: ");
    double cantidad= sc.nextDouble();
    if (cantidad>0 && cantidad<=saldo) {
        System.out.println("Ha retirado: $" + cantidad);
        System.out.println("Su saldo actual es: $" + (saldo - cantidad));
        saldo -= cantidad;
    } else {
        System.out.println("Cantidad inválida. No se puede realizar el retiro.");
    }
}
public static void salir() {
    System.out.println("Gracias por usar el cajero automático. ¡Hasta luego!");
}
}
