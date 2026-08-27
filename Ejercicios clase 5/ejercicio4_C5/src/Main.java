import Clases.Libro;
import java.util.Scanner;

void main() {
    Scanner sn = new Scanner(System.in);
    Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 500, 10);
    Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Marquez", 700, 5);

    System.out.println("\nLibros disponibles:");
    System.out.println(libro1);
    System.out.println(libro2);

    if(libro1.venderCopias(3)){
        System.out.println("\nVenta del libro " + libro1.getTitulo() + " realizada correctamente. \n");
    }else{
        System.out.println("\nCopias del libro " + libro1.getTitulo() + " insuficientes. \n");
    }

    System.out.println("Detalle del libro actualizado:");
    System.out.println(libro1);

    if(libro1.venderCopias(8)){
        System.out.println("\nVenta del libro " + libro2.getTitulo() + " realizada correctamente.\n");
    }else{
        System.out.println("\nCopias del libro " + libro2.getTitulo() + " insuficientes. \n");
    }

    libro2.agregarCopias(5);

    System.out.println("Copias del libro " + libro2.getTitulo() + " agregadas correctamente.");

    System.out.println("\nDetalle del libro actualizado:");
    System.out.println(libro2);
}