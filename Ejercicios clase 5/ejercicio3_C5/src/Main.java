/*
    3. Realizar un programa que calcula el volumen de una esfera. El valor de radio se debe pedir por teclado.
       Cálculo: volumen = 4/3 * PI * radio^3. Usar la clase Math.
 */

import java.util.Scanner;

void main() {
    Scanner sn = new Scanner(System.in);
    double radio;
    double volumen;

    System.out.print("\nIngresar valor del radio: ");
    radio = sn.nextDouble();
    sn.nextLine();

    sn.close();

    volumen = (double) 4 / 3 * Math.PI * Math.pow(radio,3);

    System.out.printf("\nVolumen de la esfera: %.2f \n", volumen);
}