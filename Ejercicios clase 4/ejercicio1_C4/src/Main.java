import Clases.Empleado;

void main() {
    Empleado empleado1 = new Empleado("23456345","Carlos", "Gutierrez", 25000);
    Empleado empleado2 = new Empleado("34234123","Ana ", "Sánchez", 27500);

    System.out.println("\nEmpelados cargados:");
    System.out.println(empleado1);;
    System.out.println(empleado2);

    empleado1.aumentarSalario(15);
    double salarioAnual = empleado1.calcularSalarioAnual();
    System.out.printf("\nSalario aumentado un 15%% al empleado %s: $%.2f \n", empleado1.getNombre(), empleado1.getSalario());
    System.out.printf("Salario anual del empleado %s: $%.2f \n" , empleado1.getNombre(), salarioAnual);

}