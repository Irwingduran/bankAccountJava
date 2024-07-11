import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        String Nombre = "Juan Alberto";
        String TipoDeCuenta = "Corriente";
        double SaldoDeCuenta = 1599.99;
        int opcion = 0;

        System.out.println("*********************");

        System.out.println("\nNombre: " + Nombre);
        System.out.println("Tipo de Cuenta: " + TipoDeCuenta);
        System.out.println("Saldo Actual: " + "$" + SaldoDeCuenta);

        System.out.println("\n*********************");

        String menu = """
                Escribe la opción que deseas ejecutar:
                1.- Consultar Saldo
                2.- Retirar
                3.- Depositar
                9.- Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actualizado es: " + "$" + SaldoDeCuenta);
                    break;
                case 2:
                    System.out.println("¿Cuanto deseas retirar? ");
                    double CantidadARetirar = teclado.nextDouble();
                    if (CantidadARetirar > SaldoDeCuenta ){
                        System.out.println("Saldo insuficiente");
                    }else{
                        SaldoDeCuenta = SaldoDeCuenta - CantidadARetirar;
                        System.out.println("El saldo actualizado es: " + SaldoDeCuenta);
                    }
                    break;
                case 3:
                    System.out.println("¿Que cantidad deseas depositar? ");
                    double CantidadADepositar = teclado.nextDouble();
                    SaldoDeCuenta += CantidadADepositar;
                    System.out.println("El saldo actualizado es: " + "$" + SaldoDeCuenta);
                    break;
                case 9:
                    System.out.println("Gracias por consultar, nos vemos luego");
                    break;
                default:
                    System.out.println("Opcion no valida, intente de nuevo");
                    break;
            }

        }

        }

}
