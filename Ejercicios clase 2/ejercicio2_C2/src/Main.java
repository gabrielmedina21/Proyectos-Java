/*
 2.	Realizar un programa Java que declare una variable A de tipo entero, y le asigne un valor elegido por el
    usuario. A continuación mostrar un mensaje indicando si A es par o impar.
*/

import java.util.Scanner;

void main() {
    int A = 0;
    Scanner sn = new Scanner(System.in);

    System.out.print("\n Ingrese un número entero: ");
    A = sn.nextInt();
    sn.nextLine();
    sn.close();

    System.out.println("\n Número ingresado: " + A);

    if(A %2 == 0){
        System.out.println("\n El número " + A + " es par.");
    }else{
        System.out.println("\n El número " + A + " es impar.");
    }
}
