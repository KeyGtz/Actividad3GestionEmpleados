public class EmpleadoTiempoCompleto extends Empleado {
    private int horasSemanales;
    private double bono;

    public EmpleadoTiempoCompleto(String nombre, String puesto, String departamento,
                                  double salario, int horasSemanales, double bono) {
        super(nombre, puesto, departamento, salario);
        this.horasSemanales = horasSemanales;
        this.bono = bono;
    }
    public double calcularSueldoFinal() {
        return salario + bono;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Tiempo completo");
        System.out.println("Horas semanales: " + horasSemanales);
        System.out.printf("Bono: $%.2f%n", bono);
        System.out.printf("Sueldo final: $%.2f%n", calcularSueldoFinal());
    }
}
