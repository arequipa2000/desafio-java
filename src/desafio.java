import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        String nombre ="Tony Stark";
        String tipoDeCuenta ="corriente";
        Double saldo = 1599.99;

        System.out.println("********************");
        System.out.println("\nnombre del cliente: "+ nombre);
        System.out.println("Tipo de cuenta es: "+ tipoDeCuenta);
        System.out.println("su Saldo disponible es: "+ saldo+ " S/.");
        System.out.println("\n********************");

        String menu = """
                ***** Escribe el numero de la opcion deseada *******
                1.- consultar saldo
                2.- retirar
                3.- depositar
                9.- salir
                """;

        Scanner teclado = new Scanner(System.in);

        int opcion =0;
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("El saldo actualizado es: " + saldo + " S/.");
                    break;
                case 2:
                    System.out.println("Cual e sel valor a retirar");
                    double valorARetirar = teclado.nextDouble();
                    if (valorARetirar > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldo - valorARetirar;
                        System.out.println("El saldo actualizado es:" + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Cual e sel valor a Depositar");
                    double valorADepositar = teclado.nextDouble();
                    saldo = saldo + valorADepositar;
                    System.out.println("El saldo actualizado es:" + saldo);
                    break;
                case 9:
                    System.out.println("Saliendo del programa. gracias");
                    break;
                default:
                    System.out.println("opcion no valida. intente de nuevo.");
                    break;
            }
        }
    }
}
