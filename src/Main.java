public class Main{
    public static void main(String[] args) {
        System.out.println("=== PRUEBA INSTANCIAS DE APLICACIÓN ===");

        aplicacion app = new aplicacion("SistemaVentas", "1.0");
        app.mostrarInformacion();

        System.out.println("\n--- Iniciando aplicación ---");
        app.iniciar();
        app.mostrarInformacion();

        System.out.println("\n--- Cerrando aplicación ---");
        app.cerrar();
        app.mostrarInformacion();

        System.out.println("\nTotal de aplicaciones: " + aplicacion.getTotalAplicaciones());
    }
}