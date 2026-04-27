package inheritance;

public class Employee extends Person {

    private int idEmpleado;
    private double sueldo;

    public Employee(int idEmpleado, double sueldo, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + " Sueldo: " + this.sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmpleado=" + idEmpleado +
                ", sueldo=" + sueldo +
                ", " + super.toString() +
                '}';
    }
}