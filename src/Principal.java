
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        boolean bandera = true;
        do {
            System.out.println("""
                    **************************************
                    Bienvenido/a al 
                     Conversor de bases monetarias:
                     1) Dolar =>> Peso argentino
                     2) Peso argentino =>> Dolar
                     3) Dolar =>> Real Brazileño
                     4) Real Brazileño =>> Dolar
                     5) Dolar =>> Peso Colombiano
                     6) Peso Colombiano =>> Dolar
                     7) Salir
                     Elija la opcion con el tipo de cambio:
                     **************************************""");
            Consultas conversor = new Consultas();
            Scanner lectura = new Scanner(System.in);
            int opcion = lectura.nextInt();
            try {
                switch (opcion) {
                    case 1:
                        System.out.println("------------Dolares estadounidense a Pesos Argentinos--------");
                        System.out.println("ingrese la cantidad de USD a convertir:");
                        double dolares = lectura.nextDouble();
                        conversor.conversionDeMonedas("ARS", "USD", dolares);
                        break;
                    case 2:
                        System.out.println("------------Pesos argentinos a Dolares Estadounidense--------");
                        System.out.println("ingrese la cantidad de ARS a convertir:");
                        double pesos = lectura.nextDouble();
                        conversor.conversionDeMonedas("USD", "ARS", pesos);
                        break;
                    case 3:
                        System.out.println("------------Dolares estadounidense a Real Brazileño--------");
                        System.out.println("ingrese la cantidad de USD a convertir:");
                        double dolares2 = lectura.nextDouble();
                        conversor.conversionDeMonedas("BRL", "USD", dolares2);
                        break;
                    case 4:
                        System.out.println("------------Real brazileño a Dolares estadounidense--------");
                        System.out.println("ingrese la cantidad de BRL a convertir:");
                        double realBRZ = lectura.nextDouble();
                        conversor.conversionDeMonedas("USD", "BRL", realBRZ);
                        break;
                    case 5:
                        System.out.println("------------Dolares estadounidense a Pesos Colombianos--------");
                        System.out.println("ingrese la cantidad de USD a convertir:");
                        double dolares3 = lectura.nextDouble();
                        conversor.conversionDeMonedas("COP", "USD", dolares3);
                        break;
                    case 6:
                        System.out.println("------------Dolares estadounidense a pesos argentinos--------");
                        System.out.println("ingrese la cantidad de COP a convertir:");
                        double pesoCOLOM = lectura.nextDouble();
                        conversor.conversionDeMonedas("USD", "COP", pesoCOLOM);
                        break;
                    case 7:
                        bandera = false;
                        break;
                    default:
                        System.out.println("Elija una opcion valida \n");
                        System.out.println("Presione Enter para continuar...");
                        new Scanner(System.in).nextLine();
                }
            }
            catch (InputMismatchException e){
                System.out.println("Solo se aceptan valores de tipo entero, por favor, intente nuevamente ");
                System.out.println("Presione Enter para continuar...");
                new Scanner(System.in).nextLine();
            }
        } while (bandera==true);
        System.out.println("Gracias por utilizar el conversor de bases monetarias");
    }
}
