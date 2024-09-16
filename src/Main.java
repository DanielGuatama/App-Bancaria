import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("BancApp Marvel");

        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion =0;

        System.out.println("**************************************");
        System.out.println("\nNombre del Cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo disponoble es: " + saldo + "$");
        System.out.println("\n*************************************");

        String menu = """
                *** Digite la opcion que desee ***
                1 - Consultar Saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        Scanner teclado =new Scanner(System.in);
        while (opcion !=9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actualizado es: " + saldo + "$");
                    break;
                case 2:
                    System.out.println("¿Cuàl es el valor que desea retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (valorARetirar > saldo) {
                        System.out.println("Saldo Insuficiente");
                    } else {
                        saldo = saldo - valorARetirar;
                        System.out.println("El saldo actualizado es: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("¿Cuàl es el valor que desea depositar");
                    double valorADespositar = teclado.nextDouble();
                    saldo += valorADespositar;
                    System.out.println("El saldo actualizado es: " + saldo);
                    break;
                case 9:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios");
                default:
                    System.out.println("Opciòn no valida");
            }
            }
        }
    }
