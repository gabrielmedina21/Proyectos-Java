/*
4.	Realizar un programa Java que encuentre el valor ASCII de un carácter. Para ello, vamos a pedir un
    String al usuario y leer solo el primer carácter, esto lo lograremos con:
    char caracter = scanner.next().charAt(0);
 */

import java.util.Scanner;

void main() {
    Scanner sn = new Scanner(System.in);
    String palabra;

    System.out.print("\n Ingrese una palabra: ");
    palabra = sn.nextLine();

    System.out.println("\n La palabra ingresada es: " + palabra);
    System.out.println("\n El valor ASCII es: " + (int) palabra.charAt(0));

    sn.close();
}
