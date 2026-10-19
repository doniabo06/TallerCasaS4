package RegistroMotores;

public class Motor {
    private int id;
    private String nombre;
    private double potencia;
    private boolean encendido;

    private static int totalMotores = 0;
    private static int motoresEncendidos = 0;

    public Motor(String nombre, double potencia) {
        totalMotores++;

        this.id = totalMotores;
        this.nombre = nombre;
        this.potencia = potencia;
        this.encendido = false;
    }

    public static int getTotalMotores() {
        return totalMotores;
    }

    public static int getMotoresEncendidos() {
        return motoresEncendidos;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPotencia() {
        return potencia;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Potencia: " + this.potencia);
        System.out.println("Encendido: " + this.encendido);
    }
}
