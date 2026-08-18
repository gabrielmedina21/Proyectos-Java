/*
3.	Realizar un programa Java que declare una variable B de tipo entero y asignarle un valor elegido por
    el usuario. A continuación mostrar un mensaje indicando si el valor de B es positivo o negativo.
 */

import java.util.Scanner;

void main() {
    int B = 0;
    Scanner sn = new Scanner(System.in);

    System.out.print("\n Ingrese un número entero: ");
    B = sn.nextInt();
    sn.nextLine();
    sn.close();

    System.out.println("\n Número ingresado: " + B);

    if(B >= 0){
        System.out.println("\n El número " + B + " es positivo.");
    }else{
        System.out.println("\n El número " + B + " es negativo.");
    }
}
