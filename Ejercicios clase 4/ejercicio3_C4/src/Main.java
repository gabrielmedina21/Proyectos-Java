import java.util.Scanner;
import Clases.ItemVenta;

void main() {
    Scanner sn = new Scanner(System.in);
    ItemVenta item = new ItemVenta();
    char continuar = 's';
    int op;

    System.out.println("\n BIENVENIDO A LA TIENDA...!!! \n");

    do{
        System.out.println("1. Agregar item.");
        System.out.println("2. Ver item.");
        System.out.println("3. Actualizar cantidad.");
        System.out.println("4. Actualizar precio unitario.");
        System.out.println("5. Ver precio total.");
        System.out.println("0. Salir.");

        System.out.print("\nSeleccione una opción: ");
        op = sn.nextInt();
        sn.nextLine();

        switch (op) {
            case 1:
                System.out.println("\n CARGANDO ITEM... \n");

                System.out.print("Ingresar id: ");
                item.setId(sn.nextInt());

                int idItem = item.getId();

                while(idItem <= 0){
                    System.out.println("\n ID ingresado no válido.");
                    System.out.print("\nIngresar id: ");
                    item.setId(sn.nextInt());
                    sn.nextLine();

                    idItem = item.getId();

                    if(idItem > 0){
                        item.setId(idItem);
                    }
                }

                System.out.print("Ingresar descripción: ");
                item.setDescripcion(sn.next());

                System.out.print("Ingresar cantidad: ");
                item.setCantidad(sn.nextInt());
                sn.nextLine();

                System.out.print("Ingresar precio unitario: $");
                item.setPrecioUnitario(sn.nextDouble());
                sn.nextLine();

                System.out.println("\n Item cargado correctmaente: \n");

                break;

            case 2:
                System.out.println("\nDATOS DEL ITEM:");
                System.out.println(item);
                System.out.println("\n");
                break;

            case 3:
                int nuevaCantidad;

                System.out.print("\nIngresar nueva cantidad: ");
                nuevaCantidad = sn.nextInt();

                while(nuevaCantidad < 0) {
                    System.out.println("La cantidad ingresada no es válida. \n");

                    System.out.println("\nIngresar nueva cantidad: ");
                    nuevaCantidad = sn.nextInt();
                }

                item.setCantidad(nuevaCantidad);
                System.out.println("\nCantidad actualizada correctamente. \n");
                break;

            case 4:
                double nuevoPrecioUnitario;

                System.out.print("\nIngresar nuevo precio unitario: $");
                nuevoPrecioUnitario = sn.nextDouble();
                sn.nextLine();

                while(nuevoPrecioUnitario <= 0) {
                    System.out.println("El precio unitario no es válido. \n");

                    System.out.print("\nIngresar nuevo precio unitario: $");
                    nuevoPrecioUnitario = sn.nextDouble();
                    sn.nextLine();
                }

                item.setPrecioUnitario(nuevoPrecioUnitario);
                System.out.println("\nPrecio unitario actualizado correctamente. \n");
                break;

            case 5:
                double precioTotal = item.calcularPrecioTotal();

                System.out.printf("\nEl precio total es de: $%.2f \n\n" , precioTotal);
                break;

            case 0:
                break;

            default:
                System.out.println("Opción ingresada no válida. \n");
        }

        if(op != 0){
            String rta;
            System.out.print("¿Quieres realizar otra operación? s=SI / n=NO: ");
            rta = sn.next();

            if(!rta.isEmpty()){
                continuar = rta.charAt(0);
            }

            System.out.println("\n");
        }

    }while ((continuar == 's' || continuar == 'S') && (op != 0));

}