/*
    12.	Realizar un programa Java que calcule el promedio de un arreglo de números enteros.
        Realizar variantes con arreglos ya inicializados e ingreso por teclado.
 */

import java.util.Scanner;

void main() {
    Scanner sn = new Scanner(System.in);
    int [] arrayIntInic = {17,42,8,56};
    int [] arrayIntIngresoTeclado = new int[5];
    int sumaArrayIntInic = 0;
    int sumaArrayCargaTeclado = 0;
    double promedioArrayInic = 0;
    double promedioArrayCargaTeclado = 0;
    StringBuilder sbArrayIntInic = new StringBuilder("\n Array cargado: ");
    StringBuilder sbArrayIntCargadoTeclado = new StringBuilder("\n Array cargado por teclado: ");

    //muestra el arreglo inicialzado y cargado de forma manual
    for(int num : arrayIntInic){
        sbArrayIntInic.append("[");
        sbArrayIntInic.append(num);
        sbArrayIntInic.append("] ");
        sumaArrayIntInic += num;
    }

    //calcula el promedio del arreglo cargado manualmente
    promedioArrayInic = (double) sumaArrayIntInic / 5;

    System.out.println("\n Ingresar 5 números enteros: \n");

    //carga el arreglo por teclado
    for(int i=0 ; i<arrayIntIngresoTeclado.length ; i++){
        System.out.print(" Ingresar número " + (i+1) + ": ");
        arrayIntIngresoTeclado[i] = sn.nextInt();
        sn.nextLine();
    }

    sn.close();

    //muestra el arreglo cargado por teclado
    for(int copiaNum : arrayIntIngresoTeclado){
        sbArrayIntCargadoTeclado.append("[");
        sbArrayIntCargadoTeclado.append(copiaNum);
        sbArrayIntCargadoTeclado.append("] ");
        sumaArrayCargaTeclado += copiaNum;
    }

    //calcula el promedio del arreglo cargado por teclado
    promedioArrayCargaTeclado = (double) sumaArrayCargaTeclado / arrayIntIngresoTeclado.length;

    System.out.println(sbArrayIntInic);
    System.out.println(" Resultado de la suma del array inicializado: " + sumaArrayIntInic);
    System.out.printf(" Promedio array inicializado: %.2f \n", promedioArrayInic);

    System.out.println(sbArrayIntCargadoTeclado);
    System.out.println(" Resultado de la suma del array cargado por teclado: " + sumaArrayCargaTeclado);
    System.out.printf(" Promedio array cargado por teclado: %.2f \n", promedioArrayCargaTeclado);
}