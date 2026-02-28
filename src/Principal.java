
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("""
               *************************
                Conversor de bases monetarias:
                1) Pesos argentinos--->Dolares
                2) Dolares----->Pesos argentinos
                Elija el tipo de cambio:
                ************************""" );
        Scanner lectura= new Scanner(System.in);
        int opcion = lectura.nextInt();
        ConsumirAPI consulta = new ConsumirAPI();

        switch(opcion){
            case 1:
                System.out.println("------------Pesos argentinos a dolares estadounidense--------");
                System.out.println("ingrese la cantidad de ARS a convertir:");
                double pesos = lectura.nextDouble();
                double tasa = consulta.obtenerTasa("USD", "ARS");
                double dolares = pesos / tasa;
                DecimalFormat df = new DecimalFormat("#.00");
                System.out.println("Resultado: " + df.format(dolares) + " USD");
                break;
        }

    }
}
