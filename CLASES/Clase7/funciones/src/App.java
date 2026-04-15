public class App {
    public static void main(String[] args) throws Exception {
        saludar("diego");
       int miNumero = 5;
       cambiarValor(miNumero);
        System.out.print(miNumero);
    }

    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    public static void cambiarValor(int numero) {
        numero = 10;
    }
}
