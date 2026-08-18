/*
11.	Realizar un programa Java que pida por teclado el nombre, edad y salario de una persona, y muestra el
    salario dependiendo de:
        ●	Si es menor de 16 no tiene edad para trabajar
        ●	Entre 19 y 50 años el salario es un 5 por ciento más
        ●	Entre 51 y 60 años el salario es un 10 por ciento más
        ●	Si es mayor de 60 el salario es un 15 por ciento más

 */

import java.util.Scanner;

void main() {
    Scanner sn = new Scanner(System.in);
    String nombre;
    int edad;
    double salario;

    System.out.print("\n Ingresar nombre: ");
    nombre = sn.nextLine();

    System.out.print(" Ingresar edad: ");
    edad = sn.nextInt();
    sn.nextLine();

    StringBuilder sb = new StringBuilder(" Salario total: $");

    if(edad < 16) {
        salario = 0;
        sb.append(salario);
        sb.append("\n\n No tiene edad suficiente para trabajar.");

    }else{
        System.out.print(" Ingresar salario: $");
        salario = sn.nextDouble();
        sn.nextLine();

        if(edad >= 19 && edad <= 50){
            salario *= 1.05;

            sb.append(salario);

        }else if(edad >= 51 && edad <= 60){
            salario *= 1.10;

            sb.append(salario);

        }else if(edad > 60){
            salario *= 1.15;

            sb.append(salario);
        }

        sn.close();
    }

    System.out.println("\n Nombre: " + nombre);
    System.out.println(" Edad: " + edad);
    System.out.println(sb);
}