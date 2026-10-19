package RegistroSensores;

public class MainSensores {

    public static void main (String[] args){

        Sensores sr1 = new Sensores(  "Temperatura", "°C");
        Sensores sr2 = new Sensores(  "Presión", "Pa");
        Sensores sr3 = new Sensores( "Humedad", "%");

        //Prueba 1
        System.out.println();
        System.out.println("Sensor 1: " + sr1.getId());
        System.out.println("Sensor 2: " + sr2.getId());
        System.out.println("Sensor 3: " + sr3.getId());

        //Prueba 2
        System.out.println();
        sr1.mostrarInformacion();
        sr2.mostrarInformacion();
        sr3.mostrarInformacion();

        // Prueba 3
        System.out.println();
        System.out.println( "Cantidad de sensores: " + Sensores.getCantidadSensores());


    }


}
