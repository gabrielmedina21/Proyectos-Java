/*
    6.	Realizar un programa Java que lea un nombre y muestre por pantalla: “Buenos días, {NOMBRE}”.
 */

import java.util.Scanner;

void main() {
    Scanner sn = new Scanner(System.in);
    String nombre = "";
    StringBuilder mensajeSb = new StringBuilder("\n Buenos dias ");

    System.out.print("\n Ingrese un nombre: ");
    nombre = sn.nextLine();
    sn.close();

    mensajeSb.append(nombre);

    System.out.println(mensajeSb);
}