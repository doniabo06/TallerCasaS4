package EstacionMonitoreo;

public class Estaciones {
    private int id;
    private String ubicacion;
    private String variable;
    private double lectura;

    private static int totalEstaciones = 0;

    public Estaciones(String ubicacion, String variable) {
        totalEstaciones++;

        this.id = totalEstaciones;
        this.ubicacion = ubicacion;
        this.variable = variable;
        this.lectura = 0;
    }

    public static int getTotalEstaciones() {
        return totalEstaciones;
    }

    public int getId() {
        return id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getVariable() {
        return variable;
    }

    public double getLectura() {
        return lectura;
    }

    public void actualizarLectura(double nuevaLectura) {
        this.lectura = nuevaLectura;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + this.id);
        System.out.println("Ubicacion: " + this.ubicacion);
        System.out.println("Variable: " + this.variable);
        System.out.println("Lectura: " + this.lectura);
    }
}
