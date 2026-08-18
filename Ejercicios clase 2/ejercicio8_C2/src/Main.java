/*
    8.	Realizar un programa que lea por teclado un número de 3 cifras y muestra sus cifras por separado.
 */

import java.util.Scanner;

void main() {
    Scanner sn = new Scanner(System.in);
    StringBuilder sb = new StringBuilder("\n Resultado final: ");

    int num = 0;
    int centena = 0;
    int decena = 0;
    int unidad = 0;

    System.out.print("\n Ingrese un número entero de 3 cifras: ");
    num = sn.nextInt();
    sn.nextLine();
    sn.close();

    centena = num / 100;
    decena = (num / 10) % 10;
    unidad = num % 10;

    System.out.println("\n Número ingresado: " + num);

    sb.append(centena + ", ");
    sb.append(decena + ", ");
    sb.append(unidad);

    System.out.println(sb);
}