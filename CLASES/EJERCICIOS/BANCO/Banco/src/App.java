import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        login();
        
}
public static void login() {
    int numeroCuenta=1234;
        int clave= 2026;
        int intentos=0;
        System.out.println("Bienvenido al cajero automático");
        System.out.println("Ingrese su número de cuenta: ");
        Scanner sc= new Scanner(System.in);
        int numeroCuentaIngresado= sc.nextInt();
        System.out.println("Ingrese su clave: ");
        int claveIngresada= sc.nextInt();
        boolean bandera= false;
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
}
