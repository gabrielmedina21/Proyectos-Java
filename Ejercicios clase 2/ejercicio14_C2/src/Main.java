/*
    14.	Realizar un programa Java que lea por teclado 20 temperaturas correspondientes a un mes y calcule
    el máximo, el mínimo y el promedio. Utilizar un array double.
 */

import java.util.Scanner;

void main() {
    Scanner sn = new Scanner(System.in);
    int i;
    double [] arrayTemps = new double[20];
    double sumaTemps = 0;
    double tempMax = 0;
    double tempMin = 0;
    double promTemps = 0;
    StringBuilder sbTemps = new StringBuilder("\n Temperaturas cargadas: ");

    System.out.println("\n Ingresar 20 temperaturas: \n");

    //carga el arreglo de temperaturas
    for(i=0 ; i<arrayTemps.length ; i++){
        System.out.print(" Ingresar temperatura " + (i+1) + ": ");
        arrayTemps[i] = sn.nextDouble();
        sn.nextLine();
    }

    sn.close();

    //se asume que la temperatura máxima y mínima están en la pos 0
    tempMax = arrayTemps[0];
    tempMin = arrayTemps[0];

    //busca la temperatura máxima, minima y suma las temperaturas
    for(double temperatura : arrayTemps){
        sumaTemps += temperatura;

        if(temperatura > tempMax){
            tempMax = temperatura;
        }

        if(temperatura < tempMin){
            tempMin = temperatura;
        }

        //va agregando el string en el stringBuilder
        sbTemps.append("[");
        sbTemps.append(temperatura);
        sbTemps.append("] ");
    }

    promTemps = sumaTemps / arrayTemps.length; //calcula el promedio de las temperaturas

    System.out.println(sbTemps); //muestra el arrego de temperaturas por pantalla
    System.out.println(" La temperatura máxima es: " + tempMax);
    System.out.println(" La temperatura mínima es: " + tempMin);
    System.out.printf(" El promedio es: %.2f \n\n" , promTemps);
}