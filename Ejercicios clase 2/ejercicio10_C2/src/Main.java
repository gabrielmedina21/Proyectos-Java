/*
    10.	Realizar un programa que lea por teclado tres números enteros H, M, S que contengan hora,
    minutos y segundos respectivamente, y compruebe si la hora que indican es una hora válida.
 */

import java.util.Scanner;

void main() {
    Scanner sn = new Scanner(System.in);
    int H = 0;
    int M = 0;
    int S = 0;

    System.out.print("\n Ingresar hora: ");
    H = sn.nextInt();
    sn.nextLine();

    System.out.print(" Ingresar minuto: ");
    M = sn.nextInt();
    sn.nextLine();

    System.out.print(" Ingresar segundo: ");
    S = sn.nextInt();
    sn.nextLine();

    sn.close();

    if((H >= 0 && H <= 23) && (M >= 0 && M <= 59) && (S >= 0 && S <= 59)){
        System.out.println("\n Hora ingresada correctamente: " + H + ":" + M + ":" + S);
    }else{
        System.out.println("\n La hora ingresada no es válida.");
    }
}