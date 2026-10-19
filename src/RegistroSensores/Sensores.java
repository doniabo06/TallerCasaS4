package RegistroSensores;

public class Sensores {
    private int id;
    private String tipo;
    private String unidad;
    private double lectura;

    private static int cantidadSensores = 0;


    public Sensores( String tipo, String unidad) {

        cantidadSensores++;

        this.id = cantidadSensores;
        this.tipo = tipo;
        this.unidad = unidad;
        this.lectura = 0;

    }


    public int getId() { return this.id;
    }

    public String getTipo() { return this.tipo;
    }

    public String getUnidad() { return this.unidad;
    }

    public double getLectura() { return this.lectura;
    }

    public void setLectura(double lectura) {
        this.lectura = lectura;
    }

    public static int getCantidadSensores() {
        return cantidadSensores;
    }


    public void mostrarInformacion (){

        System.out.println("ID: " + this.id);
        System.out.println("Tipos: " + this.tipo);
        System.out.println("Lecturas: " + this.lectura + " " + this.unidad);

    }
}
