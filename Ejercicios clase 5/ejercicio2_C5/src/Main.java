/*
    2.	Realizar un programa que lea la longitud de los catetos de un triángulo rectángulo y calcule la
        longitud de la hipotenusa según el teorema de Pitágoras. Usar la clase Math.
 */

import java.util.Scanner;

void main() {
    Scanner sn = new Scanner(System.in);
    double cateto1;
    double cateto2;
    double hipotenusa;

    System.out.print("\nIngresar longitud del cateto 1: ");
    cateto1 = sn.nextDouble();
    sn.nextLine();

    System.out.print("Ingresar longitud del cateto 2: ");
    cateto2 = sn.nextDouble();
    sn.nextLine();

    sn.close();

    hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

    System.out.printf("\nLongitud del cateto 1: %.2f \n", cateto1);
    System.out.printf("Longitud del cateto 2: %.2f \n", cateto2);
    System.out.printf("Longitud de la hipotenusa: %.2f \n", hipotenusa);
}