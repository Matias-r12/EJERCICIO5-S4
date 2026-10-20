public class aplicacion {
    private int id;
    private String nombre;
    private String version;
    private boolean ejecutando;
    private static int totalAplicaciones = 0;

    public aplicacion(String nombre, String version) {
        totalAplicaciones++;
        this.id = totalAplicaciones;
        this.nombre = nombre;
        this.version = version;
        this.ejecutando = false;
    }

    public void iniciar() {
        this.ejecutando = true;
    }

    public void cerrar() {
        this.ejecutando = false;
    }

    public static int getTotalAplicaciones() {
        return totalAplicaciones;
    }

    public void mostrarInformacion() {
        System.out.println("App ID: " + id + " | Nombre: " + nombre + " | Versión: " + version + " | Ejecutando: " + ejecutando);
    }
}
