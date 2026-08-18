/*
    3.	Realizar un programa Java que declare cuatro variables enteras A, B, C y D y se le asigne un valor
        a cada una. A continuación realiza las instrucciones necesarias para que: B tome el valor de C,
        C tome el valor de A, A tome el valor de D, D tome el valor de B.
 */

import java.util.Scanner;

void main() {
    int A = 0;
    int B = 0;
    int C = 0;
    int D = 0;
    int temp = 0;
    Scanner sn = new Scanner(System.in);

    System.out.print("\n Ingrese un valor entero para A: ");
    A = sn.nextInt();
    sn.nextLine();

    System.out.print(" Ingrese un valor entero para B: ");
    B = sn.nextInt();
    sn.nextLine();

    System.out.print(" Ingrese un valor entero para C: ");
    C = sn.nextInt();
    sn.nextLine();
    
    System.out.print(" Ingrese un valor entero para D: ");
    D = sn.nextInt();
    sn.nextLine();

    sn.close();

    System.out.println("\n ------ VALORES INGRESADOS ------ \n");
    System.out.println(" Valor de A: " + A);
    System.out.println(" Valor de B: " + B);
    System.out.println(" Valor de C: " + C);
    System.out.println(" Valor de D: " + D);

    temp = B;
    B = C;
    C = A;
    A = D;
    D = temp;

    System.out.println("\n ------ RESULTADO FINAL ------ \n");
    System.out.println(" Valor de A: " + A);
    System.out.println(" Valor de B: " + B);
    System.out.println(" Valor de C: " + C);
    System.out.println(" Valor de D: " + D);

}
