/*
5.	Realizar un programa Java que declare una variable C de tipo entero y le asigne
    un valor elegido por el usuario. A continuación mostrar un mensaje indicando si
    el valor de C es positivo o negativo, si es par o impar, si es múltiplo de 5,
    si es múltiplo de 10 y si es mayor o menor que 100.
*/

void main() {
    Scanner sn = new Scanner(System.in);
    int C;

    System.out.print("\n Ingrese un número entero: ");
    C = sn.nextInt();
    sn.nextLine();

    sn.close();

    System.out.println("\n Número ingresado: " + C);

    StringBuilder fraseSb = new StringBuilder("\n El número " + C);

    if(C > 0){
        fraseSb.append(" es positivo, ");
    }else{
        fraseSb.append(" es negativo, ");
    }

    if(C %2 == 0){
        fraseSb.append("es par, ");
    }else{
        fraseSb.append("es impar, ");
    }

    if(C %5 == 0){
        fraseSb.append("es múltiplo de 5, ");
    }

    if(C %10 == 0){
        fraseSb.append("es múltiplo de 10, ");
    }

    if(C > 100){
        fraseSb.append("es mayor a 100. ");
    }else{
        fraseSb.append("es menor a 100. ");
    }

    System.out.println(fraseSb);
}
