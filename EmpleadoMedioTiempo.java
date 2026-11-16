/**
 * Clase derivada de Empleado.
 * Reutiliza los atributos y métodos de la clase base.
 */
public class EmpleadoMedioTiempo extends Empleado {
    private int horasSemanales;
    private double pagoPorHora;

    public EmpleadoMedioTiempo(String nombre, String puesto, String departamento,
                               double salario, int horasSemanales, double pagoPorHora) {
        super(nombre, puesto, departamento, salario);
        this.horasSemanales = horasSemanales;
        this.pagoPorHora = pagoPorHora;
    }

    // Método exclusivo de la clase EmpleadoMedioTiempo.
    public double calcularPagoSemanal() {
        return horasSemanales * pagoPorHora;
    }

    // Se sobrescribe el método heredado.
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Medio tiempo");
        System.out.println("Horas semanales: " + horasSemanales);
        System.out.printf("Pago por hora: $%.2f%n", pagoPorHora);
        System.out.printf("Pago semanal calculado: $%.2f%n", calcularPagoSemanal());
    }
}
