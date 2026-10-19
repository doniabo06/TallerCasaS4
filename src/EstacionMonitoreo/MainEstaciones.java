package EstacionMonitoreo;

public class MainEstaciones {
    public static void main(String[] args) {

        Estaciones es1 = new Estaciones("Laboratorio 1", "Temperatura");
        Estaciones es2 = new Estaciones("Laboratorio 2", "Presión");
        Estaciones es3 = new Estaciones("Laboratorio 3", "Humedad");

        // Prueba 1
        System.out.println();
        System.out.println("Estacion 1: " + es1.getId());
        System.out.println("Estacion 2: " + es2.getId());
        System.out.println("Estacion 3: " + es3.getId());
        System.out.println("Total de estaciones: "
                + Estaciones.getTotalEstaciones());

        // Prueba 2
        System.out.println();
        es1.mostrarInformacion();
        es2.mostrarInformacion();
        es3.mostrarInformacion();

        // Prueba 3
        System.out.println();
        es1.actualizarLectura(25.5);
        es2.actualizarLectura(101325);
        es3.actualizarLectura(60);

        es1.mostrarInformacion();
        es2.mostrarInformacion();
        es3.mostrarInformacion();
    }
}
