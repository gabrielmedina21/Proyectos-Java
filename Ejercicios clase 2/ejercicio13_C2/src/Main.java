/*
    13.	Realizar un programa Java que solicite un número al usuario y calcule la suma de todos los números
    naturales, hasta el número recibido inclusive.
 */

import java.util.Scanner;

void main() {
    Scanner sn = new Scanner(System.in);
    int numLimite = 0;
    int suma = 0;

    System.out.print("\n Ingresar un número natural: ");
    numLimite = sn.nextInt();
    sn.nextLine();
    sn.close();

    for(int i=1 ; i<=numLimite ; i++){
        suma += i;
    }

    System.out.println("\n El resultado de la suma, incluyendo el número " + numLimite + " es: " + suma);
}