public class Main {
    public static void main(String[] args) {

        EmpleadoTiempoCompleto empleado1 = new EmpleadoTiempoCompleto(
                "Laura Gómez", "Gerente", "Administración", 18000, 40, 1500);

        EmpleadoTiempoCompleto empleado2 = new EmpleadoTiempoCompleto(
                "Carlos Hernández", "Desarrollador", "Sistemas", 16000, 40, 1200);

        EmpleadoMedioTiempo empleado3 = new EmpleadoMedioTiempo(
                "Ana López", "Auxiliar", "Ventas", 8000, 20, 120);

        System.out.println("===== GESTIÓN DE EMPLEADOS =====");

        System.out.println("\n--- Empleado 1 ---");
        empleado1.mostrarInformacion();

        System.out.println("\n--- Empleado 2 ---");
        empleado2.mostrarInformacion();

        System.out.println("\n--- Empleado 3 ---");
        empleado3.mostrarInformacion();

        System.out.println("\nLa herencia se comprobó al reutilizar los datos y");
        System.out.println("el método mostrarInformacion() de la clase Empleado.");
    }
}
