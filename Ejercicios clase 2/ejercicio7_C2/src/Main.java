/*
    7.	Realizar un programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
        Cálculo: velocidadMS = velocidadKm * 1000 / 3600;
 */

import java.util.Scanner;

void main() {
    Scanner sn = new Scanner(System.in);
    int velocidadKm = 0;
    int velocidadMs = 0;

    System.out.print("\n Ingrese una velocidad: ");
    velocidadKm = sn.nextInt();
    sn.nextLine();
    sn.close();

    System.out.println("\n Velocidad ingresada: " + velocidadKm + " km/h.");

    velocidadMs = velocidadKm * 1000 / 3600;

    System.out.println("\n Velocidad en m/s: " + velocidadMs);

}