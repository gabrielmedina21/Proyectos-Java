import Clases.Cuenta;
import java.util.Scanner;

void main() {
    Cuenta cuentaBanco = new Cuenta();
    Scanner sn = new Scanner(System.in);
    char continuar = 's';
    int idCuenta;
    int op;
    double balanceActual;
    double monto;

    do{
        System.out.println("\nCARGAR DATOS DE LA CUENTA: \n");

        System.out.print("Ingresar ID: ");
        cuentaBanco.setId(sn.nextInt());
        sn.nextLine();

        idCuenta = cuentaBanco.getId();

        while(idCuenta < 0){
            System.out.println("\nEl id ingresado no es válido.\n");
            System.out.print("Ingresar ID: ");
            idCuenta = sn.nextInt();
            sn.nextLine();

            if(idCuenta > 0){
                cuentaBanco.setId(idCuenta);
            }
        }

        System.out.print("Ingresar nombre: ");
        cuentaBanco.setNombre(sn.nextLine());

        System.out.print("Ingresar balance: ");
        cuentaBanco.setBalance(sn.nextDouble());
        sn.nextLine();

        System.out.println("\nCuenta creada correctamente:");
        System.out.println("\nDatos de la cuenta: ");
        cuentaBanco.mostrarDatosCuentaConID();

        System.out.print("\n\n¿Quieres cargar otra cuenta? s=SI / n=NO: ");
        continuar = sn.nextLine().charAt(0);

    }while (continuar == 's' || continuar == 'S');

    do{
        System.out.println("\nOPERACIONES: \n");
        System.out.println("1. Depositar.");
        System.out.println("2. Retirar efectivo.");
        System.out.println("0. Salir");

        System.out.print("\n Seleccione una opción: ");
        op = sn.nextInt();
        sn.nextLine();

        switch (op){
            case 1:
                System.out.print("\n Ingrese el monto a depositar: ");
                monto = sn.nextDouble();
                sn.nextLine();

                if(monto > 0){
                    cuentaBanco.credito(monto);
                    System.out.println("\nOperación realizada correctamente. \n");
                    System.out.printf("Balance actualizado: $%.2f \n", cuentaBanco.getBalance());
                }else{
                    while(monto < 0){
                        System.out.println("\nEl monto ingresado no es válido.");
                        System.out.print("\n Ingrese el monto a depositar: ");
                        monto = sn.nextDouble();
                        sn.nextLine();

                        if(monto > 0){
                            cuentaBanco.credito(monto);
                            System.out.println("\nOperación realizada correctamente. \n");
                            System.out.printf("Balance actualizado: $%.2f \n", cuentaBanco.getBalance());
                        }
                    }
                }
                break;

            case 2:
                System.out.print("\n Ingrese el monto a retirar: ");
                monto = sn.nextDouble();
                sn.nextLine();

                balanceActual = cuentaBanco.getBalance();

                if(balanceActual > monto){
                    cuentaBanco.debito(monto);
                    System.out.println("\nOperación realizada correctamente. \n");
                    System.out.printf("Balance actualizado: $%.2f \n", cuentaBanco.getBalance());
                }else{
                    System.out.println("\nFondos insuficientes.");
                }
                break;

            case 0:
                break;

            default:
                System.out.println("\nOpción no válida.");
        }

        if(op != 0){
            System.out.print("\n¿Quieres realizar otra operación? s=SI / n=NO ");
            continuar = sn.nextLine().charAt(0);
        }

    }while ((continuar == 's' || continuar == 'S') && (op != 0));

    sn.close();

}