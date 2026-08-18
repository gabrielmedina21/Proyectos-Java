/*
2.	Realizar un programa Java que realice lo siguiente: declarar dos variables numX y numY de tipo int,
    dos variables numN y numM de tipo double y asigna a cada una un valor. A continuación mostrar por pantalla
    una serie de operaciones entre ellas.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numX = 0;
        int numY = 0;
        double numN = 0;
        double numM = 0;
        double rtaSuma = 0;
        double rtaResta = 0;
        double rtaMultiplicacion = 0;
        double rtaDivision = 0;
        Scanner sn = new Scanner(System.in);
        int opOperacion = 0;


        System.out.print("\n Ingesar un número entero: ");
        numX = sn.nextInt();
        sn.nextLine();

        System.out.print(" Ingesar un número entero: ");
        numY = sn.nextInt();
        sn.nextLine();

        System.out.print(" Ingesar un número decimal: ");
        numN = sn.nextDouble();
        sn.nextLine();

        System.out.print(" Ingesar un número decimal: ");
        numM = sn.nextDouble();
        sn.nextLine();

        System.out.println("\n -------- VALORES INGRESADOS -------- \n");
        System.out.println(" Numero ingresado 1: " + numX);
        System.out.println(" Numero ingresado 2: " + numY);
        System.out.println(" Numero ingresado 3: " + numN);
        System.out.println(" Numero ingresado 4: " + numM);

        System.out.println("\n SELECCIONE UNA OPERACIÓN PARA REALIZAR: \n");
        System.out.println(" 1. Suma");
        System.out.println(" 2. Resta");
        System.out.println(" 3. Multiplicación");
        System.out.println(" 4. División");
        System.out.println(" 0. Salir");

        System.out.print("\n Ingrese una opción: ");
        opOperacion = sn.nextInt();
        sn.nextLine();

        switch (opOperacion){
            case 1:
                rtaSuma = numX + numY + numN + numM;
                System.out.printf("\n El resultado de la suma es: %.2f \n" , rtaSuma);
                break;

            case 2:
                rtaResta = numX - numY - numN - numM;
                System.out.printf("\n El resultado de la resta es: %.2f \n" , rtaResta);
                break;

            case 3:
                rtaMultiplicacion = numX * numY * numN * numM;
                System.out.printf("\n El resultado de la multiplicación es: %.2f \n" , rtaMultiplicacion);
                break;

            case 4:
                rtaDivision = (double) numX / numY / numN / numM;
                System.out.printf("\n El resultado de la división es: %.2f \n" , rtaDivision);
                break;

            default:
                break;
        }

        sn.close();
    }
}