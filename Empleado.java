public class Empleado {
    protected String nombre;
    protected String puesto;
    protected String departamento;
    protected double salario;

    public Empleado(String nombre, String puesto, String departamento, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Puesto: " + puesto);
        System.out.println("Departamento: " + departamento);
        System.out.printf("Salario base: $%.2f%n", salario);
    }
}
