/*
1. Realizar un programa que lee por teclado el valor del radio de una circunferencia, calcula y
   muestra por pantalla la longitud y el área de la circunferencia. Cálculo de longitud: 2 * PI * radio,
   cálculo de área: PI * radio^2. Usar la clase Math.
*/

import java.util.Scanner;

void main() {
    Scanner sn = new Scanner(System.in);
    double radio;
    double longitud;
    double area;

    System.out.print("\nIngresar radio: ");
    radio = sn.nextDouble();
    sn.nextLine();

    sn.close();

    longitud = 2 * Math.PI * radio;
    area = Math.PI * Math.pow(radio, 2);

    System.out.println("\nRadio de la circunferencia: " + radio);
    System.out.printf("Longitud de la circunferencia: %.2f \n", longitud);
    System.out.printf("Área de la circunferencia: %.2f\n", area);
}