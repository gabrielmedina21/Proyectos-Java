/*
1.	Realizar un programa Java que declare una variable entera N y se le asigne un valor elegido por el usuario.
    A continuación escribe las instrucciones para que el programa realice lo siguiente: incrementar N en 77,
    reducir su valor a 3, duplicar su valor. Mostrar por pantalla los tres valores.
 */

import java.util.Scanner;

void main() {
    int N = 0;
    int rta = 0;
    Scanner sn = new Scanner(System.in);

    System.out.print("\n Ingrese un valor entero: ");
    N = sn.nextInt();
    sn.nextLine();
    sn.close();

    rta  = N + 77;
    System.out.println("\n Valor " + N + " aumentado en 77: " + rta);

    rta = N - 3;
    System.out.println(" Valor " + N + " reducido en 3: " + rta);

    rta = N * 2;
    System.out.println(" Valor " + N + " duplicado: " + rta);
}

