/*
    9.	Realizar un programa que lea por teclado un número entero N de 5 cifras y muestre las cifras que
        ocupan posiciones impares.
 */

import java.util.Scanner;

void main() {
    Scanner sn = new Scanner(System.in);
    int N = 0;

    System.out.print("\n Ingrese un número de 5 cifras: ");
    N = sn.nextInt();
    sn.nextLine();
    sn.close();

    String numString = String.valueOf(N);

    System.out.println("\n Número ingresado: " + N);
    StringBuilder sb = new StringBuilder("\n Cifras ocupadas en posiciones impares: ");

    for(int i=0 ; i < numString.length() ; i++){
        if((i + 1) % 2 != 0){
            sb.append(" [" + numString.charAt(i) + "]");
        }
    }

    System.out.println(sb);
}