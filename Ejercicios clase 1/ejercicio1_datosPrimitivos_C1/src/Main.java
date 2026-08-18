import java.util.Scanner;

/*
* 1.	Realizar un programa Java que realice lo siguiente: declarar una variable numN de tipo int,
* una variable numA de tipo double y una variable numC de tipo char y asigna a cada una un valor.
* A continuación muestra por pantalla: El valor de cada variable, la suma de numN + numA, la diferencia de
* numA numN, el valor numérico correspondiente al carácter que contiene la variable numC.
*/

public class Main {
    public static void main(String[] args) {
        int numN = 0;
        double numA = 0;
        char numC;
        double rtaSuma = 0;
        double rtaResta = 0;

        Scanner sn = new Scanner(System.in);

        System.out.print("\n Ingrese un número entero: ");
        numN = sn.nextInt();
        sn.nextLine();

        System.out.print(" Ingrese un número decimal: ");
        numA = sn.nextDouble();
        sn.nextLine();

        System.out.print(" Ingrese un caracter: ");
        numC = sn.nextLine().charAt(0);

        sn.close();

        System.out.println("\nNúmero entero ingresado: " + numN);
        System.out.println("Número decimal ingresado: " + numA);
        System.out.println("Caracter ingresado: " + numC);

        rtaSuma = (double) numN + numA;
        rtaResta = (double) numA - numN;


        System.out.println("\n ------ RESULTADOS ------ \n");
        System.out.println("El resultado de la suma es: " + rtaSuma);
        System.out.println("El resultado de la resta es: " + rtaResta);
        System.out.println("El valor asignado al caracter " + numC + " es: " + (int) numC);
    }
}