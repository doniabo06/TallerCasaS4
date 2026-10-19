package RegistroMotores;

public class MainMotores {
    public static void main(String[] args) {

        Motor mt1 = new Motor("Motor principal", 15.5);
        Motor mt2 = new Motor("Motor secundario", 10.0);
        Motor mt3 = new Motor("Motor auxiliar", 5.5);

        // Prueba 1
        System.out.println();
        System.out.println("Motor 1: " + mt1.getId());
        System.out.println("Motor 2: " + mt2.getId());
        System.out.println("Motor 3: " + mt3.getId());

        // Prueba 2
        System.out.println();
        mt1.mostrarInformacion();
        mt2.mostrarInformacion();
        mt3.mostrarInformacion();

        // Prueba 3
        System.out.println();
        System.out.println("Total de motores: "
                + Motor.getTotalMotores());
        System.out.println("Motores encendidos: "
                + Motor.getMotoresEncendidos());
    }
}
