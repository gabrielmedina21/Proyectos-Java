package Clases;

public class Empleado {

    private String nombre;
    private String apellido;
    private String dni;
    private double salario;


    public Empleado(String dni, String nombre, String apellido, double salario){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double porcentaje) {
        salario += salario * porcentaje / 100;
    }

    public double calcularSalarioAnual() {
        double salarioAnual;

        salarioAnual = salario * 12;

        return salarioAnual;
    }

    @Override
    public String toString() {
        return "Empleado" + "[dni=" + this.dni + ", " +
                "nombre=" + this.nombre + ", " +
                "apellido=" + this.apellido + ", " +
                "salario=$" + this.salario + "]";

    }

}
